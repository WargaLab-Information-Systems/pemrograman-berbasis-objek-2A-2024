/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ZENDIA AMELIA
 */
public abstract class OperasiBilangan {
   public abstract double operasi(double a, double b);
//overloading mempunyai method yg sama dengan parameter yg berbeda
    public double operasi(double a, double b, double c) {
        return operasi(operasi(a, b), c);
    }

    public abstract String tampil();

    boolean tampiloperasi() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


 