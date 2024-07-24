import java.io.*;

public class FileHandler {

    // method untuk membaca file dengan penanganan exception
    public void readFile(String filePath) {
        // Deklarasi bufferreader untuk membaca file
        BufferedReader reader = null;
        try {
            // Membuka file dengan FileReader
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            // Membaca file baris per baris
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // Menangkap FileNotFoundException jika file tidak ditemukan
        } catch (FileNotFoundException e) {
            // Menampilkan pesan error
            System.err.println("file tidak ditemukan: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            // Menampilkan pesan error
            System.err.println("Kesalahan membaca file: " + filePath);
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    // Menutup BufferedReader
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader");
                    e.printStackTrace();
                }
            }
        }
    }

    // Main class(Kelas utama) untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek FileHandler
        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile("path/to/your/file.txt");
    }
}


