/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author AdhityaPutraaa
 */
class manusia{
     String nama;
     int umur; 
     public void berlari(){
        System.out.println(this.nama+" sedang berlari");
}
     public void berjalan(){
         System.out.println(this.nama+" sedang berjalan");
     }
 }

public class PRAKTIKUMPBO {

    public static void main(String[] args) {
    manusia orang1=new manusia();
    manusia orang2=new manusia();
    
    orang1.nama="rimuru";
    orang1.umur= 25;
    System.out.println("nama objek 1 adalah "+orang1.nama);
    System.out.println("umur objek 1 adalah "+orang1.umur+" tahun");
    orang1.berjalan();
    orang1.berlari();
    System.out.println("terimakasih");
     
    orang2.nama="veldoraaa";
    orang2.umur= 100;
    System.out.println("nama objek 2 adalah "+orang2.nama);
    System.out.println("umur objek 2 adalah "+orang2.umur+" tahun");
    orang2.berjalan();
    orang2.berlari();
    System.out.println("terimakasih");
    
        
    }
    
}

