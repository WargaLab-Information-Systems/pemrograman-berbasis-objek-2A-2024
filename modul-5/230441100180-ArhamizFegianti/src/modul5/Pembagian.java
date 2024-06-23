/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Amira Alissiya
 */
class Pembagian extends Operation {
    @Override
    public double operasi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
            return Double.NaN; // NaN (Not a Number) untuk kasus pembagian dengan nol
        }
    }
    
    @Override
    public String tampil() {
        return "Pembagian";
}
}