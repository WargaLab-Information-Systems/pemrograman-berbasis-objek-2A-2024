/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul3.pkg1.Main;

/** 
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
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
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
class BukuAnak extends Buku {
    public BukuAnak(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "A", stok, tahunTerbit);
    }
}

public class Modul3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

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
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            if (kategori.equalsIgnoreCase("A")) {
                BukuAnak buku = new BukuAnak(judul, penulis, publisher, stok, tahunTerbit);
                daftarBuku.add(buku);
            } else {
                Buku buku = new Buku(judul, penulis, publisher, kategori, stok, tahunTerbit);
                daftarBuku.add(buku);
            }
        }

        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.display();
            System.out.println("-------------");
        }
    }
}