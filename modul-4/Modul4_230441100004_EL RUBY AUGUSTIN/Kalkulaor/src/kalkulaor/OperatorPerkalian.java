/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulaor;

/**
 *
 * @author NAOFUMI
 */
// Class untuk operasi perkalian
// Class untuk operasi penjumlahan
class Perkalian extends OperasiMatematika {
    // Implementasi metode operasi untuk penjumlahan
    @Override
    public double operasi(double a, double b) {
        return a * b;
    }

    // Implementasi metode informasiOperasi untuk penjumlahan
    @Override
    public String informasiOperasi() {
        return "Penjumlahan";
    }
}
