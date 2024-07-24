package sesi5;

// abstract class untuk mendefinisikan karyawan 
abstract class Karyawan{
    // Deklarasi variabel
    String nama;
    int id;

    // constructor dengan parameter nama dan id
    public Karyawan(String nama, int id){
        this.nama = nama;
        this.id = id;
    }
    // Method abstract untuk mendeskripsikan pekerjaan karyawan
    abstract String deskripsiPekerjaan();
}

// interface untuk Departemen IT
interface DepartemenIT{
    String tugasIT();
}

// interface untuk Departemen HR
interface DepartemenHR{
    String tugasHR();
}

// interface untuk Departemen Keuangan
interface DepartemenKeuangan{
    String tugasKeuangan();
}

// class karyawanIT yang mengimplemntasikan interface DepartemenIT
class KaryawanIT extends Karyawan implements DepartemenIT{
    public KaryawanIT(String nama, int id){
        super(nama, id);
    }

    @Override
    public String deskripsiPekerjaan() {
        return "Mengelola infrastruktur IT perusahaan";
    }

    @Override
    public String tugasIT(){
        return "Memelihara jaringan dan server";
    }
}

// class KaryawanHR yang mengimplementasikam interface DepartemenHR
class KaryawanHR extends Karyawan implements DepartemenHR{
    public KaryawanHR(String nama, int id) {
        super(nama, id);
    }

    @Override
    public String deskripsiPekerjaan(){
        return "Mengelola sumber daya manusia perusahaan";
    }

    @Override
    public String tugasHR(){
        return "Rekrutmen dan pelatihan karyawan";
    }
}

// class KaryawanKeuangan yang menimplemntasikan interface DepartemenKeuangan
class KaryawanKeuangan extends Karyawan implements DepartemenKeuangan{
    public KaryawanKeuangan(String nama, int id){
        super (nama, id);
    }

    @Override
    public String deskripsiPekerjaan() {
        return "Mengelola keuangan perusahaan";
    }

    @Override
    public String tugasKeuangan(){
        return "Mengatur anggaran dan laporan keuangan";
    }
}

// Main class (Kelas utama) untuk menjalankan program
public class MainMgmt{
    public static void main(String[] args){
    // membuat instance karyawan dari berbagai departemen
    KaryawanIT karyawanIT = new KaryawanIT("Andi", 101);
    KaryawanHR karyawanHR = new KaryawanHR("Budi", 102);
    KaryawanKeuangan karyawanKeuangan = new KaryawanKeuangan("Siti", 103);

    // Menampilkan deskripsi pekerjaan dan tugas spesifik dari setiap karyawan
    System.out.println(karyawanIT.nama + " (ID : " + karyawanIT.id + ")");
    System.out.println("Deskripsi Pekerjaan  : " + karyawanIT.deskripsiPekerjaan());
    System.out.println("Tugas IT             : " + karyawanIT.tugasIT());
    System.out.println();

    System.out.println(karyawanHR.nama + " (ID : " + karyawanHR.id + ")");
    System.out.println("Deskripsi Pekerjaan  : " + karyawanHR.deskripsiPekerjaan());
    System.out.println("Tugas HR             : " + karyawanHR.tugasHR());
    System.out.println();

    System.out.println(karyawanKeuangan.nama + " (ID : " + karyawanKeuangan.id + ")");
    System.out.println("Deskripsi Pekerjaan  : " + karyawanKeuangan.deskripsiPekerjaan());
    System.out.println("Tugas Keuangan       : " + karyawanKeuangan.tugasKeuangan());
    System.out.println();
    }
}


