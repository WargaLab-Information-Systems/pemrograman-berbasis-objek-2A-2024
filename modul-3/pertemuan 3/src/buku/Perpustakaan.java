package buku;

import java.util.ArrayList;

public class Perpustakaan {
    ArrayList<Buku> listbuku = new ArrayList<>();

    public void tambahbuku(Buku buku) {
        listbuku.add(buku);
    }

    public void tampilsemuabuku() {
        System.out.println("\nDaftar Buku");
        System.out.printf("%-20s%-20s%-20s%-20s%-10s%-10s\n", "Judul", "Penulis", "Publisher", "Kategori", "Stok", "TahunTerbit");
        for (Buku buku : listbuku) {
            System.out.printf("%-20s%-20s%-20s%-20s%-10d%-10d\n", buku.Judul, buku.Penulis, buku.Publisher, buku.Kategori, buku.Stok, buku.TahunTerbit);
        }
    }
}