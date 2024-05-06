/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_sederhana;

/**
 *
 * @author USER
 */
public class penjumlahan extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        A = a;
    }

    @Override
    protected void set_B(double b) {
        B = b;
    }

    @Override
    protected void set_C() {
        C = A + B;
    }

    @Override
    protected double get_A() {
        return A;
    }

    @Override
    protected double get_B() {
        return B;
    }

    @Override
    protected double get_C() {
        return C;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil penjumlahan " + get_A() + " + " + get_B() + " = " + get_C());
    }
}
