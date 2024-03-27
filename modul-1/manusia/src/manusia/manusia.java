/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author ACER
 */
public class manusia { String nama;
    int umur;
    
        public void berlari(){
        System.out.println("objek ini " + this.nama + " berlari");
        
        
    }   
        
        public void berjalan(){
        System.out.println("objek ini " + this.nama + " berjalan");
        }
  

    
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia ();
        manusia orang2 = new manusia ();

        orang1.nama ="khanif";
        orang1.umur =20;
        System.out.println("Nama objek 1 adalah : " + orang1.nama);
        System.out.println("Umur objek 1 adalah : " + orang1.umur + " Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("terimakasih");

        orang2.nama ="angga";
        orang2.umur =19;
        System.out.println("Nama objek 2 adalah : " + orang2.nama);
        System.out.println("Umur objek 2 adalah : " + orang2.umur + " Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("terimakasih");
        }
    
}
