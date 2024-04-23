/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum.pbo.pkg1;

/**
 *
 * @author ASUS
 */

class Manusia {
    String nama;
    int umur;
    String alamat;
    
    //method class manusia
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
        //objek dari class manusia
         Manusia orang1 = new Manusia ();
        Manusia orang2 = new Manusia();
      
        orang1.nama = "hanif";
        orang1.umur = 20;
        orang1.alamat = "bangkalan";
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("umur Objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("Alamat Objek 1 adalah " + orang1.alamat);

        //method
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih"); 
        
        orang2.nama = "angga";
        orang2.umur = 19;
        orang2.alamat = "kamal";
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("Umur Objek 2 adalah " + orang2.umur + "Tahun");
        System.out.println("Alamat Objek 2 adalah " + orang2.alamat);

        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
    
}
