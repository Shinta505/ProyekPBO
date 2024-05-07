/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.PersegiPanjang;
//import BangunDatar.OperasiBangunDatar;

/**
 *
 * @author hp
 */
public class Balok extends PersegiPanjang implements OperasiBangunRuang {
    public float tinggi = 0;
    public float luasPermukaanBalok, volumeBalok;
    
    public Balok(float panjang, float lebar, float tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getLuasPermukaanBalok() {
        return luasPermukaanBalok;
    }

    public void setLuasPermukaanBalok(float luasPermukaanBalok) {
        this.luasPermukaanBalok = luasPermukaanBalok;
    }

    public float getVolumeBalok() {
        return volumeBalok;
    }

    public void setVolumeBalok(float volumeBalok) {
        this.volumeBalok = volumeBalok;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }

    public void setKelilingPersegiPanjang(float kelilingPersegiPanjang) {
        this.kelilingPersegiPanjang = kelilingPersegiPanjang;
    }

    public float getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    public void setLuasPersegiPanjang(float luasPersegiPanjang) {
        this.luasPersegiPanjang = luasPersegiPanjang;
    }
    
    
    @Override
    public float menghitungLuasPermukaan() {
        luasPermukaanBalok = 2 * (super.luasPersegiPanjang + (super.kelilingPersegiPanjang * tinggi));
        return luasPermukaanBalok;
    }

    @Override
    public float menghitungVolume() {
        volumeBalok = super.luasPersegiPanjang*tinggi; 
        return volumeBalok;
    }
    
}
