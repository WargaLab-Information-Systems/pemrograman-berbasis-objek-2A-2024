/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg1;

/**
 *
 * @author User
 */

//manusia adalah classnya
class manusia {
//    dibawah ini (nama dll) itu adalah atributnya)
    String nama;
    int umur;
    String alamat;
    
//    berlari dan berjalan adalah method (jika ada void berarti method)
    public void berlari() {
        System.out.println("Objek ini " + this.nama + " berlari");
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
        
//        objek dari kelasnya(manusia)
        manusia orang1 = new manusia ();
        manusia orang2 = new manusia();
        
        orang1.nama = "lili";
        orang1.umur = 19;
        orang1.alamat = "bangkalan";
//        untuk menampikan outputnya
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("umur Objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("alamat objek 1 adalah " + orang1.alamat );
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih"); 
        
        orang2.nama = "arif";
        orang2.umur = 8;
        orang2.alamat = "jayapura";
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("Umur Objek 2 adalah " + orang2.umur + " Tahun");
        System.out.println("alamat objek 2 adalah " + orang2.alamat );
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
    
}
