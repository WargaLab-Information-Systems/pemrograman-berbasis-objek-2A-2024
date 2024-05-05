package pbomodul3;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Buku> daftarBuku = new ArrayList<>();

            System.out.println("=============================================");
            System.out.print("Masukkan jumlah buku yang akan ditambahkan: ");
            int jumlahBuku = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("Masukkan detail untuk Buku " + (i + 1) + ":");
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Penerbit: ");
                String penerbit = scanner.nextLine();

                String kategori;
                while (true) {
                    System.out.print("Kategori (SU/D/R/A): ");
                    kategori = scanner.nextLine();

                    switch (kategori.toUpperCase()) {
                        case "D" -> {
                            System.out.print("Stok: ");
                            int stok = scanner.nextInt();
                            System.out.print("Tahun Terbit: ");
                            int tahunTerbit = scanner.nextInt();
                            scanner.nextLine();
                            daftarBuku.add(new BukuDewasa(judul, penulis, penerbit, "Dewasa", stok, tahunTerbit));
                        }
                        case "R" -> {
                            System.out.print("Stok: ");
                            int stok = scanner.nextInt();
                            System.out.print("Tahun Terbit: ");
                            int tahunTerbit = scanner.nextInt();
                            scanner.nextLine();
                            daftarBuku.add(new BukuAnak(judul, penulis, penerbit, "Remaja", stok, tahunTerbit));
                        }
                        case "A" -> {
                            System.out.print("Stok: ");
                            int stok = scanner.nextInt();
                            System.out.print("Tahun Terbit: ");
                            int tahunTerbit = scanner.nextInt();
                            scanner.nextLine();
                            daftarBuku.add(new BukuAnak(judul, penulis, penerbit, "Anak-anak", stok, tahunTerbit));
                        }
                        case "SU" -> {
                            System.out.print("Stok: ");
                            int stok = scanner.nextInt();
                            System.out.print("Tahun Terbit: ");
                            int tahunTerbit = scanner.nextInt();
                            scanner.nextLine();
                            daftarBuku.add(new BukuAnak(judul, penulis, penerbit, "Semua Umur", stok, tahunTerbit));
                        }
                        default -> {
                            System.out.println("Kategori buku tidak dikenali.");
                            continue;
                        }
                    }
                    break;
                }
            }

            System.out.println("===================");
            System.out.println("\nDaftar Buku:");
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
                System.out.println();
            }
        }
    }
}
