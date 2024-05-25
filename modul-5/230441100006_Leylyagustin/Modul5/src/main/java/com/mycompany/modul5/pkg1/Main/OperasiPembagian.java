/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
public class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_D() {
        if (this.b != 0 && this.c != 0) {
            this.d = this.a / this.b / this.c;
        } else {
            System.out.println("bilangan nol tidak bisa dibagi");
            this.d = Double.NaN;
        }
    }
    @Override
    protected double get_D() {
        return this.d;
    }
    @Override
    protected void tampil(){
        System.out.println("Hasil Pembagian");
        System.out.println(" A / B / C = "+ get_D());
    }
//    overloading     
    @Override
    protected void Operasi(double a, double b, double c) {
        System.out.println("Operasi dengan tiga angka: " + a + " / " + b + " / " + c + " = "+(a/b/c) );
    }
}