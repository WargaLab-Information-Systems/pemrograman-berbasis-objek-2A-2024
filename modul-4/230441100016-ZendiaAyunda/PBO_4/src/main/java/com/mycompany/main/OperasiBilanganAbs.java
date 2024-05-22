/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sindy
 */
// parents class atau abstract class 
public abstract class OperasiBilanganAbs {
    // protected digunakan untuk bisa diakses oleh kelas-kelas dalam paket yang sama serta kelas-kelas turunannya. 
    protected double a, b, c;
    
    protected abstract void setA(double a);
    protected abstract void setB(double b);
    protected abstract void setC();
    
    protected abstract double getA();
    protected abstract double getB();
    protected abstract double getC();
    
    protected abstract void tampil();
}
