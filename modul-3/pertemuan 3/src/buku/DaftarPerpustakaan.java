package buku;

import java.util.Scanner;

public class DaftarPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int jumlahBuku;

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Input data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String Judul = input.next();
            System.out.print("Penulis: ");
            String Penulis = input.next();
            System.out.print("Publisher: ");
            String Publisher = input.next();
            System.out.print("Kategori(Su/D/R/A): ");
            String Kategori = input.next();
            System.out.print("Stok: ");
            int Stok = input.nextInt();
            System.out.print("Tahun Terbit: ");
            int TahunTerbit = input.nextInt();

            Buku buku = new Buku(Judul, Penulis, Publisher, Kategori, Stok, TahunTerbit);
            perpustakaan.tambahbuku(buku);
        }
        perpustakaan.tampilsemuabuku();
    }
}