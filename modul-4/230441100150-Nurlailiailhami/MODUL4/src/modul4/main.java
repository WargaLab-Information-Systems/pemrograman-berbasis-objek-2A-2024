package modul4;

import java.util.Scanner;

abstract class OperasiMatematika {
    double bilanganA;
    double bilanganB;

    abstract double hitung();

    void setBilangan(double a, double b) {
        bilanganA = a;
        bilanganB = b;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan A: ");
        double bilanganA = scanner.nextDouble();

        System.out.print("Masukkan bilangan B: ");
        double bilanganB = scanner.nextDouble();

        OperasiMatematika operasi;
        
        System.out.println("<= Operasi Matematika =>");
        System.out.println("=========================");

        operasi = new Penjumlahan();
        operasi.setBilangan(bilanganA, bilanganB);
        System.out.println("Hasil penjumlahan: " + operasi.hitung());
        
        System.out.println("=========================");
        
        operasi = new Pengurangan();
        operasi.setBilangan(bilanganA, bilanganB);
        System.out.println("Hasil pengurangan: " + operasi.hitung());
        
        System.out.println("=========================");

        operasi = new Perkalian();
        operasi.setBilangan(bilanganA, bilanganB);
        System.out.println("Hasil perkalian  : " + operasi.hitung());
        
        System.out.println("=========================");

        operasi = new Pembagian();
        operasi.setBilangan(bilanganA, bilanganB);
        System.out.println("Hasil pembagian  : " + operasi.hitung());
        
        System.out.println("=========================");

        scanner.close();
    }   
}
