package sesi5;

interface Edible{
    // Mendeklarasikan Method abstract howToEat
    String howToEat();
}

// Class Apple mengimplementasokan interface Edible
class Apple implements Edible{
    @Override
    public String howToEat(){
        return "Make apple cider";
    }
}

// class Orange mengimplementasikan interface Edible
class Orange implements Edible{
    @Override
    public String howToEat(){
        return "Peel and eat fresh";
    }
}

// class Chicken mengimplementasikan interface Edible
class Chicken implements Edible{
    @Override
    public String howToEat(){
        return "Grill or fry";
    }
} 

// Main class (kelas utama) untuk menjalankan program
public class EdibleMain {
    public static void main(String[] args) {
        // Membuat instance dari setiap class yang mengimplemtasikan Edible
        Edible apple = new Apple();
        Edible orange = new Orange();
        Edible chicken = new Chicken();

        // Mencetak hasil
        System.out.println("Apple   : " + apple.howToEat());
        System.out.println("Orange  : " + orange.howToEat());
        System.out.println("Chicken : " + chicken.howToEat());
    }
}



