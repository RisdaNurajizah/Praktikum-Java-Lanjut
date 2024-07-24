package sesi4;

// superclass
class BentukGeometri {
    // Method menghitung luas
    public double hitungLuas() {
        return 0.0;
    }

    // Method menghitung keliling
    public double hitungKeliling() {
        return 0.0;
    }

    // subclass lingkaran
    class Lingkaran extends BentukGeometri{
        // Deklarasi variabel
        private double jariJari;

        // constructor untuk class Lingkaran dengan parameter jari-jari
        public Lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }

        // Override untuk menghitung luas lingkaran
        @Override
        public double hitungLuas() {
            // rumus luas lingkaran
            return Math.PI * jariJari * jariJari;
        }

        // Override untuk menghitung keliling lingkaran
        @Override
        public double hitungKeliling() {
            // rumus keliling lingkaran
            return 2 * Math.PI * jariJari; 
        }
    }

    // subclass persegi
    class Persegi extends BentukGeometri {
        // Deklarasi variabel 
        private double sisi;

        // constructor class Persegi dengan parameter sisi
        public Persegi(double sisi) {
            this.sisi = sisi;
        }

        // Override untuk menghitung luas persegi
        @Override
        public double hitungLuas() {
            // rumus luas persegi
            return sisi * sisi;
        }

        //  Override untuk menghitung keliling persegi
        @Override
        public double hitungKeliling(){
            // rumus keliling persegi
            return 4 * sisi;
        }
    }

    // subclass Segitiga
    class Segitiga extends BentukGeometri{
        // Deklarasi variabel
        private double alas;
        private double tinggi;
        private double sisiA;
        private double sisiB;
        private double sisiC;

        // constructor class Segitiga dengan parameter
        public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC){
            this.alas = alas;
            this.tinggi = tinggi;
            this.sisiA = sisiA;
            this.sisiB = sisiB;
            this.sisiC = sisiC;
        }

        // Override untuk menghitung luas segitiga
        @Override
        public double hitungLuas() {
            // rumus luas segitiga
            return (alas * tinggi) / 2;
        }

        // Override untuk menghitung keliling segitiga
        @Override
        public double hitungKeliling() {
            // rumus keliling segitiga
            return sisiA + sisiB + sisiC;
        }
    }

// Main class untuk menguji
public static void main(String[] args){
    BentukGeometri bg = new BentukGeometri();
    // membuat objek lingkaran
    BentukGeometri.Lingkaran lingkaran = bg.new Lingkaran(7);

    // membuat objek persegi
    BentukGeometri.Persegi persegi = bg.new Persegi(5);

    // membuat objek segitiga
    BentukGeometri.Segitiga segitiga = bg.new Segitiga(4,3,3,3, 3);

    // Mencetak hasil perhitungan luas dan keliling lingkaran
    System.out.println("Luas Lingkaran     : " + lingkaran.hitungLuas());
    System.out.println("Keliling Lingkaran : " + lingkaran.hitungKeliling());

    // Mencetak hasil perhitungan luas dan keliling persegi
     System.out.println("Luas Persegi       : " + persegi.hitungLuas());
     System.out.println("Keliling Persegi   : " + persegi.hitungKeliling());

      // Mencetak hasil perhitungan luas dan keliling segitiga
    System.out.println("Luas Segitiga      : " + segitiga.hitungLuas());
    System.out.println("Keliling Segitiga  : " + segitiga.hitungKeliling());
    }
}

