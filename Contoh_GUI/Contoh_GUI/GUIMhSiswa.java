package Contoh_GUI.Contoh_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMhSiswa extends javax.swing.JFrame {

    // Deklarasi komponen GUI
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JLabel labelNIM, labelProdi, labelNama, labelJenisKelamin, labelTanggalLahir, labelTempatLahir;
    private javax.swing.JLabel labelJalan, labelKelurahan, labelKecamatan, labelKota;
    private javax.swing.JTextField textNIM, textNama, textTanggalLahir, textTempatLahir;
    private javax.swing.JTextField textJalan, textKelurahan, textKecamatan, textKota;
    private javax.swing.JComboBox<String> comboProdi;
    private javax.swing.JRadioButton radioLaki, radioPerempuan;
    private javax.swing.ButtonGroup groupJenisKelamin;
    private javax.swing.JTextArea textAreaOutput;
    private javax.swing.JScrollPane scrollPaneOutput;

    // Konstruktor untuk mengatur komponen GUI
    public GUIMhSiswa() {
        initComponents();
    }

    private void initComponents() {

        // Inisialisasi komponen
        labelNIM = new javax.swing.JLabel("NIM: ");
        textNIM = new javax.swing.JTextField(15);

        labelProdi = new javax.swing.JLabel("Prodi: ");
        comboProdi = new javax.swing.JComboBox<>(new String[]{"Informatika", "Sistem Informasi", "Akuntansi", "Agroteknologi", "Agrobisnis"});

        labelNama = new javax.swing.JLabel("Nama: ");
        textNama = new javax.swing.JTextField(20);

        labelJenisKelamin = new javax.swing.JLabel("Jenis Kelamin: ");
        radioLaki = new javax.swing.JRadioButton("Laki-laki");
        radioPerempuan = new javax.swing.JRadioButton("Perempuan");
        groupJenisKelamin = new javax.swing.ButtonGroup();
        groupJenisKelamin.add(radioLaki);
        groupJenisKelamin.add(radioPerempuan);

        labelTanggalLahir = new javax.swing.JLabel("Tanggal Lahir: ");
        textTanggalLahir = new javax.swing.JTextField(10);

        labelTempatLahir = new javax.swing.JLabel("Tempat Lahir: ");
        textTempatLahir = new javax.swing.JTextField(20);

        labelJalan = new javax.swing.JLabel("Jalan: ");
        textJalan = new javax.swing.JTextField(20);

        labelKelurahan = new javax.swing.JLabel("Kelurahan: ");
        textKelurahan = new javax.swing.JTextField(20);

        labelKecamatan = new javax.swing.JLabel("Kecamatan: ");
        textKecamatan = new javax.swing.JTextField(20);

        labelKota = new javax.swing.JLabel("Kota: ");
        textKota = new javax.swing.JTextField(20);

        buttonSubmit = new javax.swing.JButton("Submit");
        textAreaOutput = new javax.swing.JTextArea(10, 30);
        textAreaOutput.setEditable(false);
        scrollPaneOutput = new javax.swing.JScrollPane(textAreaOutput);

        buttonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // GroupLayout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelKota)
                            .addComponent(labelKecamatan)
                            .addComponent(labelKelurahan)
                            .addComponent(labelJalan)
                            .addComponent(labelTempatLahir)
                            .addComponent(labelTanggalLahir)
                            .addComponent(labelJenisKelamin)
                            .addComponent(labelNama)
                            .addComponent(labelProdi)
                            .addComponent(labelNIM))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textNIM)
                            .addComponent(comboProdi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textNama)
                            .addComponent(textTanggalLahir)
                            .addComponent(textTempatLahir)
                            .addComponent(textJalan)
                            .addComponent(textKelurahan)
                            .addComponent(textKecamatan)
                            .addComponent(textKota)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioLaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPerempuan)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(scrollPaneOutput, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNIM)
                    .addComponent(textNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdi)
                    .addComponent(comboProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisKelamin)
                    .addComponent(radioLaki)
                    .addComponent(radioPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTanggalLahir)
                    .addComponent(textTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTempatLahir)
                    .addComponent(textTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJalan)
                    .addComponent(textJalan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKelurahan)
                    .addComponent(textKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKecamatan)
                    .addComponent(textKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKota)
                    .addComponent(textKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        pack();
    }

    private void buttonSubmitActionPerformed(ActionEvent evt) {
        // Mendapatkan data dari field teks dan combo box
        String nim = textNIM.getText();
        String prodi = (String) comboProdi.getSelectedItem();
        String nama = textNama.getText();
        String jenisKelamin = radioLaki.isSelected() ? "Laki-laki" : "Perempuan";
        String tanggalLahir = textTanggalLahir.getText();
        String tempatLahir = textTempatLahir.getText();
        String jalan = textJalan.getText();
        String kelurahan = textKelurahan.getText();
        String kecamatan = textKecamatan.getText();
        String kota = textKota.getText();

        // Menampilkan data di text area
        textAreaOutput.append("NIM: " + nim + "\n");
        textAreaOutput.append("Prodi: " + prodi + "\n");
        textAreaOutput.append("Nama: " + nama + "\n");
        textAreaOutput.append("Jenis Kelamin: " + jenisKelamin + "\n");
        textAreaOutput.append("Tanggal Lahir: " + tanggalLahir + "\n");
        textAreaOutput.append("Tempat Lahir: " + tempatLahir + "\n");
        textAreaOutput.append("Jalan: " + jalan + "\n");
        textAreaOutput.append("Kelurahan: " + kelurahan + "\n");
        textAreaOutput.append("Kecamatan: " + kecamatan + "\n");
        textAreaOutput.append("Kota: " + kota + "\n");
        textAreaOutput.append("\n");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMhSiswa().setVisible(true);
            }
        });
    }
}