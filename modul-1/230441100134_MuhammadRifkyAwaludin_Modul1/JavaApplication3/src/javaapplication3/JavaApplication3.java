/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
class manusia {
    String nama;
    int umur;        //atribut
    String alamatku;
    
        public void berlari() {  //method
        System.out.println( nama + " sedang berlari" );
    }
    
    public void berjalan() { //method
        System.out.println( nama + " sedang berjalan" );
    }
}

public class JavaApplication3 {
    public static void main(String[] args) {
                manusia orang  = new manusia();
        orang.nama     = "Rifky";
        orang.umur     = 20;
        orang.alamatku = "jawa";
        
        // Menampilkan data orang
        System.out.println("Nama   : " + orang.nama);
        System.out.println("Umur   : " + orang.umur);
        System.out.println("Alamat : " + orang.alamatku);
        orang.berjalan();
    }
}

    
    

