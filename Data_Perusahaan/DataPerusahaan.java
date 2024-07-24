package Data_Perusahaan;

import java.sql.*;
import java.util.ArrayList;

public class DataPerusahaan {
    private String noIzin, namaPerusahaan, pemilikPerusahaan, jenisUsaha, tanggalBerdiri, alamatPerusahaan;

    public DataPerusahaan(String noIzin, String namaPerusahaan, String pemilikPerusahaan, String jenisUsaha, String tanggalBerdiri, String alamatPerusahaan) {
        this.noIzin = noIzin;
        this.namaPerusahaan = namaPerusahaan;
        this.pemilikPerusahaan = pemilikPerusahaan;
        this.jenisUsaha = jenisUsaha;
        this.tanggalBerdiri = tanggalBerdiri;
        this.alamatPerusahaan = alamatPerusahaan;
    }

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

    // Menyimpan data perusahaan ke database
    public static void saveToDatabase(ArrayList<DataPerusahaan> dataPerusahaanList, String url, String user, String password) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, password);
        String insertSQL = "INSERT INTO data_perusahaan (no_izin, nama_perusahaan, pemilik_perusahaan, jenis_usaha, tanggal_berdiri, alamat_perusahaan ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        for (DataPerusahaan dp : dataPerusahaanList) {
            pstmt.setString(1, dp.getNoIzin());
            pstmt.setString(2, dp.getNamaPerusahaan());
            pstmt.setString(3, dp.getPemilikPerusahaan());
            pstmt.setString(4, dp.getJenisUsaha());
            pstmt.setDate(5, Date.valueOf(dp.getTanggalBerdiri()));
            pstmt.setString(6, dp.getAlamatPerusahaan());
        }
        pstmt.executeBatch();
        conn.close();
    }

    // Membaca data perusahaan dari database
    public static ArrayList<DataPerusahaan> loadFromDatabase(String url, String user, String password) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, password);
        String querySQL = "SELECT * FROM data_perusahaan";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(querySQL);
        ArrayList<DataPerusahaan> dataPerusahaanList = new ArrayList<>();
        while (rs.next()) {
            DataPerusahaan dp = new DataPerusahaan(
                    rs.getString("no_izin"),
                    rs.getString("nama_perusahaan"),
                    rs.getString("pemilik_perusahaan"),
                    rs.getString("jenis_usaha"),
                    rs.getString("tanggal_berdiri"),
                    rs.getString("alamat_perusahaan")
            );
            dataPerusahaanList.add(dp);
        }
        conn.close();
        return dataPerusahaanList;
    }
}
