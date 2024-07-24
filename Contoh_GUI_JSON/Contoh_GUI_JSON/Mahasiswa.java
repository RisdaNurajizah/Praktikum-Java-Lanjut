package Contoh_GUI_JSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

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

    // Menyimpan daftar mahasiswa ke dalam file JSON
    public static void saveToFile(ArrayList<Mahasiswa> mahasiswaList, String filePath) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(mahasiswaList);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(json);
        }
    }

    // Membaca daftar mahasiswa dari file JSON
    public static ArrayList<Mahasiswa> loadFromFile(String filePath) throws IOException {
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Type type = new TypeToken<ArrayList<Mahasiswa>>() {}.getType();
            return gson.fromJson(reader, type);
        }
    }
}

