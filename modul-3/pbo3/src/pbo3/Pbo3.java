/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo3;
import java.util.ArrayList;
import java.util.Scanner;

// Parent class
class Buku {
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    //method
    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }
//getter membaca
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPublisher() {
        return publisher;
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
        return "Judul: " + judul +
                "\nPenulis: " + penulis +
                "\nPublisher: " + publisher +
                "\nKategori: " + kategori +
                "\nStok: " + stok +
                "\nTahun Terbit: " + tahunTerbit + "\n";
    }
}

// Child class
class BukuPerpus extends Buku {
    public BukuPerpus(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, tahunTerbit);
    }
}

/**
 *
 * @author ASUS
 */
public class Pbo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BukuPerpus> daftarBuku = new ArrayList<>();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();
        input.nextLine(); // Membuang karakter newline

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Data Buku ke-" + (i+1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Publisher: ");
            String publisher = input.nextLine();
            System.out.print("Kategori (SU = semua umur/D= dewasa/R= remaja/A= anak anak): ");
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
            System.out.println("");  
            System.out.print("Stok: ");
            int stok = input.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();
            input.nextLine(); // Membuang karakter newline
         

            // Membuat objek buku dan memasukkannya ke dalam daftar buku
            BukuPerpus buku = new BukuPerpus(judul, penulis, publisher, kategori, stok, tahunTerbit);
            daftarBuku.add(buku);
        }

        // Menampilkan daftar buku yang telah di-entrikan
        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println("Buku ke-" + (i+1));
            System.out.println(daftarBuku.get(i));
        }
    }
}

