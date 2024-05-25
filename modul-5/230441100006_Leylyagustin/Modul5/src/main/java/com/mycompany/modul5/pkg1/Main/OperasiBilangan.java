/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
public abstract class OperasiBilangan {
    protected double a, b, c, d;
    protected void set_A(double a) {
        this.a = a;
    }
    protected void set_B(double b) {
        this.b = b;
    }
    protected void set_C(double c) {
        this.c = c;
    }
    protected abstract void set_D();             
    protected double get_A() {
        return this.a;
    }
    protected double get_B() {
        return this.b;
    }
    protected double get_C() {
        return this.c;
    }
    protected abstract double get_D();    
    protected abstract void tampil();
    
//    overloading   
    protected void Operasi(double a, double b, double c) {
        System.out.println("Operasi dengan tiga angka: " + a + ", " + b + ", " + c);
    }
}