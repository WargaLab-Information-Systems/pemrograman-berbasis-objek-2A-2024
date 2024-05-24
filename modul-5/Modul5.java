/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ZENDIA AMELIA
 */
import java.util.Scanner;

//A = 10.5
//B = 0.5
//C = 1.25

public class Modul5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai A: ");
        double A = scanner.nextDouble();
        System.out.print("Masukkan nilai B: ");
        double B = scanner.nextDouble();
        System.out.print("Masukkan nilai C: ");
        double C = scanner.nextDouble();
        System.out.println(" ");

        //polimorfisme runtime method yg di panggil pada objek pd saat program di run
        OperasiBilangan[] operasi = {
        new OperasiPenjumlahan(),
        new OperasiPengurangan(),
        new OperasiPerkalian(),
        new OperasiPembagian()
        };
        
        for (OperasiBilangan op : operasi) {
          if (!(op instanceof OperasiPembagian) || (op instanceof OperasiPembagian && op.operasi(B, C) != Double.NaN)) {
             double hasilAB = op.operasi(A, B);
             double hasilBC = op.operasi(B, C);
             double hasilAC = op.operasi(A, C);
             double hasilABC = op.operasi(A, B, C);
              System.out.println(op.tampiloperasi());
             
             System.out.println(op.tampil() + " dari A dan B: " + hasilAB);
             System.out.println(op.tampil() + " dari B dan C: " + hasilBC);
             System.out.println(op.tampil() + " dari A dan C: " + hasilAC);
             System.out.println(op.tampil() + " dari A, B, dan C: " + hasilABC);
             System.out.println(" ");
            }
        }
    }
}


