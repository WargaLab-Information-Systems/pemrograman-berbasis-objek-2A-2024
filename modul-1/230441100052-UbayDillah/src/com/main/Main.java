package com.main;

class Manusia {
    String nama, alamat;
    int umur;
    
    public void berlari() {
        System.out.println("Object ini " + this.nama + " berlari");
    }
    
    public void berjalan() {
        System.out.println("Object ini " + this.nama +" berjalan");
    }
}

public class Main {

    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Michael";
        orang1.umur = 18;
        orang1.alamat = "Telang, Madura";
        System.out.println("Nama Object 1 adalah " + orang1.nama);
        System.out.println("Umur Object 1 adalah " + orang1.umur + " Tahun");
        System.out.println("alamat Object 1 adalah " + orang1.alamat);
        orang1.berjalan();
        System.out.println("Terima Kasih");
        System.out.println("");
        
        orang2.nama = "Kevin";
        orang2.umur = 19;
        orang2.alamat = "Sampang, Madura";
        System.out.println("Nama Object 2 adalah " + orang2.nama);
        System.out.println("Umur Object 2 adalah " + orang2.umur + " Tahun");
        System.out.println("Alamat Object 2 adalah " + orang2.alamat); 
        orang2.berlari();
        System.out.println("Terima Kasih");
    }
    
}
