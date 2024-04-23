/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;
// dapat membaca input dari pengguna melalui file dengan mudah dan efisien.
/**
 *
 * @author RIZQY
 */

public class Manusia{
//  deklarasi variabel 
    String nama,alamat;
    int umur;

    public Manusia(String nama ,int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
   
    
   //method berjalan
   public void berjalan(){ 
        System.out.println(nama +" sedang berjalan.");
   }
   
   
   //method berlari
   public void berlari(){ 
        System.out.println(nama +" sedang berlari.");
   }
   
   
   
   //membuat beberapa objek manusia menjalankan dari kode diatas
   public static void main(String[] args) {
       Manusia manusia1 = new Manusia("asep", 40,  "jalan soekarno no.30");
       Manusia manusia2 = new Manusia("abdul", 19 , "jalan sudirman no.30");
       
      manusia1.berjalan();
      manusia2.berlari();
      
      
      System.out.println("informasi manusia 1 :");
      System.out.println("nama : " + manusia1.nama);
      System.out.println("umur : " + manusia1.umur);
      System.out.println("alamat : " + manusia1.alamat);
      
      
      System.out.println("informasi manusia 2 :");
      System.out.println("nama : " + manusia2.nama);
      System.out.println("umur :" + manusia2.umur);
      System.out.println("alamat : " + manusia2.alamat);
   }
}



