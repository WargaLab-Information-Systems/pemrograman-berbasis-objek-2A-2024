/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sindy
 */
public class OperasiPembagian  extends OperasiBilangan {
    // override menulis ulang method yang sama pada subclass
    @Override
    public double operasi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
            return Double.NaN; // Mengembalikan NaN (Not a Number) untuk kasus pembagian dengan nol
        }
    }
    
    public String tampilOperasi() {
        return "pembagian";
    }
    
    @Override
    public String tampil() {
        return "Pembagian";
    }
}
