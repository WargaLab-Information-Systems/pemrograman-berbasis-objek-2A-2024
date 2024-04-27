/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.modul3;
import java.util.ArrayList;
import java.util.Scanner;

class apkperpus  {
    private ArrayList<buku> daftarBuku = new ArrayList<>();
    public void tambahBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data buku:");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();  
        System.out.print("Kategori (SU/D/R/A): ");
        String kategori = scanner.nextLine();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        String tahunTerbit = scanner.nextLine();

        buku baru = new buku(judul, penulis, publisher, kategori, stok, tahunTerbit);
        daftarBuku.add(baru);
        System.out.println("Buku berhasil ditambahkan.");
    }
    public void daftarSemuaBuku() {
        System.out.println("\n\nDaftar Buku:");
        for (int i = 0; i < daftarBuku.size(); i++) {
            buku baru = daftarBuku.get(i);
            baru.displayInfo();
        }
    }
}