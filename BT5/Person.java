package BT5;

public class Person {
    String name;
    String address;

    public Person(){}

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public String toString(){
        return String.format("Person[name=%s, address=%s]", getName(), getAddress());
    }

}
