/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author AdhityaPutraaa
 */
// Class untuk operasi pembagian
class Pembagian extends OperasiMatematika {
    // Implementasi metode operasi untuk pembagian
    @Override
    public double operasi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
            return Double.NaN; // Mengembalikan NaN (Not a Number) untuk kasus pembagian dengan nol
        }
    }
    
    // Implementasi metode deskripsi untuk pembagian
    @Override
    public String deskripsi() {
        return "Pembagian";
    }
}
