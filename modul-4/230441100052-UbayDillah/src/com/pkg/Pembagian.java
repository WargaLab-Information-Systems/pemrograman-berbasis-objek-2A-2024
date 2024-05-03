package com.pkg;

class Pembagian extends OperasiMatematika{
    
    Pembagian(double a, double b) {
        super(a, b);
    }
    
    @Override
    double hitung() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Terjadi kesalahan dalam pembagian");
            return 404;
        }
    }
    
    @Override
    void display() {
        System.out.println("Hasil dari Pembagian " + a + " / " + b + " adalah " + this.hitung());
    }
}