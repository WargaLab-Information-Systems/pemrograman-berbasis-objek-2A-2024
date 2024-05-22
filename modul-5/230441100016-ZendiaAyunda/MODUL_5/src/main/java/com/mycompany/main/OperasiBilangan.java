/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sindy
 */
// abstract class adalah class yang masih berisi varibale dan method tanpa detail
public abstract class OperasiBilangan {
    public abstract double operasi(double a, double b);
    
    // polimorfisme method yang sama dan mempunyai respon yang berbeda"
    // overloading method yang sama dengan parameter yang berbeda
    public double operasi(double a, double b, double c) {
        return operasi(operasi(a, b), c);
    }
    
    public abstract String tampilOperasi();
    // abstract method
    public abstract String tampil();
}
