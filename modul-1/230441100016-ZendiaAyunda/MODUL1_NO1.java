/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author sindy
 */
class hewan {
    String Jenis;
    String nama;
}
class Manusia {
    String nama;
    int umur;
    String Alamat;
    
    public void berlari(){
        System.out.println("Objek ini " + this.nama + " Sedang berlari");
    }
    
    void berjalan() {
         System.out.println("Objek ini "  + this.nama + " Sedang berjalan");  
    }
    
}
public class MODUL1_NO1 {

    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        hewan hewan1 = new hewan();
        
        
        
        orang1.nama = "Amel";
        orang1.umur = 19;
        orang1.Alamat = "Sidoarjo";
        System.out.println("------------------------------");
        System.out.println("Hasil Data Objek 1");
        System.out.println("Nama objek 1 adalah " + orang1.nama);
        System.out.println("Umur objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("Alamat objek 1 adalah " + orang1.Alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");
        System.out.println("------------------------------");
        
        
        orang2.nama = "Sindy";
        orang2.umur = 19;
        orang2.Alamat = "Surabaya";
        System.out.println("Hasil Data Objek 2");
        System.out.println("Nama objek 2 adalah " + orang2.nama);
        System.out.println("Umur objek 2 adalah " + orang2.umur +" Tahun");
        System.out.println("Alamat objek 2 adalah " + orang2.Alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
        System.out.println("------------------------------");
    }
}

