package com.pkg;

class Penjumlahan extends OperasiMatematika{
    
    Penjumlahan(double a, double b) {
        super(a, b);
    }
    
    @Override
    double hitung() {
        return a + b;
    }
    
    @Override
    void display() {
        System.out.println("Hasil dari Penjumlahan " + a + " + " + b + " adalah " + this.hitung());
    }
    
}
