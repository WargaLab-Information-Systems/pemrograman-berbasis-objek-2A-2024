package com.pkg;

class Pembagian extends OperasiMatematika {
    
    Pembagian(double a, double b) {
        super(a, b);
    }
    
    Pembagian(double a, double b, double c) {
        super(a, b, c);
    }
    
    @Override
    double hitung() {
        if (b == 0) {
            System.out.println("Terjadi kesalahan dalam pembagian");
            return 404;
        }
        return a / b;
    }
    
    @Override
    double hitung(double c) {
        if (b == 0 || c == 0) {
            System.out.println("Terjadi kesalahan dalam pembagian");
            return 404;
        }
        return a / b / c;
    }
    
    @Override
    void display() {
        if (isTwoOperands) {
            System.out.println("Hasil dari Pembagian " + a + " / " + b + " adalah " + this.hitung());
        } else {
            System.out.println("Hasil dari Pembagian " + a + " / " + b + " / " + c + " adalah " + this.hitung(c));
        }
    }
}
