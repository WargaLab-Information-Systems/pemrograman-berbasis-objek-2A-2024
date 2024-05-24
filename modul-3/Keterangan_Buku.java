/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.main;
/**
 *
 * @author ZENDIA AMELIA
 */

// parent slass 
// exteends untuk mewarisi
public class Keterangan_Buku extends Jumlah_Buku {
    String judul;
    String penulis;
    String publisher;
    char kategori;
    int stok;
    int tahunterbit;

public Keterangan_Buku(String judul, String penulis, String publisher, char kategori, int stok, int tahunterbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunterbit = tahunterbit;
}

// Method untuk menampilkan hasil keterangan buku
public void display() {
        System.out.println("--------------------------------------");
        System.out.println("Judul Buku              : " + judul);
        System.out.println("Penulis Buku            : " + penulis);
        System.out.println("Perusahaan              : " + publisher);
        System.out.println("Kategori Buku SU,D,R,A  : " + pilihankategori());
        System.out.println("Stok Buku               : " + stok);
        System.out.println("Tahun Terbit Buku       : " + tahunterbit);
        System.out.println("--------------------------------------");
}

// Method untuk memeilih kategori yang akan di ekesekusi
public String pilihankategori() {
    // di gunakan untuk memilih tapi salah satu
        switch (kategori) {
            case 'S':
                return "SemuaUmur";
            case 'D':
                return "Dewasa";
            case 'R':
                return "Remaja";
            case 'A':
                return "Anak-anak";
            default:
                return "Masukkan Inputan Yang Benar";
        }
    }
}

