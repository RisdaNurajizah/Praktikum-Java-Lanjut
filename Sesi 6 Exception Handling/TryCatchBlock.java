public class TryCatchBlock {
    
    public static void main(String[] args){
        // Blok try untuk memberitahu dan menangani kesalahan
        try{
            // Membagi dua angka dengan nol(0)
            int result = divide(10,0);
            // Cetak hasil pembagian jika tidak ada kesalahan
            System.out.println("Result : " + result);

        }catch(ArithmeticException e){
            // Memberitahu kesalahan
            System.out.println("Tidak bisa dibagi dengan Nol(0)");
        }
    }

    // Metode untuk membagi dua angka
    public static int divide(int a, int b){
        // Mengembalikan hasil perkalian
        return a / b;
    }
}




