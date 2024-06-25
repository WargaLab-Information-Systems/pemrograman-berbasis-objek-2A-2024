/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprktikum6;
import java.util.Scanner;


public final class Main {
    private static void cetak(Komputer[] obj, String a, String b, String c) {
      obj[0] = new PC(a);
      obj[1] = new Laptop(b);
      obj[2] = new Netbook(c);

      int panjang = 3;
      System.out.println("\n|==================== HASIL ====================");
      for(int i = 0; i < panjang; i++) {
         Komputer obj1 = obj[i];
         obj1.hidupkan_os();
         obj1.klikkanan();
         obj1.klikkiri();
         obj1.tekan_enter();
         obj1.cetak_data();
         obj1.matikan_os();
        }
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("|==================== INPUT ====================");
        System.out.println("| Masukkan nama pemilik PC : ");
        String PC = input.nextLine();
        System.out.println("| Masukkan nama pemilik Laptop : ");
        String Laptop = input.nextLine();
        System.out.println("| Masukkan nama pemilik Netbook : ");
        String Netbook = input.nextLine();
        
        Komputer[] cetak = new Komputer[3];
        cetak(cetak, PC, Laptop, Netbook);
    } 
}
