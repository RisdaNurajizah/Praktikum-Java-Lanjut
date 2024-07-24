package sesi4;

// Superclass Shape
public class Shape {
    // Method area yang akan di-override oleh subclass
    double area() {
        return 0;
    }

    // Subclass Circle
    class Circle extends Shape {
        private double radius;

        // Constructor untuk Circle
        public Circle(double radius) {
            this.radius = radius;
        }

        // Override method area
        @Override
        double area() {
            return Math.PI * radius * radius;
        }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor untuk Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override method area
    @Override
    double area() {
        return length * width;
    }
}

// Main class untuk menguji polymorphism
public static void main(String[] args) {
    // Membuat objek Circle dan Rectangle
    Shape shape = new Shape();
    Shape.Circle circle = shape.new Circle(5);
    Shape.Rectangle rectangle =shape.new Rectangle(4, 6);

    // Menggunakan polymorphism untuk memanggil method area
    System.out.println("Area of Circle    : " + circle.area());
    System.out.println("Area of Rectangle : " + rectangle.area());
    }
}
