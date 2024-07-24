package Contoh_GUI.Contoh_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MahasiswaGUI extends JFrame implements ActionListener {
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
    public MahasiswaGUI() {
        // Mengatur judul jendela
        setTitle("Entri Data Mahasiswa");

        // Mengatur layout
        setLayout(new FlowLayout());

        // Inisialisasi komponen
        labelNIM = new JLabel("NIM: ");
        textNIM = new JTextField(15);

        labelProdi = new JLabel("Prodi: ");
        comboProdi = new JComboBox<>(new String[] {"Informatika", "Sistem Informasi", "Akutansi", "Agroteknologi", "Agrobisnis"});

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
        add(labelNIM);
        add(textNIM);
        add(labelProdi);
        add(comboProdi);
        add(labelNama);
        add(textNama);
        add(labelJenisKelamin);
        add(radioLaki);
        add(radioPerempuan);
        add(labelTanggalLahir);
        add(textTanggalLahir);
        add(labelTempatLahir);
        add(textTempatLahir);
        add(labelJalan);
        add(textJalan);
        add(labelKelurahan);
        add(textKelurahan);
        add(labelKecamatan);
        add(textKecamatan);
        add(labelKota);
        add(textKota);
        add(buttonSubmit);
        add(new JScrollPane(textAreaOutput));

        // Menambahkan action listener untuk tombol
        buttonSubmit.addActionListener(this);

        // Mengatur ukuran jendela
        setSize(400, 500);
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
