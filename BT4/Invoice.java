package BT4;

public class Invoice extends Customer{
    int id;
    Customer customer;
    double amount;

    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    @Override
    public int getId(){
        return this.id;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public double getAmount(){
        return this.amount;
    }

    public int getCustomerID(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return getAmount() - getAmount() * customer.getDiscount() / 100;
    }

    @Override
    public String toString(){
        return  String.format("Invoice[id=%d,customer=%s,amount=%.3f]",getId(), getCustomer(), getAmount());
    }

    public static void main(String[] args) {
        Customer cs8 = new Customer(88, "Tan Ah Tech", 8);
        Customer cs10 = new Customer(88, "Tan Ah Tech", 10);
        System.out.println(cs10.toString() + "\n"
                + cs8.toString()
                + "\nID is: " + cs8.getId()
                + "\nName is: " + cs8.getName()
                + "\nDiscount is: " + cs8.getDiscount());

        Invoice inv8 = new Invoice(101, cs8, 888.8);
        Invoice inv9 = new Invoice(101, cs8, 999.9);
        System.out.println("\nId is: " + inv9.getId()
                + "\nCustomer is: " + inv9.getCustomer()
                + "\nAmount is: " + inv9.getAmount()
                + "\nCustomer's id is: " + inv9.getCustomerID()
                + "\nCustomer's name is: " + inv9.getCustomerName()
                + "\nCustomer's discount is: " + inv9.getCustomerDiscount()
                + "\nAmount after discount is: " + inv9.getAmountAfterDiscount());
    }
}
