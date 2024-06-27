import java.util.Scanner;

public class KalkulatorException {
    public static void validateInput(int num) throws InvalidInputException{
        // Memeriksa apakah angka yang diberikan kurang dari 0
        if(num < 0){
            // Output ini akan muncul jika anda menginput bilangan negatif
            throw new InvalidInputException("Input tidak boleh bilangan negatif");
        }
    }
    public static void main(String[] args){
        // Deklarasi Variabel
        int a = 0 , b = 0;

        // Membuat scanner
        Scanner input = new Scanner(System.in);

        // Blok try untuk memberitahu dan menangani kesalahan
        try{
            // input bilangan a dan b oleh pengguna
            System.out.print("Masukkan bilangan a : ");
            a = input.nextInt();
            validateInput(a);
            System.out.print("Masukkan bilangan b : ");
            b = input.nextInt();
            validateInput(b);

            // Perhitungan
            int tambah = a + b;
            int kurang = a - b;
            int kali   = a * b;
            float bagi = divide(a,b);

            // Cetak hasil perhitungan
            System.out.println("a + b = " + tambah);
            System.out.println("a - b = " + kurang);
            System.out.println("a x b = " + kali);
            System.out.println("a / b = " + bagi);

            // Memeriksa hasil negatif
            if (tambah < 0 || kurang < 0 || kali < 0 || bagi < 0) {
                System.out.println("Hasil bilangan adalah negative");
            }

        }catch(ArithmeticException e){
            // Memberitahu kesalahan, jika tidak bisa dibagi 0 
            System.out.println("Tidak bisa dibagi dengan Nol(0)");
        }catch(InvalidInputException e){
            // Memberitahu kesalahan, jika anda memasukkan bilangan negatif
            System.out.println(e.getMessage());
        }catch(Exception e){
            // Memberitahu kesalahan tidak boleh memasukan selain angka
            System.out.println("Terjadi kesalahan, anda memasukan input selain angka");
        }finally {
            // menutup scanner
            input.close();
        }
    }

    // Metode untuk membagi dua angka
    public static float divide(int a, int b){
        // memeriksa apakah a adalah nol
        if ( a == 0){
            throw new ArithmeticException("Tidak bisa dibagi dengan Nol(0)");
        }
        // memeriksa apakah b adalah nol
        if ( b == 0){
            throw new ArithmeticException("Tidak bisa dibagi dengan Nol(0)");
        }
        // Mengembalikan hasil perkalian
        return (float) a / b;
    }
}
