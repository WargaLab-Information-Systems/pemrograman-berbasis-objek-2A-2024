/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.modul4;


class Perkalian extends OperasiMatematika {
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
        this.c = this.a * this.b;
    }

    @Override
    protected double getA() {
        return this.a;
    }

    @Override
    protected double getB() {
        return this.b;
    }
    @Override
    protected double getC() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("-------Operasi Pengurangan-------");
        System.out.println("Nilai A: " + this.a);
        System.out.println("Nilai B: " + this.b);
        System.out.println("Hasil Nilai A*B:  " + this.c);
    }
}