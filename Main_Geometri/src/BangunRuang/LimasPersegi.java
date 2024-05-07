/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.Persegi;
//import BangunDatar.OperasiBangunDatar;

/**
 *
 * @author hp
 */
public class LimasPersegi extends Persegi implements OperasiBangunRuang {
    public float tinggi = 0;
    public float luasPermukaanLimasPersegi, volumeLimasPersegi;

    public LimasPersegi(float sisi, float tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getLuasPermukaanLimasPersegi() {
        return luasPermukaanLimasPersegi;
    }

    public void setLuasPermukaanLimasPersegi(float luasPermukaanLimasPersegi) {
        this.luasPermukaanLimasPersegi = luasPermukaanLimasPersegi;
    }

    public float getVolumeLimasPersegi() {
        return volumeLimasPersegi;
    }

    public void setVolumeLimasPersegi(float volumeLimasPersegi) {
        this.volumeLimasPersegi = volumeLimasPersegi;
    }

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getKelilingPersegi() {
        return kelilingPersegi;
    }

    public void setKelilingPersegi(float kelilingPersegi) {
        this.kelilingPersegi = kelilingPersegi;
    }

    public float getLuasPersegi() {
        return luasPersegi;
    }

    public void setLuasPersegi(float luasPersegi) {
        this.luasPersegi = luasPersegi;
    }
    
    

    @Override
    public float menghitungLuasPermukaan() {
        luasPermukaanLimasPersegi = (float) (super.luasPersegi + 4 * (0.5 * sisi * tinggi));
        return luasPermukaanLimasPersegi;
    }

    @Override
    public float menghitungVolume() {
        volumeLimasPersegi = (super.luasPersegi * tinggi) / 3;
        return volumeLimasPersegi;
    }
    
}
