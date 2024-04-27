/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.main;
/**
 *
 * @author ZENDIA AMELIA
 */
// child class
import java.util.ArrayList;
public class Jumlah_Buku {
    //Array list untuk menyimpan data
    ArrayList<Keterangan_Buku> buku = new ArrayList<>();

     // Method untuk menambahkan buku pada jendela
    public void menambahkanbuku(String judul, String penulis, String publisher, char kategori, int stok, int tahunterbit) {
     // Objek
        Keterangan_Buku newBook = new Keterangan_Buku(judul, penulis, publisher, kategori, stok, tahunterbit);
        buku.add(newBook);
        System.out.println("--------------------------------------");
        System.out.println("Buku Berhasil diTambahkan :)!");
        System.out.println("--------------------------------------");
    }

      // Method untuk menampilkan buku yang sudah di input
    public void menampilkanbuku() {
        System.out.println("");
        System.out.println("Hasil Daftar Buku:");
        for (Keterangan_Buku book : buku) {
        book.display();
        System.out.println();
       }
    }
}

    

