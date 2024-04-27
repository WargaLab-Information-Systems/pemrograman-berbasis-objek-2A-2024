/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author sindy
 */ 
// child class
class Library extends Book {
    
    // method subclass yang menimpa parent class
    @Override
    public void display(){
    super.display();
    }
    
    public Library(String Judul, String Penulis, String Publisher, String Kategori,int Tahun, int Stok){
        super(Judul, Penulis, Publisher, Kategori);
        this.Tahun=Tahun;
        this.Stok=Stok;
    }
     
    int Tahun;
    int Stok;
    
    public void setTahun(int Tahun){
        this.Tahun = Tahun;
    }
    public int getTahun(){
       return Tahun;
    }
    public void setStok(int Stok){
        this.Stok = Stok;
    }
    public int getStok(){
       return Stok;
    }
     
    public void setKat(String Kategori){
        switch (Kategori) {
            case "SU":
                this.Kategori= SU();
                break;
            case "R":
                this.Kategori= R();
                break;
            case "D":
                this.Kategori= D();
                break;
            case "A":
                this.Kategori= A();
                break;
            default:
                this.Kategori = No();
                break;
    }
  }
}

