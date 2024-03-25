/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.modul1;
class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public void berjalan(){
        System.out.println("Object" + this.nama + "berjalan");
    }
    
    void berlari(){
        System.out.println("Object" + this.nama + "berlari");
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Atta";
        orang1.umur = 20;
        orang1.alamat = "JL. JAMBU PERUMNAS KAMAL";
        System.out.println("nama object 1 adalah :" + orang1.nama);
        System.out.println("umur object 1 adalah :" + orang1.umur + "tahun");
        System.out.println("alamat object 1 adalah :" + orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
        
        orang2.nama = "Dylan";
        orang2.umur = 20;
        orang2.alamat = "KAVLING POLDA, JL. BANGAH JAYA SIDOARJO";
        System.out.println("nama object 2 adalah :" + orang2.nama);
        System.out.println("umur object 2 adalah :" + orang2.umur + "tahun");
        System.out.println("alamat object 2 adalah :" + orang2.alamat);
        orang2.berjalan();
        orang2.berlari();

    }
    
}