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
public class Kubus extends Persegi implements OperasiBangunRuang {
    public float luasPermukaanKubus, volumeKubus;
    
    public Kubus(float sisi) {
        super(sisi);
    }

    public float getLuasPermukaanKubus() {
        return luasPermukaanKubus;
    }

    public void setLuasPermukaanKubus(float luasPermukaanKubus) {
        this.luasPermukaanKubus = luasPermukaanKubus;
    }

    public float getVolumeKubus() {
        return volumeKubus;
    }

    public void setVolumeKubus(float volumeKubus) {
        this.volumeKubus = volumeKubus;
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
        luasPermukaanKubus = 6*super.luasPersegi;
        return luasPermukaanKubus;
    }

    @Override
    public float menghitungVolume() {
        volumeKubus = sisi*super.luasPersegi;
        return volumeKubus;
    }
}
