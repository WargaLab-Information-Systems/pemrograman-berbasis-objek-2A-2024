/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;



import java.util.Scanner;

class perpustakaan extends buku {
    // Constructor
    public perpustakaan(String judul, String penulis, String publisher, char kategori, int stok, int TahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, TahunTerbit);
    }

    // Method to add book data
    public static perpustakaan TambahBuku(Scanner scannerTambah) {
        System.out.println(" ");
        System.out.println("---------------------------------");
        System.out.println("Masukkan data buku");
        System.out.println(" ");
        System.out.print("Judul: ");
        String JudulInput = scannerTambah.nextLine();
//        System.out.println("");
        System.out.print("Penulis: ");
        String PenulisInput = scannerTambah.nextLine();
        System.out.print("Publisher: ");
        String publisher = scannerTambah.nextLine();
        System.out.print("Kategori (SU/D/R/A): ");
        char KategoriInput = scannerTambah.nextLine().charAt(0);
        System.out.print("Stok: ");
        int stokInput = scannerTambah.nextInt();
        System.out.print("Tahun Terbit: ");
        int TahunterbitInput = scannerTambah.nextInt();
        
        scannerTambah.nextLine();

        return new perpustakaan(JudulInput, PenulisInput, publisher, KategoriInput, stokInput, TahunterbitInput);
    }
}