package BT3;

public class Book extends Author{
    String name;
    Author author;
    double price;
    int qty = 0;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author =author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author =author;
        this.price = price;
        this.qty = qty;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String getName(){
        return this.name;
    }

    public Author getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQty(){
        return this.qty;
    }

    @Override
    public String toString(){
        return String.format("[Book[name=%s,%s,price=%s,qty=%s]", getName(), getAuthor(), getPrice(), getQty());
    }

    public static void main(String[] args) {
        Author author = new Author("Bien", "Bien@111", 'm');
        Book book = new Book("SGK", author, 10.000, 5);
        System.out.println(book.toString());
    }
}
