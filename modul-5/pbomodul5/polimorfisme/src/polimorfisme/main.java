/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;
import java.util.Scanner;

abstract class OperasiBilangan {
    protected double A;
    protected double B;
    protected double C;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C(double c);
    protected abstract void set_D();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract double get_D();
    protected abstract void tampil();
}

class OperasiBilanganCetak {
    void cetakSemua(OperasiBilangan operasi, double a, double b, double c) {
        operasi.set_A(a);
        operasi.set_B(b);
        operasi.set_C(c);
        operasi.set_D();
        operasi.tampil();
    }
}

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // objek OperasiBilanganCetak
        OperasiBilanganCetak operasiCetak = new OperasiBilanganCetak();
        
        // inputan untuk bilangan A, B, dan C
        System.out.print("Masukkan nilai A: ");
        double a = input.nextDouble();
        
        System.out.print("Masukkan nilai B: ");
        double b = input.nextDouble();
        
        System.out.print("Masukkan nilai C: ");
        double c = input.nextDouble();
        
        // Membuat objek disetiap operasi 
        OperasiBilangan penjumlahan = new OperasiPenjumlahan();
        OperasiBilangan pengurangan = new OperasiPengurangan();
        OperasiBilangan perkalian = new OperasiPerkalian();
        OperasiBilangan pembagian = new OperasiPembagian();
        
        // Memanggil metode cetakSemua disetiap objek
        operasiCetak.cetakSemua(penjumlahan, a, b, c);
        operasiCetak.cetakSemua(pengurangan, a, b, c);
        operasiCetak.cetakSemua(perkalian, a, b, c);
        operasiCetak.cetakSemua(pembagian, a, b, c);
    }
}

