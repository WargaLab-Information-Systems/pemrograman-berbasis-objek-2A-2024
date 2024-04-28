/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul3.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Modul3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<buku> daftarBuku = new ArrayList<>();

        System.out.print("Masukkan jumlah buku yang akan diinput: ");
        int jumlahBuku = scanner.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next();
            System.out.print("Penulis: ");
            String penulis = scanner.next();
            System.out.print("Publisher: ");
            String publisher = scanner.next();
            System.out.print("Kategori (SU=Semua Umur/D=Dewasa/R=Remaja/A=Anak-anak): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            if (kategori.equalsIgnoreCase("A")) {
                BukuAnak buku = new BukuAnak(judul, penulis, publisher, stok, tahunTerbit);
                daftarBuku.add(buku);
            } else {
                buku buku = new buku(judul, penulis, publisher, kategori, stok, tahunTerbit);
                daftarBuku.add(buku);
            }
        }

        System.out.println("\nDaftar Buku:");
        for (buku buku : daftarBuku) {
            buku.display();
            System.out.println("-------------");
}
}
}