package com.pkg;

class Pengurangan extends OperasiMatematika{
    
    Pengurangan(double a, double b) {
        super(a, b);
    }
    
    @Override
    double hitung() {
        return a - b;
    }
    
     @Override
    void display() {
        System.out.println("Hasil dari Pengurangan " + a + " - " + b + " adalah " + this.hitung());
    }
}