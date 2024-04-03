/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1.no1;

/**
 *
 * @author LENOVO
 */
class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public void berjalan() {
        System.out.println("Orang ini " + this.nama + " berjalan");
    }
    
    void berlari() {
        System.out.println("Orang ini " + this.nama + " berlari");
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Shahahahaf";
        orang1.umur = 20;
        orang1.alamat = "Puri, Mojokerto";
        System.out.println("Nama Orang ke-1 adalah " + orang1.nama);
        System.out.println("Umur Orang ke-1 adalah " + orang1.umur + "Tahun");
        System.out.println(orang1.nama + " Tinggal di "+ orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");
        
        orang2.nama = "Adit Pertalite";
        orang2.umur = 19;
        orang2.alamat = "Mojoanyar, Mojokerto";
        System.out.println("Nama Orang ke-2 adalah " + orang2.nama);
        System.out.println("Umur Orang ke-2 adalah " + orang2.umur + "Tahun");
        System.out.println(orang2.nama + " Tinggal di " + orang2.alamat);
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
        
    }
    
}