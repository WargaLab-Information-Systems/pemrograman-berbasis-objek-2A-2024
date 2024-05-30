/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5_polimorfisme;

/**
 *
 * @author Erlangga Satrya H
 */
import java.util.Scanner;

public class OperasiBilanganCetak {

    private static void CetakSemua(OperasiBilangan[] OB, double a, double b, double c) {
        String[] operasiNames = {"Penjumlahan", "Pengurangan", "Perkalian", "Pembagian"};
        
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C(c);
            OB[i].set_D();
            OB[i].tampil(operasiNames[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan A: ");
        double a = scanner.nextDouble();
        System.out.println("Masukkan bilangan B: ");
        double b = scanner.nextDouble();
        System.out.println("Masukkan bilangan C: ");
        double c = scanner.nextDouble();

        OperasiBilangan[] operasiArray = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        CetakSemua(operasiArray, a, b, c);

        scanner.close();
    }
}