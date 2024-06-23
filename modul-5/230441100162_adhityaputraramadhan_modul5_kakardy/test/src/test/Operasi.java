/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author AdhityaPutraaa
 */
// Abstract class untuk operasi matematika
abstract class OperasiMatematika {
    // Metode abstrak untuk melakukan operasi
    public abstract double operasi(double a, double b);

    // Metode overloading untuk tiga parameter
    public double operasi(double a, double b, double c) {
        return operasi(operasi(a, b), c);
    }

    // Metode abstrak untuk memberikan deskripsi operasi
    public abstract String deskripsi();
}

