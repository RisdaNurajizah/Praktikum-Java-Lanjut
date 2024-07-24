package Contoh_GUI3;


    // Kelas Mahasiswa untuk menyimpan data mahasiswa
    public class Mahasiswa {
        // atribut Mahasiswa
        private String nim, prodi, nama, jenisKelamin, tanggalLahir, tempatLahir;
        private String jalan, kelurahan, kecamatan, kota;

        // constructor dengan parameter dari atribut class Mahasiswa
        public Mahasiswa(String nim, String prodi, String nama, String jenisKelamin, String tanggalLahir, String tempatLahir,
                         String jalan, String kelurahan, String kecamatan, String kota) { // pintu masuk
            this.nim = nim;
            this.prodi = prodi;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.tanggalLahir = tanggalLahir;
            this.tempatLahir = tempatLahir;
            this.jalan = jalan;
            this.kelurahan = kelurahan;
            this.kecamatan = kecamatan;
            this.kota = kota;
        }

        // getter (mengambil data)
        public String getNim() {
            return nim;
        }

        public String getProdi() {
            return prodi;
        }

        public String getNama() {
            return nama;
        }

        public String getJenisKelamin() {
            return jenisKelamin;
        }

        public String getTanggalLahir() {
            return tanggalLahir;
        }

        public String getTempatLahir() {
            return tempatLahir;
        }

        public String getJalan() {
            return jalan;
        }

        public String getKelurahan() {
            return kelurahan;
        }

        public String getKecamatan() {
            return kecamatan;
        }

        public String getKota() {
            return kota;
        }
    }

