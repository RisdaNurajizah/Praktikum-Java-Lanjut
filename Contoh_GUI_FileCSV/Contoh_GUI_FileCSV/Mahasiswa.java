package Contoh_GUI_FileCSV;

import java.io.*;
import java.util.ArrayList;

public class Mahasiswa {
    private String nim, prodi, nama, jenisKelamin, tanggalLahir, tempatLahir;
    private String jalan, kelurahan, kecamatan, kota;

    public Mahasiswa(String nim, String prodi, String nama, String jenisKelamin, String tanggalLahir, String tempatLahir,
                     String jalan, String kelurahan, String kecamatan, String kota) {
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

    // Menyimpan daftar mahasiswa ke dalam file CSV
    public static void saveToFile(ArrayList<Mahasiswa> mahasiswaList, String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (Mahasiswa mahasiswa : mahasiswaList) {
            writer.write(mahasiswa.toCSV());
            writer.newLine();
        }
        writer.close();
    }

    // Membaca daftar mahasiswa dari file CSV
    public static ArrayList<Mahasiswa> loadFromFile(String filePath) throws IOException {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 10) {
                Mahasiswa mahasiswa = new Mahasiswa(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]);
                mahasiswaList.add(mahasiswa);
            }
        }
        reader.close();
        return mahasiswaList;
    }

    // Mengonversi objek Mahasiswa ke format CSV
    private String toCSV() {
        return String.join(",", nim, prodi, nama, jenisKelamin, tanggalLahir, tempatLahir, jalan, kelurahan, kecamatan, kota);
    }
}
