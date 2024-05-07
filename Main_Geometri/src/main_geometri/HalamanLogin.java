/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_geometri;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class HalamanLogin extends JFrame implements ActionListener {

    JLabel sambutan = new JLabel("Selamat Datang!");
    JLabel tutor = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel namaLengkap = new JLabel("Nama Lengkap");
    JTextField inputNama = new JTextField();
    JLabel jenisKelamin = new JLabel("Jenis Kelamin");
    JRadioButton pilihCowo = new JRadioButton("Laki-laki", true);
    JRadioButton pilihCewe = new JRadioButton("Perempuan");
    JButton tombolLogin = new JButton("Login");

    public HalamanLogin() {
        JFrame kotakFrameLogin = new JFrame();

        kotakFrameLogin.setSize(700, 600);
        kotakFrameLogin.setTitle("Halaman Login");

        kotakFrameLogin.setLayout(null);
        kotakFrameLogin.setLocationRelativeTo(null);

        Font font = sambutan.getFont();
        sambutan.setFont(new Font(font.getName(), Font.PLAIN, 24));

        kotakFrameLogin.add(sambutan);
        kotakFrameLogin.add(tutor);
        kotakFrameLogin.add(namaLengkap);
        kotakFrameLogin.add(inputNama);
        kotakFrameLogin.add(jenisKelamin);
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihCowo);
        pilihJenisKelamin.add(pilihCewe);
        kotakFrameLogin.add(pilihCowo);
        kotakFrameLogin.add(pilihCewe);
        kotakFrameLogin.add(tombolLogin);

        sambutan.setBounds(20, 20, 200, 30);
        tutor.setBounds(20, 50, 300, 30);
        namaLengkap.setBounds(20, 80, 100, 30);
        inputNama.setBounds(20, 110, 640, 30);
        jenisKelamin.setBounds(20, 150, 100, 30);
        pilihCowo.setBounds(20, 180, 100, 30);
        pilihCewe.setBounds(220, 180, 100, 30);
        tombolLogin.setBounds(20, 220, 640, 30);
        tombolLogin.setHorizontalAlignment(JButton.CENTER);

        tombolLogin.addActionListener(this);

        kotakFrameLogin.setVisible(true);
        kotakFrameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String outputNama = inputNama.getText();
            String outputJenisKelamin = pilihCowo.isSelected() ? "Mr. " : "Mrs. ";
            
            if (outputNama.isEmpty()) {
                throw new Exception("Tolong di isi");
            }
            
            new HalamanGeometri(outputNama, outputJenisKelamin);
            this.dispose();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
}
