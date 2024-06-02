package com.pkg;

class Perkalian extends OperasiMatematika {
    
    Perkalian(double a, double b) {
        super(a, b);
    }
    
    Perkalian(double a, double b, double c) {
        super(a, b, c);
    }
    
    @Override
    double hitung() {
        return a * b;
    }
    
    @Override
    double hitung(double c) {
        return a * b * c;
    }
    
    @Override
    void display() {
        if (isTwoOperands) {
            System.out.println("Hasil dari Perkalian " + a + " * " + b + " adalah " + this.hitung());
        } else {
            System.out.println("Hasil dari Perkalian " + a + " * " + b + " * " + c + " adalah " + this.hitung(c));
        }
    }
}
