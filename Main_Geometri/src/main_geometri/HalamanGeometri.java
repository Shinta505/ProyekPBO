/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_geometri;

import HalamanPerhitunganGeometri.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author hp
 */
public class HalamanGeometri extends JFrame implements ActionListener {
    JLabel sambutan = new JLabel();
    JLabel tutor = new JLabel("Silahkan pilih salah satu menu untuk melakukan perhitungan!");
    JButton pilihPersegi = new JButton("Persegi");
    JButton pilihPersegiPanjang = new JButton("Persegi Panjang");
    JButton kembali = new JButton("Kembali");
    
    public HalamanGeometri(String outputNama, String outputJenisKelamin) {
        JFrame kotakFrameHalamanGeometri = new JFrame();
        
        kotakFrameHalamanGeometri.setSize(700, 600);
        kotakFrameHalamanGeometri.setTitle("Halaman Geometri");
        
        kotakFrameHalamanGeometri.setLayout(null);
        kotakFrameHalamanGeometri.setLocationRelativeTo(null);
        
        Font font = sambutan.getFont();
        sambutan.setFont(new Font(font.getName(), Font.PLAIN, 24));
        
        kotakFrameHalamanGeometri.add(sambutan);
        kotakFrameHalamanGeometri.add(tutor);
        kotakFrameHalamanGeometri.add(pilihPersegi);
        kotakFrameHalamanGeometri.add(pilihPersegiPanjang);
        kotakFrameHalamanGeometri.add(kembali);
        
        sambutan.setText("Welcome, " + outputJenisKelamin + outputNama);
        
        sambutan.setBounds(20, 20, 500, 30);
        tutor.setBounds(20, 50, 500, 30);
        pilihPersegi.setBounds(20, 150, 640, 40);
        pilihPersegiPanjang.setBounds(20, 200, 640, 40);
        kembali.setBounds(20, 290, 640, 40);
        
        pilihPersegi.setHorizontalAlignment(JButton.CENTER);
        pilihPersegiPanjang.setHorizontalAlignment(JButton.CENTER);
        kembali.setHorizontalAlignment(JButton.CENTER);
        
        pilihPersegi.addActionListener(this);
        pilihPersegiPanjang.addActionListener(this);
        kembali.addActionListener(this);
        
        kotakFrameHalamanGeometri.setVisible(true);
        kotakFrameHalamanGeometri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pilihPersegi) {
            new HalamanPersegi();
        } else if (e.getSource() == pilihPersegiPanjang) {
            new HalamanPersegiPanjang();
        } else if (e.getSource() == kembali) {
            new HalamanLogin();
        }
    }
}
