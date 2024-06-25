/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mdl6;


public class Main {

    public static void main(String[] args) {
        komputer pc = new pc ();
        komputer laptop = new laptop();
        komputer netbook = new netbook();
  //Objek pc, laptop, dan netbook dideklarasikan sebagai tipe komputer yg diinisialisasi
  //sebagai instance dari kelas pc, laptop, dan netbook.//
        
        komputercetak display = new komputercetak();
   //Membuat objek komputercetak yang bertujuan untuk mencetak informasi tentang objek komputer.
   
        display.cetak(pc);
        display.cetak(laptop);
        display.cetak(netbook);
   //Memanggil metode cetak pada objek display untuk setiap objek komputer 
    }
    
}  