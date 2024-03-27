/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo_praktikum_1;

class manusia {
    String nama;
    int umur;
    String alamatku;
    
    public void berlari() {
        System.out.println( nama + " sedang berlari" );
    }
    
    public void berjalan() {
        System.out.println( nama + " sedang berlari" );
    }
}

public class PBO_Praktikum_1 {
    public static void main(String[] args) {
        manusia orang = new manusia();
        orang.nama = "Diki";
        orang.umur = 20;
        orang.alamatku = "jalan delima";
        
        // Menampilkan data orang
        System.out.println("Nama: " + orang.nama);
        System.out.println("Umur: " + orang.umur);
        System.out.println("Alamat: " + orang.alamatku);
        orang.berjalan();
    }
}