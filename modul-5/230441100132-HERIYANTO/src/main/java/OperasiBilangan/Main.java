package OperasiBilangan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda ingin menggunakan dua nilai saja? (Y/T): ");
        String jawab = scanner.next();
        double a, b, c;
        if (jawab.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan nilai A: ");
            a = scanner.nextDouble();
            System.out.print("Masukkan nilai B: ");
            b = scanner.nextDouble();
            c = 0; 
        } else {
            System.out.print("Masukkan nilai A: ");
            a = scanner.nextDouble();
            System.out.print("Masukkan nilai B: ");
            b = scanner.nextDouble();
            System.out.print("Masukkan nilai C: ");
            c = scanner.nextDouble();
        }
        OperasiBilangan[] operasiArray = {
                new Penjumlahan(),
                new Pengurangan(),
                new Perkalian(),
                new Pembagian()
        };
        BilanganCetak cetak = new BilanganCetak();
        cetak.cetakSemua(operasiArray, a, b, c);
        scanner.close();
    }
}