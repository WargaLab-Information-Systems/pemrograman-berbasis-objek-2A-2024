/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas.prak.modul1;

/**
 *
 * @author MSI GAMING
 */
class manusia {
    String nama;
    int umur;
    String alamat;
    
    public void berlari() {
        System.out.println("Objek ini " + this.nama + " berlari");
    }
    
    void berjalan() {
        System.out.println("Obejek ini " + this.nama + " berjalan");
    }
    
    void MengerjakanTugas () {
        System.out.println("Objek ini " + this.nama + " mengerjakan tugas");
    }
    
}

public class tugas1 {
     public static void main(String[] args) {
        manusia orang1 = new manusia();
        manusia orang2 = new manusia();
        manusia orang3 = new manusia();
        
        orang1.nama = "muhlis";
        orang1.umur = 20;
        orang1.alamat = "Bangkalan";
        System.out.println("nama orang 1 adalah " + orang1.nama);
        System.out.println("umur objek 1 adalah " + orang1.umur + "tahun");
        System.out.println ("Alamat objek 1 adalah " + orang1.alamat);
        System.out.println ("");
        
        orang2.nama="heri";
        orang2.umur= 21;
        orang2.alamat= "Kamal";
        System.out.println("Nama objek 2 adalah " + orang2.nama);
        System.out.println("Umur objek 2 adalah " + orang2.umur + "Tahun");
        System.out.println ("Alamat objek 2 adalah " + orang2.alamat);
        System.out.println ("");
        
        orang3.nama="bayu";
        orang3.umur= 19;
        orang3.alamat= "Socah";
        System.out.println ("Nama objek 3 adalah " + orang3.nama);
        System.out.println ("Umur objek 3 adalah " + orang3.umur + "Tahun");
        System.out.println ("Alamat objek 3 adalah" + orang3.alamat);
        System.out.println ("");
        
        orang1.berjalan();
        orang2.berlari();
        orang3.MengerjakanTugas();
    }
}

