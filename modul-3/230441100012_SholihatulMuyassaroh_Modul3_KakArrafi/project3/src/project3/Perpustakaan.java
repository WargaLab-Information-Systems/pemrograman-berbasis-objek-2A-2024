/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah buku yang ingin diinput: ");
        int jumlahBuku = input.nextInt();
        input.nextLine();  // membersihkan buffer
        
        Kategori[] daftarBuku = new Kategori[jumlahBuku];
        
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Data Buku ke-" + (i+1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Publisher: ");
            String publisher = input.nextLine();
            System.out.print("Stok: ");
            int stok = input.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();
            input.nextLine();  // membersihkan buffer
            
            System.out.println("Pilih Kategori: ");
            System.out.println("SU = Semua Umur, D = Dewasa, R = Remaja, A = Anak-anak");
            System.out.print("Kategori: ");
            String kategori = input.nextLine().toUpperCase();
            
            switch (kategori) {
                case "SU":
                    kategori = "Semua Umur";
                    break;
                case "D":
                    kategori = "Dewasa";
                    break;
                case "R":
                    kategori = "Remaja";
                    break;
                case "A":
                    kategori = "Anak-anak";
                    break;
                default:
                    System.out.println("Pilihan tidak valid, default kategori: Semua Umur");
                    kategori = "Semua Umur";
            }
            
            daftarBuku[i] = new Kategori(judul, penulis, publisher, stok, tahunTerbit, kategori);
        }
        
        // Menampilkan daftar buku
        System.out.println("\nDaftar Buku yang sudah diinputkan:");
        System.out.println("---------------------------------");
        for (Kategori buku : daftarBuku) {
            System.out.println("Judul: " + buku.judul);
            System.out.println("Penulis: " + buku.penulis);
            System.out.println("Publisher: " + buku.publisher);
            System.out.println("Kategori: " + buku.kategori);
            System.out.println("Stok: " + buku.stok);
            System.out.println("Tahun Terbit: " + buku.tahunTerbit);
            System.out.println("---------------------------------");
        }
    }
}
