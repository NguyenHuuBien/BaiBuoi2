package BT4;

public class Customer {
    int id;
    String name;
    int discount;

    public Customer(){}

    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getDiscount(){
        return this.discount;
    }

    public String toString(){
        return String.format("%s(%d)(%d", getName(), getId(), getDiscount()) + "%)";
    }

//    public static void main(String[] args) {
//        Customer cs = new Customer(123, "Bien", 5);
//        System.out.println(cs.toString());
//    }
}
