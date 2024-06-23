/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author AdhityaPutraaa
 */
// Class untuk operasi penjumlahan
class Penjumlahan extends OperasiMatematika {
    // Implementasi metode operasi untuk penjumlahan
    @Override
    public double operasi(double a, double b) {
        return a + b;
    }
    
    // Implementasi metode deskripsi untuk penjumlahan
    @Override
    public String deskripsi() {
        return "Penjumlahan";
    }
}
