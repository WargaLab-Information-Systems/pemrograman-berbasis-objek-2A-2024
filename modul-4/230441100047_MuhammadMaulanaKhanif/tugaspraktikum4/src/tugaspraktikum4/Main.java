/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum4;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public final class Main {
   
   private static void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
      OB[0] = new OperasiPenjumlahan();
      OB[1] = new OperasiPengurangan();
      OB[2] = new OperasiPerkalian();
      OB[3] = new OperasiPembagian();
      OperasiBilanganAbs[] var5 = OB;
      int var6 = OB.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         OperasiBilanganAbs OB1 = var5[var7];
         OB1.set_A(a);
         OB1.set_B(b);
         OB1.set_C();
         OB1.tampil();
      }
   }

   public static void main(String[] args) {
      OperasiBilanganAbs[] cetak = new OperasiBilanganAbs[4];
      cetakSemua(cetak, 9.25, 1.25);
   }
}

    
    
 