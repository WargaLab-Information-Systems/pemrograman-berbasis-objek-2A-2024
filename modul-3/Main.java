/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
/**
 *
 * @author ZENDIA AMELIA
 */
import java.util.Scanner;
//tidak ada overrde karena tidak ada yang di timpa
// Main Class atau Class Utama
public class Main {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jumlah_Buku Buku = new Jumlah_Buku();

        System.out.println("Selamat Datang di Aplikasi Perpustakaan!");

        // Jumlah Buku Yang Akan di Tambahkan
        System.out.print("Masukkan Berapa Banyak Buku Yang akan ditambahkan: ");
        int daftarbuku = scanner.nextInt();
        scanner.nextLine(); // Membersihkan karakter newline

        // Untuk Perulangan setiap ada daftar buku baru sesuai dengan berapa banyak jumlah buku
        for (int i = 0; i < daftarbuku; i++) {
            System.out.println("");
            // Untuk meginputkan berapa banyak daftar buku yang di ulang
            System.out.println("Daftar Buku" + (i + 1) + ":");
            // Akan Mengulang Inputan data Sebanyak jumlah daftar buku yang di input
            
            System.out.print("Judul Buku        : ");
            String judul = scanner.nextLine();
            
            System.out.print("Penulis Buku      : ");
            String penulis = scanner.nextLine();
            
            System.out.print("Publisher         : ");
            String publisher = scanner.nextLine();
            
            System.out.print("Kategori (S/D/R/A): ");
            char kategori = scanner.next().charAt(0);
            
            System.out.print("Stok Buku         : ");
            int stok = scanner.nextInt();
            
            System.out.print("Tahun Terbit      : ");
            int tahunterbit = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline

            Buku.menambahkanbuku(judul, penulis, publisher, kategori, stok, tahunterbit);
        }

        // untuk menampilkan data buku 
        Buku.menampilkanbuku();

        scanner.close();
    }
}