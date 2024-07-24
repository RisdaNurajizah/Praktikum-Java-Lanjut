package sesi1;

public class Mahasiswa {
    // inisialisasi variabel
    private String nim;
    private String prodi;
    private String nama;
    private String alamat;
    private String tempat_lahir;
    private String tgl_lahir;

    // getter
    public String getNim(){
        return nim;
    }
    public String getProdi(){
        return prodi;
    }public String getNama(){
        return nama;
    }public String getAlamat(){
        return alamat;
    }
    public String getTempatLahir(){
        return tempat_lahir;
    }
    public String getTglLahir(){
        return tgl_lahir;
    }

    // Setter
    public void setNim(String newNim){
        nim = newNim;
    }
    public void setProdi(String newProdi){
        prodi = newProdi;
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public void setAlamat(String newAlamat){
        alamat = newAlamat;
    }
    public void setTempatLahir(String newTempatLahir){
        tempat_lahir = newTempatLahir;
    }
    public void setTglLahir(String newTglLahir){
        tgl_lahir = newTglLahir;
    }

    public static void main(String[] args){
        // Membuat objek Mahasiswa dan menginisialisasi nilai
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("301230008");
        mahasiswa.setProdi("Teknik Informatika");
        mahasiswa.setNama("Risda Nurajizah");
        mahasiswa.setAlamat("Kp. Petak");
        mahasiswa.setTempatLahir("Bandung");
        mahasiswa.setTglLahir("07 Juli 2005");

        // Mencetak informasi mahasiswa ke layar
        System.out.println("Nim           : " + mahasiswa.getNim());
        System.out.println("Prodi         : " + mahasiswa.getProdi());
        System.out.println("Nama          : " + mahasiswa.getNama());
        System.out.println("Alamat        : " + mahasiswa.getAlamat());
        System.out.println("Tempat Lahir  : " + mahasiswa.getTempatLahir());
        System.out.println("Tanggal Lahir : " + mahasiswa.getTglLahir());
    }
}
