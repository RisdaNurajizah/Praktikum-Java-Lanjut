public class EmployeeMahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;
    private String tempatTanggalLahir;

    // Constructor
    public EmployeeMahasiswa(String nama, String nim, String prodi, String alamat, String tempatTanggalLahir) {
        this.nim = nim;
        this.prodi = prodi;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatTanggalLahir() {
        return tempatTanggalLahir;
    }

    public void setTempatTanggalLahir(String tempatTanggalLahir) {
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    public static void main(String[] args) {
        EmployeeMahasiswa employee = new EmployeeMahasiswa("Risda", "301230008", "Teknik Informatika", "Jl. Petak No. 35", "Bandung, 07 Juli 2005");
        
        System.out.println("Data Mahasiswa:");
        System.out.println("Nama: " + employee.getNama());
        System.out.println("NIM: " + employee.getNim());
        System.out.println("Prodi: " + employee.getProdi());
        System.out.println("Alamat: " + employee.getAlamat());
        System.out.println("Tempat Tanggal Lahir: " + employee.getTempatTanggalLahir());
    }
}