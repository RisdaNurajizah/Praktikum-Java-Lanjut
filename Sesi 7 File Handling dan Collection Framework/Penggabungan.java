import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List; 

public class Penggabungan {

    public static void main(String[] args) {
        // Nama file input
        String[] inputFiles = {"File1.txt", "File2.txt", "File3.txt"};
        // Nama file output
        String outputFile = "output.txt";
        
        // Membaca konten dari semua file input dan menyimpannya dalam list
        List<String> allLines = new ArrayList<>();
        
        for (String inputFile : inputFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    allLines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Menulis konten yang sudah digabungkan ke file output
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            for (String line : allLines) {
                writer.println(line);
            }
            System.out.println("Konten berhasil digabungkan ke " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
