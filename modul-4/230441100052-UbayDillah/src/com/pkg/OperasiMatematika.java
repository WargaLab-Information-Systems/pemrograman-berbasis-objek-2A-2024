package com.pkg;

abstract class OperasiMatematika {
    protected double a, b;
    
    OperasiMatematika(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    abstract double hitung();
    
    abstract void display();
}