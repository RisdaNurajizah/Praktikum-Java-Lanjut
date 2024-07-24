package Contoh_GUI.Contoh_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MahasiswaGUI2 extends JFrame implements ActionListener {
    // Deklarasi komponen GUI
    private JLabel labelNIM, labelProdi, labelNama, labelJenisKelamin, labelTanggalLahir, labelTempatLahir;
    private JLabel labelJalan, labelKelurahan, labelKecamatan, labelKota;
    private JTextField textNIM, textNama, textTanggalLahir, textTempatLahir;
    private JTextField textJalan, textKelurahan, textKecamatan, textKota;
    private JComboBox<String> comboProdi;
    private JRadioButton radioLaki, radioPerempuan;
    private JButton buttonSubmit;
    private JTextArea textAreaOutput;
    private ButtonGroup groupJenisKelamin;

    // Konstruktor untuk mengatur komponen GUI
    public MahasiswaGUI2() {
        // Mengatur judul jendela
        setTitle("Entri Data Mahasiswa");

        // Mengatur layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Inisialisasi komponen
        labelNIM = new JLabel("NIM: ");
        textNIM = new JTextField(15);

        labelProdi = new JLabel("Prodi: ");
        comboProdi = new JComboBox<>(new String[] {"Informatika", "Sistem Informasi", "Akuntansi", "Agroteknologi", "Agrobisnis"});

        labelNama = new JLabel("Nama: ");
        textNama = new JTextField(20);

        labelJenisKelamin = new JLabel("Jenis Kelamin: ");
        radioLaki = new JRadioButton("Laki-laki");
        radioPerempuan = new JRadioButton("Perempuan");
        groupJenisKelamin = new ButtonGroup();
        groupJenisKelamin.add(radioLaki);
        groupJenisKelamin.add(radioPerempuan);

        labelTanggalLahir = new JLabel("Tanggal Lahir: ");
        textTanggalLahir = new JTextField(10);

        labelTempatLahir = new JLabel("Tempat Lahir: ");
        textTempatLahir = new JTextField(20);

        labelJalan = new JLabel("Jalan: ");
        textJalan = new JTextField(20);

        labelKelurahan = new JLabel("Kelurahan: ");
        textKelurahan = new JTextField(20);

        labelKecamatan = new JLabel("Kecamatan: ");
        textKecamatan = new JTextField(20);

        labelKota = new JLabel("Kota: ");
        textKota = new JTextField(20);

        buttonSubmit = new JButton("Submit");
        textAreaOutput = new JTextArea(10, 30);
        textAreaOutput.setEditable(false);

        // Menambahkan komponen ke jendela
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(labelNIM, gbc);
        gbc.gridx = 1;
        add(textNIM, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(labelProdi, gbc);
        gbc.gridx = 1;
        add(comboProdi, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(labelNama, gbc);
        gbc.gridx = 1;
        add(textNama, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(labelJenisKelamin, gbc);
        gbc.gridx = 1;
        add(radioLaki, gbc);
        gbc.gridy = 4;
        gbc.gridx = 1;
        add(radioPerempuan, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(labelTanggalLahir, gbc);
        gbc.gridx = 1;
        add(textTanggalLahir, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(labelTempatLahir, gbc);
        gbc.gridx = 1;
        add(textTempatLahir, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        add(labelJalan, gbc);
        gbc.gridx = 1;
        add(textJalan, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        add(labelKelurahan, gbc);
        gbc.gridx = 1;
        add(textKelurahan, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        add(labelKecamatan, gbc);
        gbc.gridx = 1;
        add(textKecamatan, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        add(labelKota, gbc);
        gbc.gridx = 1;
        add(textKota, gbc);

        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(buttonSubmit, gbc);

        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JScrollPane(textAreaOutput), gbc);

        // Menambahkan action listener untuk tombol
        buttonSubmit.addActionListener(this);

        // Mengatur ukuran jendela
        setSize(400, 700);
        // Menutup aplikasi saat jendela ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Menampilkan jendela
        setVisible(true);
    }

    // Implementasi method actionPerformed untuk menangani event tombol
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSubmit) {
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
            textAreaOutput.append("Alamat:\n");
            textAreaOutput.append("  Jalan: " + jalan + "\n");
            textAreaOutput.append("  Kelurahan: " + kelurahan + "\n");
            textAreaOutput.append("  Kecamatan: " + kecamatan + "\n");
            textAreaOutput.append("  Kota: " + kota + "\n");
            textAreaOutput.append("---------------------\n");

            // Mengosongkan field teks
            textNIM.setText("");
            textNama.setText("");
            groupJenisKelamin.clearSelection();
            textTanggalLahir.setText("");
            textTempatLahir.setText("");
            textJalan.setText("");
            textKelurahan.setText("");
            textKecamatan.setText("");
            textKota.setText("");
        }
    }

    public static void main(String[] args) {
        // Membuat instance dari kelas MahasiswaGUI
        new MahasiswaGUI();
    }
}
