package Data_Perusahaan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataPerusahaanGUI extends JFrame {

    // Deklarasi komponen GUI
    private JButton buttonSubmit, buttonFirst, buttonLast, buttonNext, buttonPrev, buttonSave, buttonLoad;
    private JLabel labelNoIzin, labelNamaPerusahaan, labelPemilikPerusahaan, labelJenisUsaha, labelTanggalBerdiri, labelAlamatPerusahaan;
    private JTextField textNoIzin, textNamaPerusahaan, textPemilikPerusahaan, textTanggalBerdiri, textAlamatPerusahaan;
    private JRadioButton radioManufaktur, radioEnergidanPertambangan, radioKesehatan;
    private ButtonGroup groupJenisUsaha;
    private JTextArea textAreaOutput;
    private JScrollPane scrollPaneOutput;

    // ArrayList untuk menyimpan data perusahaan
    private ArrayList<DataPerusahaan> dataPerusahaanList = new ArrayList<>();
    private int currentIndex = -1;

    // Koneksi database
    private final String url = "jdbc:mysql://localhost:3307/data_perusahaan";
    private final String user = "root";
    private final String password = "";

    // Konstruktor untuk mengatur komponen GUI
    public DataPerusahaanGUI() {
        initComponents();
    }

    private void initComponents() {
        // Inisialisasi komponen
        labelNoIzin = new JLabel("No Izin: ");
        textNoIzin = new JTextField(15);

        labelNamaPerusahaan = new JLabel("Nama Perusahaan: ");
        textNamaPerusahaan = new JTextField(20);

        labelPemilikPerusahaan = new JLabel("Pemilik Perusahaan: ");
        textPemilikPerusahaan = new JTextField(20);

        labelJenisUsaha = new JLabel("Jenis Usaha: ");
        radioManufaktur = new JRadioButton("Sektor Manufaktur");
        radioEnergidanPertambangan = new JRadioButton("Sektor Energi dan Pertambangan");
        radioKesehatan = new JRadioButton("Sektor Kesehatan dan Farmasi");
        groupJenisUsaha = new ButtonGroup();
        groupJenisUsaha.add(radioManufaktur);
        groupJenisUsaha.add(radioEnergidanPertambangan);
        groupJenisUsaha.add(radioKesehatan);

        labelTanggalBerdiri = new JLabel("Tanggal Berdiri: ");
        textTanggalBerdiri = new JTextField(10);

        labelAlamatPerusahaan = new JLabel("Alamat Perusahaan: ");
        textAlamatPerusahaan = new JTextField(20);

        buttonSubmit = new JButton("Submit");
        buttonFirst = new JButton("First");
        buttonLast = new JButton("Last");
        buttonNext = new JButton("Next");
        buttonPrev = new JButton("Prev");
        buttonSave = new JButton("Save to DB");
        buttonLoad = new JButton("Load from DB");

        textAreaOutput = new JTextArea(10, 30);
        textAreaOutput.setEditable(false);
        scrollPaneOutput = new JScrollPane(textAreaOutput);

        // Tambahkan action listeners
        buttonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        buttonFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showFirstData();
            }
        });

        buttonLast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showLastData();
            }
        });

        buttonNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showNextData();
            }
        });

        buttonPrev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showPrevData();
            }
        });

        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveDataToDatabase();
            }
        });

        buttonLoad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loadDataFromDatabase();
            }
        });

        // Mengatur layout komponen GUI
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelNoIzin)
                                .addComponent(labelNamaPerusahaan)
                                .addComponent(labelPemilikPerusahaan)
                                .addComponent(labelJenisUsaha)
                                .addComponent(labelTanggalBerdiri)
                                .addComponent(labelAlamatPerusahaan))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(textNoIzin, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textNamaPerusahaan, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPemilikPerusahaan, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radioManufaktur)
                                .addComponent(radioEnergidanPertambangan)
                                .addComponent(radioKesehatan)
                                .addComponent(textTanggalBerdiri, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textAlamatPerusahaan, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonSubmit)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonFirst)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonLast)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonNext)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonPrev)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonSave)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonLoad))
                        .addComponent(scrollPaneOutput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNoIzin)
                        .addComponent(textNoIzin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNamaPerusahaan)
                        .addComponent(textNamaPerusahaan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPemilikPerusahaan)
                        .addComponent(textPemilikPerusahaan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelJenisUsaha)
                        .addComponent(radioManufaktur))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(radioEnergidanPertambangan)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(radioKesehatan)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTanggalBerdiri)
                        .addComponent(textTanggalBerdiri, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAlamatPerusahaan)
                        .addComponent(textAlamatPerusahaan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSubmit)
                        .addComponent(buttonFirst)
                        .addComponent(buttonLast)
                        .addComponent(buttonNext)
                        .addComponent(buttonPrev)
                        .addComponent(buttonSave)
                        .addComponent(buttonLoad)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPaneOutput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // Metode untuk menangani tindakan ketika tombol submit ditekan
    private void buttonSubmitActionPerformed(ActionEvent evt) {
        // Ambil input dari komponen GUI
        String noIzin = textNoIzin.getText();
        String namaPerusahaan = textNamaPerusahaan.getText();
        String pemilikPerusahaan = textPemilikPerusahaan.getText();
        String jenisUsaha = "";
        if (radioManufaktur.isSelected()) {
            jenisUsaha = "Sektor Manufaktur";
        } else if (radioEnergidanPertambangan.isSelected()) {
            jenisUsaha = "Sektor Energi dan Pertambangan";
        } else if (radioKesehatan.isSelected()) {
            jenisUsaha = "Sektor Kesehatan dan Farmasi";
        }
        String tanggalBerdiri = textTanggalBerdiri.getText();
        String alamatPerusahaan = textAlamatPerusahaan.getText();

        // Validasi input
        if (noIzin.isEmpty() || namaPerusahaan.isEmpty() || pemilikPerusahaan.isEmpty() || jenisUsaha.isEmpty() || tanggalBerdiri.isEmpty() || alamatPerusahaan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi semua data.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tambahkan data perusahaan ke dalam list
        DataPerusahaan data = new DataPerusahaan(noIzin, namaPerusahaan, pemilikPerusahaan, jenisUsaha, tanggalBerdiri, alamatPerusahaan);
        dataPerusahaanList.add(data);
        currentIndex = dataPerusahaanList.size() - 1;

        // Tampilkan data di text area
        updateTextArea();

        // Kosongkan input
        clearInputs();
    }

    private void updateTextArea() {
        textAreaOutput.setText("");
        for (DataPerusahaan data : dataPerusahaanList) {
            textAreaOutput.append(data.toString() + "\n");
        }
    }

    private void clearInputs() {
        textNoIzin.setText("");
        textNamaPerusahaan.setText("");
        textPemilikPerusahaan.setText("");
        groupJenisUsaha.clearSelection();
        textTanggalBerdiri.setText("");
        textAlamatPerusahaan.setText("");
    }

    private void showFirstData() {
        if (!dataPerusahaanList.isEmpty()) {
            currentIndex = 0;
            showData(currentIndex);
        }
    }

    private void showLastData() {
        if (!dataPerusahaanList.isEmpty()) {
            currentIndex = dataPerusahaanList.size() - 1;
            showData(currentIndex);
        }
    }

    private void showNextData() {
        if (currentIndex < dataPerusahaanList.size() - 1) {
            currentIndex++;
            showData(currentIndex);
        }
    }

    private void showPrevData() {
        if (currentIndex > 0) {
            currentIndex--;
            showData(currentIndex);
        }
    }

    private void showData(int index) {
        if (index >= 0 && index < dataPerusahaanList.size()) {
            DataPerusahaan data = dataPerusahaanList.get(index);
            textNoIzin.setText(data.getNoIzin());
            textNamaPerusahaan.setText(data.getNamaPerusahaan());
            textPemilikPerusahaan.setText(data.getPemilikPerusahaan());
            if (data.getJenisUsaha().equals("Sektor Manufaktur")) {
                radioManufaktur.setSelected(true);
            } else if (data.getJenisUsaha().equals("Sektor Energi dan Pertambangan")) {
                radioEnergidanPertambangan.setSelected(true);
            } else if (data.getJenisUsaha().equals("Sektor Kesehatan dan Farmasi")) {
                radioKesehatan.setSelected(true);
            }
            textTanggalBerdiri.setText(data.getTanggalBerdiri());
            textAlamatPerusahaan.setText(data.getAlamatPerusahaan());
        }
    }

    private void saveDataToDatabase() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            for (DataPerusahaan data : dataPerusahaanList) {
                String query = "INSERT INTO data (no_izin, nama_perusahaan, pemilik_perusahaan, jenis_usaha, tanggal_berdiri, alamat_perusahaan) VALUES (?, ?, ?, ?, ?, ?)";
                var stmt = conn.prepareStatement(query);
                stmt.setString(1, data.getNoIzin());
                stmt.setString(2, data.getNamaPerusahaan());
                stmt.setString(3, data.getPemilikPerusahaan());
                stmt.setString(4, data.getJenisUsaha());
                stmt.setString(5, data.getTanggalBerdiri());
                stmt.setString(6, data.getAlamatPerusahaan());
                stmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke database.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data ke database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadDataFromDatabase() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM data_perusahaan";
            var stmt = conn.createStatement();
            var rs = stmt.executeQuery(query);
            dataPerusahaanList.clear();
            while (rs.next()) {
                String noIzin = rs.getString("no_izin");
                String namaPerusahaan = rs.getString("nama_perusahaan");
                String pemilikPerusahaan = rs.getString("pemilik_perusahaan");
                String jenisUsaha = rs.getString("jenis_usaha");
                String tanggalBerdiri = rs.getString("tanggal_berdiri");
                String alamatPerusahaan = rs.getString("alamat_perusahaan");

                DataPerusahaan data = new DataPerusahaan(noIzin, namaPerusahaan, pemilikPerusahaan, jenisUsaha, tanggalBerdiri, alamatPerusahaan);
                dataPerusahaanList.add(data);
            }
            currentIndex = dataPerusahaanList.size() - 1;
            if (currentIndex >= 0) {
                showData(currentIndex);
            }
            updateTextArea();
            JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari database.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data dari database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DataPerusahaanGUI().setVisible(true);
            }
        });
    }
}
