/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg1;
class Manusia {
    String nama, alamat;
    int umur;
         
    public void berlari() {
        System.out.println("objek ini " + this.nama + " berlari");
    }
         
    void berjalan() {
    System.out.println("objek ini " + this.nama + " berjalan");
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
        
        orang1.nama = "hani";
        orang1.umur = 20;
        orang1.alamat = "sumenep";
        
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("umur objek 1 adalah " + orang1.umur + " Tahun");
        System.out.println("umur objek 1 adalah " + orang1.alamat);
      
        System.out.println("terimakasih");
        orang1.berjalan();
        orang1.berlari();
                
        orang2.nama = "angga";
        orang2.umur = 19;
        orang2.alamat = "Probolinggo";
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("umur objek 2 adalah " + orang2.umur + " Tahun");
        System.out.println("Alamat objek 2 adalah " + orang2.alamat);

        System.out.println("terimakasih");
        orang2.berjalan();
        orang2.berlari();                
    }

    
}
