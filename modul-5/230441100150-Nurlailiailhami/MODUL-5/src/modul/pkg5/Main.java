package modul.pkg5;

import java.util.Scanner;

abstract class OperasiMatematika {
    protected double a;
    protected double b;
    protected double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public abstract double hitung();
    public abstract double hitung(double a, double b, double c);
    public abstract double hitung(double a, double b);
    public abstract double hitung(double a);
}


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

       

        System.out.println("Penjumlahan (A, B, C): " + penjumlahan.hitung(A, B, C));
        System.out.println("Pengurangan (A, B, C): " + pengurangan.hitung(A, B, C));
        System.out.println("Perkalian (A, B, C): " + perkalian.hitung(A, B, C));
        try {
            System.out.println("Pembagian (A, B, C): " + pembagian.hitung(A, B, C));
        } catch (ArithmeticException e) {
            System.out.println("Pembagian (A, B, C): " + e.getMessage());
        }

        System.out.println("Penjumlahan (A, B): " + penjumlahan.hitung(A, B));
        System.out.println("Pengurangan (A, B): " + pengurangan.hitung(A, B));
        System.out.println("Perkalian (A, B): " + perkalian.hitung(A, B));
        try {
            System.out.println("Pembagian (A, B): " + pembagian.hitung(A, B));
        } catch (ArithmeticException e) {
            System.out.println("Pembagian (A, B): " + e.getMessage());
        }

        System.out.println("Penjumlahan (A): " + penjumlahan.hitung(A));
        System.out.println("Pengurangan (A): " + pengurangan.hitung(A));
        System.out.println("Perkalian (A): " + perkalian.hitung(A));
        System.out.println("Pembagian (A): " + pembagian.hitung(A));

        scanner.close();
    }
}


