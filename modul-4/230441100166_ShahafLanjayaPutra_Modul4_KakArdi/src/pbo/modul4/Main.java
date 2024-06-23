/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.modul4;

import java.util.Scanner;

/**
 *
 * @author shahaflanjaya
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.print("Masukkan angka pertama: ");
        a = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextDouble();
        
        

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int choice = input.nextInt();
        OperasiMatematika operasi = null;

        switch (choice) {
            case 1:
                operasi = new Penjumlahan();
                break;
            case 2:
                operasi = new Pengurangan();
                break;
            case 3:
                operasi = new Perkalian();
                break;
            case 4:
                operasi = new Pembagian();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        operasi.setA(a);
        operasi.setB(b);
        operasi.setC();
        operasi.tampil();
    }
}