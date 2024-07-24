package sesi5;

interface Edible {
    // abstract Method
    String howToEat();
}

class Apple implements Edible {
    @Override
    public String howToEat() {
        return "Make apple cider";
    }
}

public class MainEdible {
    public static void main(String[] args) {
        Edible edible = new Apple();

        System.out.println(edible.howToEat());
    }
}
