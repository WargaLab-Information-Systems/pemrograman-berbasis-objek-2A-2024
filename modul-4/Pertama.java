/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertama;

/**
 *
 * @author ZENDIA AMELIA
 */
public class Pertama {
  private void
  //untuk menampilkan hasil operasi bilangan
  // tiga parameter
  cetakSemuaOperasiBilanganAbs(OperasiBilanganAbs operasi, double a, double b) {
        operasi.setA(a);
        operasi.setB(b);
        operasi.setC();
        operasi.tampil();
    }
    
    public static void main(String[] args) {
    double A = 9.25;
    double B = 1.25;
     
   Pertama print = new Pertama();
   
    // objek - objek dari class yang mewarisi yaitu class opersibilanganabs
    OperasiPenjumlahan penjumlahan = new OperasiPenjumlahan();
    OperasiPengurangan pengurangan = new OperasiPengurangan();
    OperasiPerkalian perkalian = new OperasiPerkalian();
    OperasiPembagian pembagian = new OperasiPembagian();
    
    //untuk menampilakn method yang telah di panggil untuk masing - masing objek operasi
    print.cetakSemuaOperasiBilanganAbs(penjumlahan, A,B);
    print.cetakSemuaOperasiBilanganAbs(pengurangan, A,B); 
    print.cetakSemuaOperasiBilanganAbs(perkalian, A,B);
    print.cetakSemuaOperasiBilanganAbs(pembagian, A,B);
  }
}

