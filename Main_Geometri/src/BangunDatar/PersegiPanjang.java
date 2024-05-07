/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author hp
 */
public class PersegiPanjang implements OperasiBangunDatar{
    public float panjang = 0;
    public float lebar = 0;
    public float kelilingPersegiPanjang, luasPersegiPanjang;
    
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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
    public float menghitungKeliling() {
        kelilingPersegiPanjang = 2*panjang + 2*lebar;
        return kelilingPersegiPanjang;
    }

    @Override
    public float menghitungLuas() {
        luasPersegiPanjang = panjang*lebar;
        return luasPersegiPanjang;
    }
    
    
}
