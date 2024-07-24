package sesi5;

abstract class Animal {
        // Method
        public abstract void sound(); 
    }

    class Dog extends Animal{
        @Override
        public void sound(){
            System.out.println("Dog barks");
        }
    }

public class MainAnimal{
    public static void main(String[] args){
        Animal myDog = new Dog();
        myDog.sound();
    }
}
