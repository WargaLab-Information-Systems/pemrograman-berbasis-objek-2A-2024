/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
public class OperasiPembagian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        if (this.b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan");
        } else {
            this.c = this.a / this.b;
        }
    }

    @Override
    protected void get_A() {
        System.out.println("Nilai A: " + this.a);
    }

    @Override
    protected void get_B() {
        System.out.println("Nilai B: " + this.b);
    }

    @Override
    protected void get_C() {
        if (this.b != 0) {
            System.out.println("Hasil Pembagian: " + this.c);
        }
    }

    @Override
    protected void tampil() {
        get_A();
        get_B();
        set_C();
        get_C();
    }
}