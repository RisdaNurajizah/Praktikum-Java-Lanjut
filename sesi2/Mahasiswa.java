package sesi2;

public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private double ipk;

    // constructor tanpa parameter
    public Mahasiswa(){
        // inisialisasi atribut
        this.nama = "";
        this.nim = "";
        this.ipk = 0.0;
    }
    // constructor dengan parameter nama
    public Mahasiswa(String nama){
        // inisialisasi atribut nama
        this.nama = nama;
        this.nim = "";
        this.ipk = 0.0;
    }
    // constructor dengan parameter nama dan nim
    public Mahasiswa(String nama, String nim){
        // inisialisasi nama dan nim
        this.nama = nama;
        this.nim = nim;
        this.ipk = 0.0;
    }
    // constructor dengan parameter nama, nim, dan ipk
    public Mahasiswa(String nama, String nim, double ipk){
        // inisialisasi nama, nim, dan ipk
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // getter untuk atribut nama
    public String getNama(){
        return nama;
    }
    // getter untuk atribut nim
    public String getNim(){
        return nim;
    }
    // getter untuk atribut ipk
    public double getIpk(){
        return ipk;
    }

    // setter untuk atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }
    // setter untuk atribut nim
    public void setNim(String nim){
        this.nim = nim;
    }
    // setter untuk atribut ipk
    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public static void main(String[] args){
        // Membuat objek mh1 dengan constructor tanpa parameter
        Mahasiswa mh1 = new Mahasiswa();
        mh1.setNama("Risda");
        mh1.setNim("301230008");
        mh1.setIpk(4.0);
        System.out.println(mh1.getNama() + ", " + mh1.getNim() + ", " + mh1.getIpk());

        // Membuat objek mh2 dengan constructor parameter nama
        Mahasiswa mh2 = new Mahasiswa("Budi");
        mh2.setNim("123456");
        mh2.setIpk(3.8);
        System.out.println(mh2.getNama() + " , " + mh2.getNim() + "   , " + mh2.getIpk());

        // Membuat objek mh3 dengan constructor parameter nama dan nim
        Mahasiswa mh3 = new Mahasiswa("Citra", "30123000");
        mh3.setIpk(3.9);
        System.out.println(mh3.getNama() + ", " + mh3.getNim() + " , " + mh3.getIpk());

        // Membuat objek mh4 dengan constructor parameter nama, nim, dan ipk
        Mahasiswa mh4 = new Mahasiswa("Siti", "5525218", 3.7);
        System.out.println(mh4.getNama() + " , " + mh4.getNim() + "  , " + mh4.getIpk());
    }
}
