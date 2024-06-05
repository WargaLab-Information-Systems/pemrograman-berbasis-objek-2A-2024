/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_praktikum.pkg1;


/**
 *
 * @author Erlangga Satrya H
 */
class Manusia {
    String nama;
    int umur;
    
    public void berlari(){
       
        System.out.println("Objek manusia ini dengan nama :" + this.nama +" berlari");
    }
    
    void berjalan(){
        System.out.println("Objek manusia ini dengan nama :" + this.nama + " ini berjalan");
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        
        orang1.nama = "Khanif";
        orang1.umur = 20;
        System.out.println("--OBJECT1--");
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("Umur objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("--METHOD OBJECT--");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("-----------------");
        System.out.println("Terima Kasih");
        
        System.out.println("");
        
        orang2.nama = "Angga";
        orang2.umur = 19;
        System.out.println("--OBJECT 2--");
        System.out.println("Nama Objek 2 adalah " + orang2. nama);
        System.out.println("Umur objek 2 adalah " + orang2. umur + "Tahun");
        System.out.println("--METHOD OBJECT--");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("-----------------");
        System.out.println("Terima Kasih");
    }
    
}
