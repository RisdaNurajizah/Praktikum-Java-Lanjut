public class Main {
    // Metode untuk memvalidasi input
    public static void validateInput(int num) throws InvalidInputException{
        // Memeriksa apakah angka yang diberikan kurang dari 0
        if(num < 0){
            // Output ini akan muncul jika anda menginput bilangan negatif
            throw new InvalidInputException("Input tidak boleh negatif");
        }
    }

    public static void main(String[] args){
        try{
            // Menginput yang bernilai -5
            validateInput(-5);
        }catch(InvalidInputException e){
            // Memberitahu exception jika input tidak valid dan mencetak pesan kesalahan
            System.out.println(e.getMessage());
        }
    }
}


