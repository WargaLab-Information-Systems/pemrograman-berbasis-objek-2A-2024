/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class OperasiPengurangan extends OperasiBilanganAbs {

    private double a;
    private double b;
    private double c;
    @Override
    protected void set_A(double a) {
        this.a = a;
    }
    @Override
    protected void set_B(double b) {
        this.b = b;
    }
    @Override
    protected void set_C() {
        this.c = this.a - this.b;
    }
    protected double get_A() {
        return this.a;
    }
    protected double get_B() {
        return this.b;
    }
    protected double get_C() {
        return this.c;
    }
    @Override
    protected void tampil() {
        System.out.println("Hasil Pengurangan");
        System.out.println("A - B = " + get_C());
    }
}
