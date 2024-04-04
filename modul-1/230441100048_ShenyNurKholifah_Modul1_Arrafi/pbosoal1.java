/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

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

/**
 *
 * @author sheny
 */
public class pbosoal1 {
    public static void main(String[] args) {
        //        objek dari kelasnya(manusia)
        manusia orang1 = new manusia ();
        manusia orang2 = new manusia();
        
        orang1.nama = "SHENY NUR KHOLIFAH";
        orang1.umur = 19;
        orang1.alamat = "Bojonegoro";
//        untuk menampikan outputnya
        System.out.println("NamA Saya adalah " + orang1.nama);
        System.out.println("umur saya adalah " + orang1.umur + " Tahun");
        System.out.println("alamat saya adalah " + orang1.alamat );
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih"); 
        
        orang2.nama = "MAYA SELVIANA";
        orang2.umur = 19;
        orang2.alamat = "Surabaya";
        System.out.println("Nama saya adalah " + orang2.nama);
        System.out.println("Umur saya adalah " + orang2.umur + "Tahun");
        System.out.println("alamat saya adalah " + orang2.alamat );
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}
