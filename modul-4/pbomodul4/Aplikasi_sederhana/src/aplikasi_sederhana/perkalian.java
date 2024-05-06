/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_sederhana;

/**
 *
 * @author USER
 */
public class perkalian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        this.A = a;
    }

    @Override
    protected void set_B(double b) {
        this.B = b;
    }

    @Override
    protected void set_C() {
        hitung(); // Menghitung C di sini
    }

    @Override
    protected double get_A() {
        return this.A;
    }

    @Override
    protected double get_B() {
        return this.B;
    }

    @Override
    protected double get_C() {
        return this.C;
    }

    protected void hitung() {
        this.C = this.A * this.B;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil penjumlahan " + get_A() + " x " + get_B() + " = " + get_C());
    }
}

