package GUI_Data_Perusahaan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataPerusahaanGUI extends javax.swing.JFrame {

    // Deklarasi komponen GUI
    private javax.swing.JButton buttonSubmit, buttonFirst, buttonLast, buttonNext, buttonPrev, buttonSave, buttonLoad;    private javax.swing.JLabel labelNoIzin, labelNamaPerusahaan, labelPemilikPerusahaan, labelJenisUsaha, labelTanggalBerdiri, labelAlamatPerusahaan;
    private javax.swing.JLabel labelJalan, labelKecamatan, labelKota;
    private javax.swing.JTextField textNoIzin, textNamaPerusahaan, textPemilikPerusahaan, textTanggalBerdiri, textAlamatPerusahaan;
    private javax.swing.JTextField textJalan, textKecamatan, textKota;
    private javax.swing.JRadioButton radioManufaktur, radioEnergidanPertambangan, radioKesehatan;
    private javax.swing.ButtonGroup groupJenisUsaha;
    private javax.swing.JTextArea textAreaOutput;
    private javax.swing.JScrollPane scrollPaneOutput;

    // ArrayList untuk menyimpan data mahasiswa
    private ArrayList<DataPerusahaan> dataPerusahaanList = new ArrayList<>();
    private int currentIndex = -1;
    private final String filePath = "Data Perusahaan.csv";

    // Konstruktor untuk mengatur komponen GUI
    public DataPerusahaanGUI() {
        initComponents();
    }

    private void initComponents() {

        // Inisialisasi komponen
        labelNoIzin = new javax.swing.JLabel("No Izin: ");
        textNoIzin = new javax.swing.JTextField(15);

        labelNamaPerusahaan = new javax.swing.JLabel("Nama Perusahaan: ");
        textNamaPerusahaan = new javax.swing.JTextField(20); 

        labelPemilikPerusahaan = new javax.swing.JLabel("Pemilik Perusahaan: ");
        textPemilikPerusahaan = new javax.swing.JTextField(20);

        labelJenisUsaha = new javax.swing.JLabel("Jenis Usaha: ");
        radioManufaktur = new javax.swing.JRadioButton("Sektor Manufaktur ");
        radioEnergidanPertambangan = new javax.swing.JRadioButton("Sektor Energi dan Pertambangan");
        radioKesehatan = new javax.swing.JRadioButton("Sektor Kesehatan dan Farmasi");
        groupJenisUsaha= new javax.swing.ButtonGroup();
        groupJenisUsaha.add(radioManufaktur);
        groupJenisUsaha.add(radioEnergidanPertambangan);
        groupJenisUsaha.add(radioKesehatan);


        labelTanggalBerdiri = new javax.swing.JLabel("Tanggal Berdiri: ");
        textTanggalBerdiri = new javax.swing.JTextField(10);

        labelAlamatPerusahaan = new javax.swing.JLabel("Alamat Perusahaan: ");
        textAlamatPerusahaan = new javax.swing.JTextField(20);

        labelJalan = new javax.swing.JLabel("Jalan: ");
        textJalan = new javax.swing.JTextField(20);

        labelKecamatan = new javax.swing.JLabel("Kecamatan: ");
        textKecamatan = new javax.swing.JTextField(20);

        labelKota = new javax.swing.JLabel("Kota: ");
        textKota = new javax.swing.JTextField(20);

        buttonSubmit = new javax.swing.JButton("Submit");
        buttonFirst = new javax.swing.JButton("First");
        buttonLast = new javax.swing.JButton("Last");
        buttonNext = new javax.swing.JButton("Next");
        buttonPrev = new javax.swing.JButton("Prev");
        buttonSave = new javax.swing.JButton("Save to CSV");
        buttonLoad = new javax.swing.JButton("Load from CSV");
        
        textAreaOutput = new javax.swing.JTextArea(10, 30);
        textAreaOutput.setEditable(false);
        scrollPaneOutput = new javax.swing.JScrollPane(textAreaOutput);

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
                saveDataToFile();
            }
        });

        buttonLoad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loadDataFromFile();
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        // Mengatur layout komponen GUI
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNoIzin)
                                .addComponent(labelNamaPerusahaan)
                                .addComponent(labelPemilikPerusahaan)
                                .addComponent(labelJenisUsaha)
                                .addComponent(labelTanggalBerdiri)
                                .addComponent(labelAlamatPerusahaan)
                                .addComponent(labelJalan)
                                .addComponent(labelKecamatan)
                                .addComponent(labelKota))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textNoIzin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textNamaPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPemilikPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radioManufaktur)
                                .addComponent(radioEnergidanPertambangan)
                                .addComponent(radioKesehatan)
                                .addComponent(textTanggalBerdiri, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textAlamatPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textJalan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textKota, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonSubmit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonFirst)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonLast)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonNext)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonPrev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonSave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonLoad))
                        .addComponent(scrollPaneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNoIzin)
                        .addComponent(textNoIzin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNamaPerusahaan)
                        .addComponent(textNamaPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPemilikPerusahaan)
                        .addComponent(textPemilikPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelJenisUsaha)
                        .addComponent(radioManufaktur))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(radioEnergidanPertambangan)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(radioKesehatan)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTanggalBerdiri)
                        .addComponent(textTanggalBerdiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAlamatPerusahaan)
                        .addComponent(textAlamatPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelJalan)
                        .addComponent(textJalan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelKecamatan)
                        .addComponent(textKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelKota)
                        .addComponent(textKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSubmit)
                        .addComponent(buttonFirst)
                        .addComponent(buttonLast)
                        .addComponent(buttonNext)
                        .addComponent(buttonPrev)
                        .addComponent(buttonSave)
                        .addComponent(buttonLoad))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPaneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        

        pack();
    }

    // Fungsi untuk menangani event submit
    private void buttonSubmitActionPerformed(ActionEvent evt) {
        String noIzin = textNoIzin.getText();
        String namaPerusahaan = textNamaPerusahaan.getText();
        String pemilikPerusahaan = textPemilikPerusahaan.getText();
        String jenisUsaha = radioManufaktur.isSelected() ? "Sektor Manufaktur" : 
                            radioEnergidanPertambangan.isSelected() ? "Sektor EnergidanPertambangan" :
                            radioKesehatan.isSelected() ? "Sektor Kesehatan" : "";
        String tanggalBerdiri = textTanggalBerdiri.getText();
        String alamatPerusahaan = textAlamatPerusahaan.getText();
        String jalan = textJalan.getText();
        String kecamatan = textKecamatan.getText();
        String kota = textKota.getText();

        DataPerusahaan dataperusahaan = new DataPerusahaan(noIzin, namaPerusahaan, pemilikPerusahaan, jenisUsaha, tanggalBerdiri, alamatPerusahaan, jalan, kecamatan, kota );
        dataPerusahaanList.add(dataperusahaan);
        currentIndex = dataPerusahaanList.size() - 1;

        displayData(dataperusahaan);
    }

    private void showFirstData() {
        if (!dataPerusahaanList.isEmpty()) {
            currentIndex = 0;
            displayData(dataPerusahaanList.get(currentIndex));
        }
    }

    private void showLastData() {
        if (!dataPerusahaanList.isEmpty()) {
            currentIndex = dataPerusahaanList.size() - 1;
            displayData(dataPerusahaanList.get(currentIndex));
        }
    }

    private void showNextData() {
        if (currentIndex < dataPerusahaanList.size() - 1) {
            currentIndex++;
            displayData(dataPerusahaanList.get(currentIndex));
        }
    }

    private void showPrevData() {
        if (currentIndex > 0) {
            currentIndex--;
            displayData(dataPerusahaanList.get(currentIndex));
        }
    }

    private void saveDataToFile() {
        try {
            DataPerusahaan.saveToFile(dataPerusahaanList, filePath);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke " + filePath);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
        }
    }

    private void loadDataFromFile() {
        try {
            dataPerusahaanList = DataPerusahaan.loadFromFile(filePath);
            JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari " + filePath);
            if (!dataPerusahaanList.isEmpty()) {
                currentIndex = 0;
                displayData(dataPerusahaanList.get(currentIndex));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
        }
    }

    // Fungsi untuk menampilkan data mahasiswa di textAreaOutput
    private void displayData(DataPerusahaan dataperusahaan) {
        textAreaOutput.setText("No Izin: " + dataperusahaan.getNoIzin() + "\n");
        textAreaOutput.append("Nama Perusahaan: " + dataperusahaan.getNamaPerusahaan() + "\n");
        textAreaOutput.append("Pemilik Perusahaan: " + dataperusahaan.getPemilikPerusahaan() + "\n");
        textAreaOutput.append("Jenis Usaha: " + dataperusahaan.getJenisUsaha() + "\n");
        textAreaOutput.append("Tanggal Berdiri: " + dataperusahaan.getTanggalBerdiri() + "\n");
        textAreaOutput.append("Alamat Perusahaan: " + dataperusahaan.getAlamatPerusahaan() + "\n");
        textAreaOutput.append("Jalan: " + dataperusahaan.getJalan() + "\n");
        textAreaOutput.append("Kecamatan: " + dataperusahaan.getKecamatan() + "\n");
        textAreaOutput.append("Kota: " + dataperusahaan.getKota() + "\n");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPerusahaanGUI().setVisible(true);
            }
        });
    }
}

