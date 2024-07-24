package sesi1;

public class PersonEncapsulation {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public static void main(String[] args){
        PersonEncapsulation person = new PersonEncapsulation();
        person.setName("Risda");
        person.setAge(19);
        System.out.println("Name : " + person.getName() + "\nAge  : " + person.getAge());
    }
}