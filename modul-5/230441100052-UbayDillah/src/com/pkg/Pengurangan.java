package com.pkg;

class Pengurangan extends OperasiMatematika {
    
    Pengurangan(double a, double b) {
        super(a, b);
    }
    
    Pengurangan(double a, double b, double c) {
        super(a, b, c);
    }
    
    @Override
    double hitung() {
        return a - b;
    }
    
    @Override
    double hitung(double c) {
        return a - b - c;
    }
    
    @Override
    void display() {
        if (isTwoOperands) {
            System.out.println("Hasil dari Pengurangan " + a + " - " + b + " adalah " + this.hitung());
        } else {
            System.out.println("Hasil dari Pengurangan " + a + " - " + b + " - " + c + " adalah " + this.hitung(c));
        }
    }
}
