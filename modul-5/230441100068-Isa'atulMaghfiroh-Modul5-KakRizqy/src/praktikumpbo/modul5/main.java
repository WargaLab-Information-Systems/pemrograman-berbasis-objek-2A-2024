/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpbo.modul5;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        operasiBilangan operasi = null;

        System.out.println("Pilih operasi :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            operasi = new operasiPenjumlahan();
        } else if (pilihan == 2) {
            operasi = new operasiPengurangan();
        } else if (pilihan == 3) {
            operasi = new operasiPerkalian();
        } else if (pilihan == 4) {
            operasi = new operasiPembagian();
        } else {
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }
        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();
        operasi.setA(a);

        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();
        operasi.setB(b);

        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();
        operasi.setC(c);
        operasi.hitung();
    }
}
