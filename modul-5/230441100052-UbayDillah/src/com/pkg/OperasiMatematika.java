package com.pkg;

abstract class OperasiMatematika {
    protected double a, b, c;
    protected boolean isTwoOperands;
    
    OperasiMatematika(double a, double b) {
        this.a = a;
        this.b = b;
        this.isTwoOperands = true;
    }
    
    OperasiMatematika(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.isTwoOperands = false;
    }
    
    abstract double hitung();
    
    abstract double hitung(double c);
    
    void display() {
        if (isTwoOperands) {
            System.out.println("Hasil: " + hitung());
        } else {
            System.out.println("Hasil: " + hitung(c));
        }
    }
}
