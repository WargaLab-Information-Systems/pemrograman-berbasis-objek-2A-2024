/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author USER
 */
class manusia {
    String nama;
    int umur;
    String alamat;
    
    void berlari() {
        System.out.println("Manusia atas nama " + this.nama + " berlari");
    }
        
    void berjalan () {
        System.out.println("Manusia atas nama " + this.nama + " berjalan");
    }
}
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia ();
        manusia orang2 = new manusia();
        
        orang1.nama = "Heni";
        orang1.umur = 22;
        orang1.alamat="Sigordang";
        System.out.println("Nama orang ke-1 adalah " + orang1.nama);
        System.out.println("Umur orang ke-1 adalah " + orang1.umur + " Tahun");
        System.out.println ("Alamat orang ke- 1 adalah " + orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih"); 
        
        orang2.nama = "Putri";
        orang2.umur = 16;
        orang2.alamat="Balige";
        System.out.println("Nama orang ke-2 adalah " + orang2.nama);
        System.out.println("Umur orang ke-2 adalah " + orang2.umur + "Tahun");
        System.out.println("Alamat orang ke-2 adalah " + orang2.alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}