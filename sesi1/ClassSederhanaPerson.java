package sesi1;

public class ClassSederhanaPerson {
    String name;
    int age;

    public void display(){
        System.out.println("Name : " + name + "\nAge  : " + age);
    }

    public static void main(String[] args){
        ClassSederhanaPerson person = new ClassSederhanaPerson();
        person.name="Risda";
        person.age=19;
        person.display();
    }
}
