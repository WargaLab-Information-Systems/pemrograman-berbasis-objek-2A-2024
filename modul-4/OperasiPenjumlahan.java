/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertama;

/**
 *
 * @author ZENDIA AMELIA
 */
public class OperasiPenjumlahan extends OperasiBilanganAbs {
    
    //adalah implrmentasi metode abstrak yang didefinisikan dalam kelas abstrak tersebut
   @Override
    protected void setA(double a) {
       this.a = a;
    }
    @Override
    protected void setB(double b){
        this.b = b;
    }
    @Override
    protected void setC() {
        this.c = a + b;
    }
   
    @Override
    protected double getA() {
        return a;
    }
    
    @Override
    protected double getB() {
        return b;
    }
    
    @Override
    protected double getC() {
        return c;
    }
    
    //Metode ini digunakan untuk menampilkan informasi tentang operasi penjumlahan
    @Override
    protected void tampil() {
        System.out.println("-------------------------------");
        System.out.println("Penjumlahan");
        System.out.println("Bilangan A :"+getA());
        System.out.println("Bilangan B :"+getB());
        System.out.println("Hasil A+B  :"+getC());
        System.out.println("---------------------------------");
  }
}
  
  