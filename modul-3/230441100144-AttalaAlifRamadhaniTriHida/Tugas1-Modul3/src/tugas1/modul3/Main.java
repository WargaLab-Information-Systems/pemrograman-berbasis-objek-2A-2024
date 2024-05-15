/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.modul3;
import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    protected String judul;
    protected String penulis;
    protected String penerbit;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    public Buku(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Penerbit: " + penerbit + ", Kategori: " + kategori + ", Stok: " + stok + ", Tahun Terbit: " + tahunTerbit;
    }
}

class Perpustakaan extends Buku {
    public Perpustakaan(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        System.out.println("DATA BUKU PERPUSTAKAAN");

        // Loop untuk memasukkan data buku
        System.out.print("Masukkan jumlah buku yang akan dimasukkan: ");
        int jumlahBuku = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("MASUKKAN DATA BUKU KE-" + (i + 1) + ":");
            System.out.print("MASUKKAN JUDUL BUKU: ");
            String judul = input.nextLine();
            System.out.print("MASUKKAN PENULIS BUKU: ");
            String penulis = input.nextLine();
            System.out.print("MASUKKAN PUBLISHER BUKU: ");
            String penerbit = input.nextLine();
            System.out.print("MASUKKAN KATEGORI BUKU (SU(Semua Umur)|D(Dewasa)|R(Remaja)|A(Anak-Anak)): ");
            String kategori = input.nextLine();
            System.out.print("MASUKKAN STOK BUKU: ");
            int stok = input.nextInt();
            System.out.print("MASUKKAN TAHUN TERBIT: ");
            int tahunTerbit = input.nextInt();
            input.nextLine();

            Perpustakaan buku = new Perpustakaan(judul, penulis, penerbit, kategori, stok, tahunTerbit);
            daftarBuku.add(buku);
        }
        
        System.out.println("|===========================================================================================================|");
        System.out.printf("| %-40s %-62s %-1s |%n", "-", "DATA BUKU PERPUSTAKAAN", "-");
        System.out.println("|===========================================================================================================|");
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", "Judul", "Penulis", "Penerbit", "Kategori", "Stok", "Tahun Terbit");
        System.out.println("|===========================================================================================================|");
        for (Buku buku : daftarBuku) {
            System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15d | %-15d |\n", buku.getJudul(), buku.getPenulis(), buku.getPenerbit(), buku.getKategori(), buku.getStok(), buku.getTahunTerbit());
        }
        System.out.println("|===========================================================================================================|");
        input.close();
    }
    
}
