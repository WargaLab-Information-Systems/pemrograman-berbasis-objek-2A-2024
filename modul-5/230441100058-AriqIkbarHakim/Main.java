package praktikum5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan A: ");
        double A = scanner.nextDouble();

        System.out.print("Masukkan bilangan B: ");
        double B = scanner.nextDouble();

        System.out.print("Masukkan bilangan C: ");
        double C = scanner.nextDouble();

        OperasiMatematika penjumlahan = new Penjumlahan();
        OperasiMatematika pengurangan = new Pengurangan();
        OperasiMatematika perkalian = new Perkalian();
        OperasiMatematika pembagian = new Pembagian();

        penjumlahan.setA(A);
        penjumlahan.setB(B);
        penjumlahan.setC(C);

        pengurangan.setA(A);
        pengurangan.setB(B);
        pengurangan.setC(C);

        perkalian.setA(A);
        perkalian.setB(B);
        perkalian.setC(C);

        pembagian.setA(A);
        pembagian.setB(B);
        pembagian.setC(C);
        
        System.out.println("\n");
        System.out.println("Penjumlahan (a, b, c): " + penjumlahan.hitung());
        System.out.println("Pengurangan (a, b, c): " + pengurangan.hitung());
        System.out.println("Perkalian (a, b, c): " + perkalian.hitung());
        try {
            System.out.println("Pembagian (a, b, c): " + pembagian.hitung());
        } catch (ArithmeticException e) {
            System.out.println("Pembagian (a, b, c): " + e.getMessage());
        }
        
     scanner.close();
    }
}


