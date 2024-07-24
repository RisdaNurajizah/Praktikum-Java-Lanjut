public class FinallyBlock {
    
    public static void main(String[] args){
        // Blok try untuk memberitahu dan menangani kesalahan
        try{
            // ...(existing code)
        }catch(ArithmeticException e){
            // ...(existing code)
        }finally{
            // Blok finally kode ini akan selalu dijalankan, terlepas dari apakah ada error atau tidak
            System.out.println("Terjadi suatu kesalahan, coba ulangi lagi");
        }
    }
}


