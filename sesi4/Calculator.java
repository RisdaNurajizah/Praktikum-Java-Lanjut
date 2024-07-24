package sesi4;

public class Calculator {
    // Method untuk menambahkan dua bilangan bulat
    public int add(int a, int b){
        return a + b;
    }

    // Method yang di overload untuk menambahkan tiga bilangan bulat
    public int add(int a, int b, int c){
        return a + b + c;
    }
    
    // Kelas Main untuk menguji fungsi-fungsi dalam kelas Calculator
    public class Main{
        public static void main(String[] args){
            Calculator clac = new Calculator();
            // Memanggil method add dengan dua parameter
            System.out.println("Add two numbers : " + clac.add(5,3));
            // Memanggil method add dengan tiga parameter
            System.out.println("Add three numbers : " + clac.add(5,3,2));
        }
    }
}
