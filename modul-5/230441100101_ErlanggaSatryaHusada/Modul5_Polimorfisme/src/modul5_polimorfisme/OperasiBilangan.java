/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5_polimorfisme;

/**
 *
 * @author Erlangga Satrya H
 */
public abstract class OperasiBilangan {
    protected double a, b, c, d;

    public void set_A(double a) {
        this.a = a;
    }

    public void set_B(double b) {
        this.b = b;
    }

    public void set_C(double c) {
        this.c = c;
    }

    public abstract void set_D();

    public double get_A() {
        return a;
    }

    public double get_B() {
        return b;
    }

    public double get_C() {
        return c;
    }

    public double get_D() {
        return d;
    }

    public void tampil(String operasi) {
        System.out.println("Hasil " + operasi + ": " + d);
    }
}