/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.modul4;

import java.util.Scanner;
abstract class OperasiBilanganAbs {
    protected double bilanganA;
    protected double bilanganB;
    protected double hasil_C;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();
}

final class OperasiBilanganAbsCetak {
    protected void cetakSemua(OperasiBilanganAbs operasi, double a, double b) {
        operasi.set_A(a);
        operasi.set_B(b);
        operasi.set_C();
        operasi.tampil();
    }
}

public class Main {
    public static void main(String[] args) {
        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan A: ");
        double bilanganA = scanner.nextDouble();

        System.out.print("Masukkan bilangan B: ");
        double bilanganB = scanner.nextDouble();

        cetak.cetakSemua(new Penjumlahan(), bilanganA, bilanganB);
        cetak.cetakSemua(new Pengurangan(), bilanganA, bilanganB);
        cetak.cetakSemua(new Perkalian(), bilanganA, bilanganB);
        cetak.cetakSemua(new Pembagian(), bilanganA, bilanganB);
    }
}