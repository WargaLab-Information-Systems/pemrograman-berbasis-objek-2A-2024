/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum5;
import java.util.Scanner;

/**
 *
 * @author Admin
 */




public class Main {

     private static void cetak2bilangan(OperasiBilangan[] OB, double a, double b) {
      OB[0] = new OperasiPenjumlahan();
      OB[1] = new OperasiPengurangan();
      OB[2] = new OperasiPerkalian();
      OB[3] = new OperasiPembagian();
      OperasiBilangan[] var5 = OB;
      int var6 = OB.length;
         System.out.println("\n|===== HASIL =====|");
      for(int var7 = 0; var7 < var6; ++var7) {
         OperasiBilangan OB1 = var5[var7];
         OB1.set_A(a);
         OB1.set_B(b);
         OB1.set_D(a, b);
         OB1.tampil();
      }
      
   }
     
      private static void cetak3bilangan(OperasiBilangan[] OB, double a, double b, double c) {
      OB[0] = new OperasiPenjumlahan();
      OB[1] = new OperasiPengurangan();
      OB[2] = new OperasiPerkalian();
      OB[3] = new OperasiPembagian();
      OperasiBilangan[] var5 = OB;
      int var6 = OB.length;
      System.out.println("\n|===== HASIL =====|");
      for(int var7 = 0; var7 < var6; ++var7) {
         OperasiBilangan OB1 = var5[var7];
         OB1.set_A(a);
         OB1.set_B(b);
         OB1.set_C(c);
         OB1.set_D(a, b,c);
         OB1.tampil();
      }
      
   }
    
    
    public static void main(String[] args) {
        OperasiBilangan[] cetak = new OperasiBilangan[4];
        int repeat = 1;
        while (repeat == 1){
            System.out.println("\n| Masukkan Banyak Angka : ");
            Scanner input = new Scanner(System.in);
            int bykangka = input.nextInt();
            if (bykangka == 2){
                repeat = 2;
                System.out.println("| Masukkan Bilangan Pertama : ");
                double bil1 = input.nextDouble();
                System.out.println("| Masukkan Bilangan Kedua : ");
                double bil2 = input.nextDouble();
                cetak2bilangan(cetak, bil1, bil2);
            }
            else if (bykangka == 3){
                repeat = 2;
                System.out.println("| Masukkan Bilangan Pertama : ");
                double bil1 = input.nextDouble();
                System.out.println("| Masukkan Bilangan Kedua : ");
                double bil2 = input.nextDouble();
                System.out.println("| Masukkan Bilangan Ketiga : ");
                double bil3 = input.nextDouble();

                cetak3bilangan(cetak, bil1, bil2, bil3);
            } else {
                System.out.println("| Masukkan Angka dengan benar Boss!!");
                repeat = 1;
            }
        }
        
        
    }
    
}
