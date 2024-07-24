package sesi4;

public class Animal {
    public void sound(){
        System.out.println("Animal makes a sound");
    }

    public static class Dog extends Animal{
        public void sound(){
            System.out.println("Dog barks");
    }
}
    public static void main(String[] args){
        Animal myDog = new Dog();
        myDog.sound();
    }
}


