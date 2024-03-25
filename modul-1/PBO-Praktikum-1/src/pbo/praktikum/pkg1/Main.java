/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg1;

/**
 *
 * @author acer
 */

class Manusia {
    String nama;
    int umur;
    String alamat;
    public void berjalan (){
        System.out.println("Objek ini berjalan");
    }
    public void berlari () {
        System.out.println("Objek ini berlari");
    }   
}
public class Main {
    public static void main(String[] args) {
        pbo.praktikum.pkg1.Manusia orang1 = new pbo.praktikum.pkg1.Manusia();
        pbo.praktikum.pkg1.Manusia orang2 = new pbo.praktikum.pkg1.Manusia();

        orang1.nama="Sella";
        orang1.umur=18;
        orang1.alamat=" Siantar";
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("Umur Objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("Alamat dari objek 1"+orang1. alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih ");

        orang2.nama = "Angga";
        orang2.umur = 19;
        orang2.alamat= " Medan";
        System.out.println ("Nama Objek 2 adalah " + orang2.nama);
        System.out.println ("Nama Objek 2 adalah " + orang2.umur + " Tahun");
        System.out.println("Alamat objek 2 adalah"+orang2. alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}

  



    
        