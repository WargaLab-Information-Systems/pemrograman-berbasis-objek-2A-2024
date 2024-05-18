/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project4;

/**
 *
 * @author Amira Alissiya
 */

import java.util.Scanner;


abstract class Kalkulator {
    protected double a =0;
    protected double b =0;
    
    public void setA(double a){
        this.a = a;
    }
    
    public void setB(double b){
        this.b = b;
    }
     
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    public abstract void tampil();   
}


public class Main {

    public static void main(String[] args) {
//       double A= 9.25;
//       double B = 1.25;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai A: ");
        double A = input.nextDouble();
        System.out.println("Masukkan Nilai B: ");
        double B = input.nextDouble();
   
       Kalkulator Penjumlahan = new Penjumlahan();
       Kalkulator Pengurangan = new Pengurangan();
       Kalkulator Perkalian = new Perkalian();
       Kalkulator Pembagian = new Pembagian();
       
       Penjumlahan.setA(A);
       Penjumlahan.setB(B);
       Pengurangan.setA(A);
       Pengurangan.setB(B);
       Perkalian.setA(A);
       Perkalian.setB(B);
       Pembagian.setA(A);
       Pembagian.setB(B);
       
       System.out.println("Nilai A : " + A);
       System.out.println("Nilai B : " + B);
       Penjumlahan.tampil();
       Pengurangan.tampil();
       Perkalian.tampil();
       Pembagian.tampil();

    }
    
}