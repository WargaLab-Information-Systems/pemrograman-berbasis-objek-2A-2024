/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ZENDIA AMELIA
 */
class Dosen {
    String nama;
    String alamat;
    
    public void mengajar(){
        System.out.println("sedang mengjar");
    }
    
    
}
class Manusia {
    String nama;
    int umur;
    String Alamat;
// sebuah metode yang tidak mengembalikan nilai apapun 
    public void berlari(){
        System.out.println("Objek ini " + this.nama + " Sedang berlari");
    }
    
    void berjalan() {
         System.out.println("Objek ini "  + this.nama + " Sedang berjalan");  
    }
    
}
public class TugasPraktikumPBO1 {

     public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia(); 
        Dosen firman = new Dosen();
        
        firman.mengajar();
        
        orang1.nama = "Evril";
        orang1.umur = 19;
        orang1.Alamat = "Sidoarjo";
        System.out.println("Nama objek 1 adalah " + orang1.nama);
        System.out.println("Umur objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("Alamat objek 1 adalah " + orang1.Alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");

         orang2.nama = "Gilang";
        orang2.umur = 21;
        orang2.Alamat = "Jember";
        System.out.println("Nama objek 2 adalah " + orang2.nama);
        System.out.println("Umur objek 2 adalah " + orang2.umur +" Tahun");
        System.out.println("Alamat objek 2 adalah " + orang2.Alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
     
    }
}
