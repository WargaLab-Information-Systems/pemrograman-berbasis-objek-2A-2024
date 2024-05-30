package modul5;

import java.util.Scanner;
public class Modul5 {
    private void cetakSemuaOperasiBilangan(OperasiBilangan operasi, double a, double b, double c) {
        operasi.setA(a);
        operasi.setB(b);
        operasi.setC(c);
        operasi.setD();
        operasi.tampil();
    }
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Masukkan Nilai A : ");
    Double A = scanner.nextDouble();
    
    System.out.print("Masukkan Nilai B : ");
    double B = scanner. nextDouble();
    
    System.out.print("Masukkan Nilai C : ");
    double C = scanner. nextDouble();
     
    Modul5 cetak = new Modul5();
     
    OperasiPenjumlahan penjumlahan = new OperasiPenjumlahan();
    OperasiPengurangan pengurangan = new OperasiPengurangan();
    OperasiPerkalian perkalian = new OperasiPerkalian();
    OperasiPembagian pembagian = new OperasiPembagian();
    
    cetak.cetakSemuaOperasiBilangan(penjumlahan, A, B, C);
    cetak.cetakSemuaOperasiBilangan(pengurangan, A, B, C);
    cetak.cetakSemuaOperasiBilangan(perkalian, A, B, C);
    cetak.cetakSemuaOperasiBilangan(pembagian, A, B, C);
    
    }
}

