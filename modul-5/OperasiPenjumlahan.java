/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ZENDIA AMELIA
 */
public class OperasiPenjumlahan extends OperasiBilangan{
 
    //method yang di timpa
    @Override
    public double operasi(double a, double b) {
        return a + b;
    } 
    
    @Override
    public String tampil() {
        return "Pejumlahan";
    }
}

