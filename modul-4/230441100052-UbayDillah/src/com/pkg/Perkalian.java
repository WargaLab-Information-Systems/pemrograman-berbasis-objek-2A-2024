package com.pkg;

class Perkalian extends OperasiMatematika{
    
    Perkalian(double a, double b) {
        super(a, b);
    }
    
    @Override
    double hitung() {
        return a * b;
    }
    
    @Override
    void display() {
        System.out.println("Hasil dari Perkalian " + a + " * " + b + " adalah " + this.hitung());
    }
}
