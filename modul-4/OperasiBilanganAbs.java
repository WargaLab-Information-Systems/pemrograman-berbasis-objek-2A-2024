/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertama;

/**
 *
 * @author ZENDIA AMELIA
 */
//Kelas abstrak tidak dapat diinstansiasi secara langsung
public abstract class OperasiBilanganAbs {  
  //variabel kelas yang digunakan untuk menyimpan bilangan yang akan digunakan dalam operasi.
  protected double a, b, c;
  
  // set untuk menambahkan nilai dalam bilangan
  protected abstract void setA(double a);
  protected abstract void setB(double b);
  protected abstract void setC();
  
  // get untuk mengembalikan nilai dalam bilangan
  protected abstract double getA();
  protected abstract double getB();
  protected abstract double getC();
  
  // untuk menampilkan hasil operasi bilangan
  //tidak memiliki implementasi dan akan diimplementasikan oleh kelas turunan.
  protected abstract void tampil();
} 
