/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author sindy
 */
// class main
public class PBO_4 {
    private void cetakSemuaOperasiBilanganAbs(OperasiBilanganAbs operasi, double a, double b) {
        operasi.setA(a);
        operasi.setB(b);
        operasi.setC();
        operasi.tampil();
    }
    
    public static void main(String[] args) {
    double A = 9.25;
    double B = 1.25;
     
    PBO_4 cetak = new PBO_4();
     
    OperasiPenjumlahan penjumlahan = new OperasiPenjumlahan();
    OperasiPengurangan pengurangan = new OperasiPengurangan();
    OperasiPerkalian perkalian = new OperasiPerkalian();
    OperasiPembagian pembagian = new OperasiPembagian();
    
    cetak.cetakSemuaOperasiBilanganAbs(penjumlahan, A, B);
    cetak.cetakSemuaOperasiBilanganAbs(pengurangan, A, B);
    cetak.cetakSemuaOperasiBilanganAbs(perkalian, A, B);
    cetak.cetakSemuaOperasiBilanganAbs(pembagian, A, B);
    
    }
}
