/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg1;

//manusia = class
class Manusia { 
    String nama;
    int umur;
    String alamat;
    
    public void berlari(){
        System.out.println("Objek ini " + this.nama + " berlari");
    }
    
    void berjalan(){
        System.out.println("Objek ini " + this.nama + " berjalan");
    }
}

public class Main {
    public static void main(String[] args) {

//objek dari kelas
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama= "Hanif";
        orang1.umur= 20;
        orang1.alamat= "Sidoarjo";
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("Umur Objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("Alamat Objek 1 adalah " + orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");

        orang2.nama= "Angga";
        orang2.umur= 19;
        orang2.alamat= "Surabaya";
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("Umur Objek 2 adalah " + orang2.umur + " Tahun");
        System.out.println("Alamat Objek 2 adalah " + orang2.alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}
