/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum1;

/**
 *
 * @author shahaflanjaya
 */class manusia  {
    String nama;
    int umur;
    String alamat;
    
    public void berlari () {
        System.out.println("objek ini " + this.nama + " berlari");
    }
    
    void berjalan () {
        System.out.println("objek ini " + this.nama + " berjalan");
    }
 }
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia ();
        manusia orang2 = new manusia ();
        
        orang1.nama = "sagab";
        orang1.umur = 20;
        orang1.alamat="wikarsa";
        System.out.println("nama orang ke-1 adalah :"+ orang1.nama);
        System.out.println("umur orang ke-1 adalah :"+ orang1.umur+"tahun");
        System.out.println("alamat orang ke-1 adalah :" + orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("terimakasih");
        
        orang2.nama = "ivan";
        orang2.umur = 19;
        orang2.alamat="mjk";
        System.out.println("nama orang ke-2 adalah :"+ orang2.nama);
        System.out.println("umur orang ke-2 adalah :"+ orang2.umur+"tahun");
        System.out.println("alamat orang ke-2 adalah :" + orang2.alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("terimakasih");
        
    }
    
}
