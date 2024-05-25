/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NAOFUMI
 */
// Class untuk operasi perkalian
class Perkalian extends OperasiMatematika {
    // Implementasi metode operasi untuk perkalian
    @Override
    public double operasi(double a, double b) {
        return a * b;
    }
    
    // Implementasi metode deskripsi untuk perkalian
    @Override
    public String deskripsi() {
        return "Perkalian";
    }
}