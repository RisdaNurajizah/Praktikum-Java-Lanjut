package sesi1;

public class Person2 {
    String name;
    String address;
    int age;

    public void display(){
        System.out.println("Name   : " + name + "\nAge    : " + age);
    }
    public void displayAddress(){
        System.out.println("Alamat : " + address);
    }

    public static void main(String[] args){
        Person2 person = new Person2();
        person.name="Risda";
        person.age=19;
        person.address="Kp. Petak";
        person.display();
        person.displayAddress();;
    }
}
