/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.modul5;

import java.util.Scanner;

class OperasiBilangan {
    protected double a;
    protected double b;
    protected double c;
    protected double d;
    
    protected void set_A(double a){
        this.a = a;
    }
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(double c) {
        this.c = c;
    }
    protected void set_D(double a, double b){
        this.d = d;
    }
    protected void set_D(double a, double b, double c){
        this.d = d;
    }
    protected double get_A(){
        return a;
    }
    protected double get_B(){
        return b;
    }
    protected double get_C(){
        return c;
    }
    protected double get_D(){
        return d;
    }
    
    protected void tampil(double a, double b){
        System.out.println("Nilai hasilnya adalah :" + this.d);
    }
    protected void tampil(double a, double b, double c){
        System.out.println("Nilai hasilnya adalah :" + this.d);
    }
}
class OperasiBilanganCetak {
    void cetakSemua(OperasiBilangan[] operasiBilangan, double a, double b, double c) {
        for (OperasiBilangan operasi : operasiBilangan) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C(c);
            operasi.set_D(a, b, c);
            operasi.tampil(a, b, c);
        }
    }

    void cetakSemua(OperasiBilangan[] operasiBilangan, double a, double b) {
        for (OperasiBilangan operasi : operasiBilangan) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_D(a, b);
            operasi.tampil(a, b);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OperasiBilangan[] operasiBilangan = new OperasiBilangan[4];
        operasiBilangan[0] = new Penjumlahan();
        operasiBilangan[1] = new Pengurangan();
        operasiBilangan[2] = new Perkalian();
        operasiBilangan[3] = new Pembagian();
        
        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih jenis input:");
            System.out.println("1. Masukkan 2 bilangan (A, B)");
            System.out.println("2. Masukkan 3 bilangan (A, B, C)");
            int choice = scanner.nextInt();
            double bilanganA, bilanganB, bilanganC;
            switch (choice) {
                case 1 -> {
                    System.out.print("Masukkan bilangan A: ");
                    bilanganA = scanner.nextDouble();
                    System.out.print("Masukkan bilangan B: ");
                    bilanganB = scanner.nextDouble();
                    cetak.cetakSemua(operasiBilangan, bilanganA, bilanganB);
                }
                case 2 -> {
                    System.out.print("Masukkan bilangan A: ");
                    bilanganA = scanner.nextDouble();
                    System.out.print("Masukkan bilangan B: ");
                    bilanganB = scanner.nextDouble();
                    System.out.print("Masukkan bilangan C: ");
                    bilanganC = scanner.nextDouble();
                    cetak.cetakSemua(operasiBilangan, bilanganA, bilanganB, bilanganC);
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}