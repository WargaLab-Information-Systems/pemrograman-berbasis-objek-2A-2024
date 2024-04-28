/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
public class buku {
    // Parent class
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    public buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + getKategoriString());
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    // Method to get the category string
    protected String getKategoriString() {
        String kategoriString;
        switch (kategori) {
            case "SU":
                kategoriString = "Semua Umur";
                break;
            case "D":
                kategoriString = "Dewasa";
                break;
            case "R":
                kategoriString = "Remaja";
                break;
            case "A":
                kategoriString = "Anak-anak";
                break;
            default:
                kategoriString = "Unknown";
        }
        return kategoriString;
    }
}

// Child class
class BukuAnak extends buku {
    public BukuAnak(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "A", stok, tahunTerbit);
}
}