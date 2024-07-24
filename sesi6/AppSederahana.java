import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class AppSederahana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menampilkan menu utama
            System.out.println("Menu:");
            System.out.println("1. Baca File");
            System.out.println("2. Bagi Angka");
            System.out.println("3. Keluar");
            System.out.print("Pilih operasi (1/2/3): ");

            try {
                // Membaca pilihan pengguna
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        // Memanggil operasi membaca file
                        readFileOperation(scanner); 
                        break;
                    case 2:
                        // Memanggil operasi membagi angka
                        divideNumbersOperation(scanner); 
                        break;
                    case 3:
                        // Menampilkan pesan
                        System.out.println("Terima kasih!"); 
                        return; 
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka yang benar.");
                scanner.nextLine(); 
            }
        }
    }

    // Method untuk operasi membaca file
    private static void readFileOperation(Scanner scanner) {
        System.out.print("Masukkan path file: ");
        String filePath = scanner.nextLine();

        try {
            // Membuat objek File berdasarkan path yang diberikan
            File file = new File(filePath); 
            // Membuat objek Scanner untuk membaca file
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                // Membaca dan menampilkan setiap baris dari file
                System.out.println(fileScanner.nextLine()); 
            }

            fileScanner.close(); 
        } catch (FileNotFoundException e) {
            // Menampilkan pesan
            System.out.println("File tidak ditemukan: " + filePath); 
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + filePath); 
        }
    }

    // Method untuk operasi membagi dua angka
    private static void divideNumbersOperation(Scanner scanner) {
        try {
            System.out.print("Masukkan angka pertama: ");
            int num1 = scanner.nextInt(); // Membaca angka pertama dari pengguna
            System.out.print("Masukkan angka kedua: ");
            int num2 = scanner.nextInt(); // Membaca angka kedua dari pengguna

            int result = num1 / num2; // Melakukan pembagian
            System.out.println("Hasil pembagian: " + result); // Menampilkan hasil pembagian
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar.");
            scanner.nextLine(); // Membersihkan input yang tidak valid dari scanner
        } catch (ArithmeticException e) {
            System.out.println("Error: Pembagian dengan angka nol tidak bisa dilakukan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat membagi angka.");
        }
    }
}




