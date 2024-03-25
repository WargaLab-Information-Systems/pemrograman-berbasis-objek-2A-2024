/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.pratikum.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
class Manusia {
        String nama;
        int umur;
        
    public void berlari() {
        System.out.println("Objek ini " + this.nama + " berlari");
    }
    
    public void berjalan() {
        System.out.println("Objek ini " + this.nama + " berjalan");
    }    
    }

public class PBOPratikum1 {
 
    public static void main(String[] args) {
        Manusia orang1 = new Manusia(); 
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Leyly";
        orang1.umur = 19;
        System.out.println("Nama Objek 1 adalah" + orang1.nama);
        System.out.println("Umur Objek 1 adalah" + orang1.umur + "Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");
        
        orang2.nama = "Fika";
        orang2.umur = 19;
        System.out.println("Nama Objek 2 adalah" + orang2.nama);
        System.out.println("Umur Objek 2 adalah" + orang2.umur + "Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}