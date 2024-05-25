/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */

import java.util.Scanner;

public class OperasiBilanganCetak {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b, double c) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C(c);
            operasi.set_D();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        double nilaiA = scanner.nextDouble();

        System.out.print("Masukkan nilai B: ");
        double nilaiB = scanner.nextDouble();

        System.out.print("Masukkan nilai C: ");
        double nilaiC = scanner.nextDouble();
        
        System.out.println("-------- Hasil --------");

        scanner.close();

        OperasiBilanganCetak main = new OperasiBilanganCetak();
        OperasiBilangan[] operasiBilangans = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        main.cetakSemua(operasiBilangans, nilaiA, nilaiB, nilaiC);
    }
}

