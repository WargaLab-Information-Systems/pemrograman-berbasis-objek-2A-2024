/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// Subclass for subtraction operation
class OperasiPengurangan extends OperasiBilanganAbs {
    @Override
    protected void setA(double a) {
        this.a = a;
    }

    @Override
    protected void setB(double b) {
        this.b = b;
    }

    @Override
    protected void setC() {
        this.c = a - b;
    }

    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil pengurangan: " + getC());
    }
}