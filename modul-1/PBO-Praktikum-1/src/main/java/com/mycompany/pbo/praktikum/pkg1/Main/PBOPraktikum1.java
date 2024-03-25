/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.praktikum.pkg1.Main;

/**
 *
 * @author NAOFUMI
 */
class Manusia{
    String nama;
    int umur;
    
    public void berlari(){
        System.out.println("Objek ini" + this.nama + " berlari");
    }
    public void berjalan(){
        System.out.println("objek ini" + this.nama + " berjalan");
    }
}
public class PBOPraktikum1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Hanif";
        orang1.umur = 20;
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("Umur Objek 1 adalah " + orang1.umur + "Tahun");
        orang1.berlari();
        orang1.berjalan();
        System.out.println("Terimakasi");
        
        
        orang2.nama = "Angga";
        orang2.umur = 19;
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("Umur Objek 2 adalah " + orang2.umur + "Tahun");
        orang2.berlari();
        orang2.berjalan();
        System.out.println("Terimakasi");
    }
}
