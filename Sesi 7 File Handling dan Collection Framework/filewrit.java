import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class filewrit {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            writer.println("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}