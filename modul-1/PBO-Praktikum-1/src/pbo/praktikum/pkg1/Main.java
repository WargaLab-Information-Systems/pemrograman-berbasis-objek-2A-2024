/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg1;

/**
 *
 * @author Admin
 */

//membuat class manusia

class Manusia {
    String nama, alamat;
    int umur;
    
    
//    membuat method
    public void berjalan(){
        System.out.println("\n|======== METHOD OBJECT ========\n| Object manusia dengan nama : " + this.nama + " sedang berjalan...");
    }
    
    void berlari () {
        System.out.println("\n|======== METHOD OBJECT ========\n| Object manusia dengan nama : " + this.nama + "sedang berlari..." );
    }
    

}
public class Main {

    public static void main(String[] args) {
//        membuat object dari class manusia
        Manusia warga1 = new Manusia();
        Manusia warga2 = new Manusia();
        
//       memberi attribute warga1
        warga1.nama = "Khanif";
        warga1.umur = 20;
        warga1.alamat = "Sidoarjo";
        System.out.println("\n|========== OBJECT 1 ==========|\n| nama object 1 adalah : " + warga1.nama);
        System.out.println("| umur object 1 adalah : " + warga1.umur + "tahun");
        System.out.println("| alamat object 1 adalah : " + warga1.alamat);
        
//        memberi methode pada warga1
        warga1.berjalan();
        warga1.berlari();
        
//       memberi attribute warga2
        warga2.nama = "Anggoy";
        warga2.umur = 19;
        warga2.alamat = "Jomabng";
        System.out.println("\n|========== OBJECT 2 ==========\n| nama adalah : " + warga2.nama);
        System.out.println("| umur adalah : " + warga2.umur + "Tahun");
        System.out.println("| alamat object 2 adalah : " + warga2.alamat);
        
//        memberi methode pada warga2
        warga2.berjalan();
        warga2.berlari();
       
    }
    
}
