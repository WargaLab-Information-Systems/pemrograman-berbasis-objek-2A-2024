/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NAOFUMI
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        double A = scanner.nextDouble();

        System.out.print("Masukkan nilai B: ");
        double B = scanner.nextDouble();

        System.out.print("Masukkan nilai C: ");
        double C = scanner.nextDouble();

        OperasiMatematika[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        for (OperasiMatematika op : operasi) {
            if (op instanceof Pembagian && op.operasi(B, C) != Double.NaN) {
                double hasilAB = op.operasi(A, B);
                double hasilBC = op.operasi(B, C);
                double hasilAC = op.operasi(A, C);
                System.out.println(op.deskripsi() + " dari A dan B: " + hasilAB);
                System.out.println(op.deskripsi() + " dari B dan C: " + hasilBC);
                System.out.println(op.deskripsi() + " dari A dan C: " + hasilAC);
            } else if (!(op instanceof Pembagian)) {
                double hasilAB = op.operasi(A, B);
                double hasilBC = op.operasi(B, C);
                double hasilAC = op.operasi(A, C);
                System.out.println(op.deskripsi() + " dari A dan B: " + hasilAB);
                System.out.println(op.deskripsi() + " dari B dan C: " + hasilBC);
                System.out.println(op.deskripsi() + " dari A dan C: " + hasilAC);
            }
        }

        scanner.close();
    }
}