/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NAOFUMI
 */
// Class untuk operasi pengurangan
class Pengurangan extends OperasiMatematika {
    // Implementasi metode operasi untuk pengurangan
    @Override
    public double operasi(double a, double b) {
        return a - b;
    }
    
    // Implementasi metode deskripsi untuk pengurangan
    @Override
    public String deskripsi() {
        return "Pengurangan";
    }
}
