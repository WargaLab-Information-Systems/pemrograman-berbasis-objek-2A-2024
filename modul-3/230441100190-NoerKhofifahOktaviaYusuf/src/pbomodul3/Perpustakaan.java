package pbomodul3;

import java.util.ArrayList; 
import java.util.Scanner; 


public class Perpustakaan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { 
            ArrayList<Buku> daftarBuku = new ArrayList<>();
            
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
                System.out.print("Kategori (SU/D/R/A): ");
                String kategori = scanner.nextLine();
                System.out.print("Stok: ");
                int stok = scanner.nextInt();
                System.out.print("Tahun Terbit: ");
                int tahunTerbit = scanner.nextInt();
                scanner.nextLine(); 
               
                Buku bukuBaru;
                switch (kategori.toUpperCase()) {
                    case "D":
                        bukuBaru = new BukuDewasa(judul, penulis, penerbit, kategori, stok, tahunTerbit);
                        break;
                    case "A":
                    case "R":
                    case "SU":
                    default:
                        bukuBaru = new BukuAnak(judul, penulis, penerbit, kategori, stok, tahunTerbit);
                        break;
                }
                
                // Tambahkan buku baru ke dalam daftar
                daftarBuku.add(bukuBaru);
            }
            
            // Tampilkan informasi semua buku
            System.out.println("===================");
            System.out.println("\nDaftar Buku:");
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
                System.out.println(); 
            }
        }
    }
}
