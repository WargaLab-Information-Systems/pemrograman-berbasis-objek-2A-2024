package Modul3;

import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    String judul;
    String penulis;
    String penerbit;
    int stok;
    int tahun_terbit;

    public Buku(String judul, String penulis, String penerbit, int stok, int tahun_terbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.stok = stok;
        this.tahun_terbit = tahun_terbit;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahun_terbit);
    }
}

class BukuKategori extends Buku {
    String kategori;

    public BukuKategori(String judul, String penulis, String penerbit, int stok, int tahun_terbit, String kategori) {
        super(judul, penulis, penerbit, stok, tahun_terbit);
        this.kategori = kategori;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
}

public class perpustakaan {
    public static Buku tambahBuku() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        System.out.print("Masukkan nama penulis: ");
        String penulis = input.nextLine();
        System.out.print("Masukkan nama penerbit: ");
        String penerbit = input.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int stok = input.nextInt();
        System.out.print("Masukkan tahun terbit: ");
        int tahun_terbit = input.nextInt();
        input.nextLine(); // Membuang newline setelah nextInt()
        System.out.print("Masukkan kategori (SU/D/R/A): ");
        String kategori = input.nextLine().toUpperCase();
        if (!kategori.equals("SU") && !kategori.equals("D") && !kategori.equals("R") && !kategori.equals("A")) {
        System.out.println("Kategori tidak valid!");
        return null;
        } else {
        String kategoriFormat = "";
        if (kategori.equals("SU")) {
            kategoriFormat = "Semua Umur";
        } else if (kategori.equals("D")) {
            kategoriFormat = "Dewasa";
        } else if (kategori.equals("R")) {
            kategoriFormat = "Remaja";
        } else if (kategori.equals("A")) {
            kategoriFormat = "Anak-anak";
}
        return new BukuKategori(judul, penulis, penerbit, stok, tahun_terbit, kategoriFormat);
}

    }

    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku yang akan dimasukkan: ");
        int jumlahBuku = input.nextInt();
        input.nextLine(); // Membuang newline setelah nextInt()
        for (int i = 0; i < jumlahBuku; i++) {
            Buku bukuBaru = tambahBuku();
            if (bukuBaru != null) {
                daftarBuku.add(bukuBaru);
            }
        }

        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.displayInfo();
        }
    }
}