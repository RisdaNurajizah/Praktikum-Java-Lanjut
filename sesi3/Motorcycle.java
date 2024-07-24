package sesi3;

// superclass
class Vehicle {
    String brand;
    int year;

    // Method untuk menampilkan "Vehicle is honking"
    public void honk() {
        System.out.println("Vehicle is honking");
    }

    // constructor class vehicle dengan parameter
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

// subclass
class Motor extends Vehicle {
    String colour;

    // Method untuk menampilkan detail motor
    public void displayDetails() {
        System.out.println("Brand : " + brand + ", Year : " + year + ", Colour : " + colour);
    }

    // constructor dengan parameter
    public Motor(String brand, int year, String colour) {
        // Memanggil constructor dari superclass
        super(brand, year);
        this.colour = colour;
    }
}

// main class untuk menguji / menjalankan program
public class Motorcycle {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Honda", 2020, "Hitam");
        motor1.honk();
        motor1.displayDetails();
    }
}
