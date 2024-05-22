/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sindy
 */
public class OperasiPengurangan extends OperasiBilangan {
    @Override
    public double operasi(double a, double b) {
        return a - b;
    }
    
    public String tampilOperasi() {
        return "pengurangan";
    }
    
    @Override
    public String tampil() {
        return "Pengurangan";
    }
}
