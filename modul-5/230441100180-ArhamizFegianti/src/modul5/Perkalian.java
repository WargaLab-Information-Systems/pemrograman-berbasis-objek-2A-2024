/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Amira Alissiya
 */
// Class untuk operasi penjumlahan
class Perkalian extends Operation {
    @Override
    public double operasi(double a, double b) {
        return a * b;
    }
    
    @Override
    public String tampil() {
        return "Perkalian";
}
}

