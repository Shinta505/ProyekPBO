/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author hp
 */
public class Persegi implements OperasiBangunDatar {
    public float sisi = 0;
    public float kelilingPersegi, luasPersegi;
    
    public Persegi(float sisi) {
        this.sisi = sisi;
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
    public float menghitungKeliling() {
      kelilingPersegi = 4*sisi;
      return kelilingPersegi;
    }

    @Override
    public float menghitungLuas() {
      luasPersegi = sisi*sisi;
      return luasPersegi;
    }
    
}
