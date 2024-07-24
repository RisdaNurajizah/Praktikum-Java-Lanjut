package sesi3;

// superclass
class Vehicle {
    String brand;
    int year;

    public void honk() {
        System.out.println("Vehicle is honking");
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

    // subclass
    class Car extends Vehicle {
        int doorCount;

        public void displayDetails() {
            System.out.println("Brand : " + brand + ", Year : " + year + ", Doors : " + doorCount);
        }

        public Car(String brand, int year, int doorCount) {
            // Memanggil constructor dari superclass
            super(brand, year);
            this.doorCount = doorCount;
        }
    }

// cetak hasil
public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2019, 4);
        car1.honk();
        car1.displayDetails();
    }
}
