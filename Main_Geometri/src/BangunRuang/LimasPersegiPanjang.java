/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.PersegiPanjang;

/**
 *
 * @author hp
 */
public class LimasPersegiPanjang extends PersegiPanjang implements OperasiBangunRuang {
    public float tinggi = 0;
    public float luasPermukaanLimasPersegiPanjang, volumeLimasPersegiPanjang;

    public LimasPersegiPanjang(float panjang, float lebar, float tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getLuasPermukaanLimasPersegiPanjang() {
        return luasPermukaanLimasPersegiPanjang;
    }

    public void setLuasPermukaanLimasPersegiPanjang(float luasPermukaanLimasPersegiPanjang) {
        this.luasPermukaanLimasPersegiPanjang = luasPermukaanLimasPersegiPanjang;
    }

    public float getVolumeLimasPersegiPanjang() {
        return volumeLimasPersegiPanjang;
    }

    public void setVolumeLimasPersegiPanjang(float volumeLimasPersegiPanjang) {
        this.volumeLimasPersegiPanjang = volumeLimasPersegiPanjang;
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
        luasPermukaanLimasPersegiPanjang = super.luasPersegiPanjang + 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        return luasPermukaanLimasPersegiPanjang;
    }

    @Override
    public float menghitungVolume() {
        volumeLimasPersegiPanjang = (super.luasPersegiPanjang * tinggi) / 3;
        return volumeLimasPersegiPanjang;
    }
    
}
