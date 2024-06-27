// Mendefinisikan kelas custom exception
public class InvalidInputException extends Exception{
    // Konstruktor untuk menginisialisasi exception dengan pesan tertentu
    public InvalidInputException(String message){
        // Memanggil konstruktor superclass (Exception) dengan pesan kesalahan
        super(message);
    }
}



