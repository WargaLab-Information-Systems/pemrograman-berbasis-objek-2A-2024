package pbo.modul5;

import java.util.Scanner;

public class main {

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