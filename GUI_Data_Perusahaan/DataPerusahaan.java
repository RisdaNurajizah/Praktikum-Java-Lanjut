package GUI_Data_Perusahaan;

import java.io.*;
import java.util.ArrayList;

public class DataPerusahaan {
    private String noIzin, namaPerusahaan, pemilikPerusahaan, jenisUsaha, tanggalBerdiri, alamatPerusahaan;
    private String jalan, kecamatan, kota;

    // constructor dengan parameter
    public DataPerusahaan(String noIzin, String namaPerusahaan, String pemilikPerusahaan, String jenisUsaha, String tanggalBerdiri, String alamatPerusahaan,
                          String jalan, String kecamatan, String kota) {
        this.noIzin = noIzin;
        this.namaPerusahaan = namaPerusahaan;
        this.pemilikPerusahaan = pemilikPerusahaan;
        this.jenisUsaha = jenisUsaha;
        this.tanggalBerdiri = tanggalBerdiri;
        this.alamatPerusahaan = alamatPerusahaan;
        this.jalan = jalan;
        this.kecamatan = kecamatan;
        this.kota = kota;
    }

    // getter (memasukan input)
    public String getNoIzin() {
        return noIzin;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getPemilikPerusahaan() {
        return pemilikPerusahaan;
    }

    public String getJenisUsaha() {
        return jenisUsaha;
    }

    public String getTanggalBerdiri() {
        return tanggalBerdiri;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }

    public String getJalan() {
        return jalan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public String getKota() {
        return kota;
    }

    // Menyimpan daftar perusahaan ke dalam file CSV
    public static void saveToFile(ArrayList<DataPerusahaan> dataPerusahaanList, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (DataPerusahaan data : dataPerusahaanList) {
                writer.write(data.toCSV());
                writer.newLine();
            }
        }
    }

    // Membaca daftar perusahaan dari file CSV
    public static ArrayList<DataPerusahaan> loadFromFile(String filePath) throws IOException {
        ArrayList<DataPerusahaan> dataPerusahaanList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 9) {
                    DataPerusahaan dataPerusahaan = new DataPerusahaan(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]);
                    dataPerusahaanList.add(dataPerusahaan);
                }
            }
        }
        return dataPerusahaanList;
    }

    // Mengonversi objek DataPerusahaan ke format CSV
    private String toCSV() {
        return String.join(",", noIzin, namaPerusahaan, pemilikPerusahaan, jenisUsaha, tanggalBerdiri, alamatPerusahaan, jalan, kecamatan, kota);
    }
}
