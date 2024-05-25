/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author USER
 */
class OperasiPengurangan extends OperasiBilangan {
    double D;
    protected void set_A(int a) {
        A = (double) a; 
    }

    @Override
    protected void set_A(double a) {
        A = a;
    }

    protected void set_B(int b) {
        B = (double) b; 
    }

    @Override
    protected void set_B(double b) {
        B = b;
    }

    protected void set_C(int c) {
        C = (double) c; 
    }

    @Override
    protected void set_C(double c) {
        C = c;
    }

    @Override
    protected void set_D() {
        D = A - B - C;
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
    protected double get_D() {
        return D;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil pengurangan " + get_A() + " - " + get_B() + " - " + get_C()+ " = " + get_D());
    }

}
