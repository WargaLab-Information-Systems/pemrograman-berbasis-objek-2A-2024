/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
// Class untuk operasi pembagian
class Pembagian extends OperasiMatematika {
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
        if (b != 0) {
            this.c = a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak dapat dilakukan.");
        }
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
        System.out.println("Hasil pembagian: " + getC());
    }
}


    
