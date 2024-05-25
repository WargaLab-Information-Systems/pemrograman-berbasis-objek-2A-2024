/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul5.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */import java.util.Scanner;
public class Modul5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai B: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan nilai C: ");
        double c = scanner.nextDouble();
    
        OperasiBilangan[] operasiArray = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(operasiArray, a, b, c);

        scanner.close();
    }
}