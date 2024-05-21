package OperasiBilangan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai B: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan nilai C: ");
        double c = scanner.nextDouble();
    
        operasibilangan[] operasiArray = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        bilangancetak cetak = new bilangancetak();
        cetak.cetakSemua(operasiArray, a, b, c);

        scanner.close();
    }
}
