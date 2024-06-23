/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author USER
 */
class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_A(double a) {
        this.A = a;
    }

    @Override
    protected void set_B(double b) {
        this.B = b;
    }

    @Override
    protected void set_C(double c) {
        this.C = c;
    }

    @Override
    protected void set_D() {
        this.C = this.A / this.B;
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

    @Override
    protected double get_D() {
        return this.C;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pembagian: " + this.C);
    }
}
