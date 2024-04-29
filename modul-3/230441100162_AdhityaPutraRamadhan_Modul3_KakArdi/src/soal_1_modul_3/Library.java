/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal_1_modul_3;

/**
 *
 * @author AdhityaPutraaa
 */
import java.util.ArrayList;
import java.util.Scanner;

class BukuAnak extends Book {
    public BukuAnak(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Anak", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Anak");
    }
}

class BukuDewasa extends Book {
    public BukuDewasa(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Dewasa", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Dewasa");
    }
}

class BukuSemuaUmur extends Book {
    public BukuSemuaUmur(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Semua Umur", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Semua Umur");
    }
}

class BukuRemaja extends Book {
    public BukuRemaja(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Remaja", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Remaja");
    }
}


public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> daftarBook = new ArrayList<>();

        System.out.print("Masukkan jumlah buku yang akan diinput: ");
        int jumlahBuku = scanner.nextInt();

     for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next();
            System.out.print("Penulis: ");
            String penulis = scanner.next();
            System.out.print("Publisher: ");
            String publisher = scanner.next();
            System.out.print("Kategori (Anak/Dewasa/SemuaUmur/Remaja): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            if (kategori.equalsIgnoreCase("Anak")) {
                BukuAnak book = new BukuAnak(judul, penulis, publisher, stok, tahunTerbit);
                daftarBook.add(book);
            } else if (kategori.equalsIgnoreCase("Dewasa")) {
                BukuDewasa book = new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
                daftarBook.add(book);
            } else if (kategori.equalsIgnoreCase("SemuaUmur")) {
                BukuSemuaUmur book = new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
                daftarBook.add(book);
            } else if (kategori.equalsIgnoreCase("Remaja")) {
                BukuRemaja book = new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
                daftarBook.add(book);
            } else {
                System.out.println("Kategori buku tidak valid.");
            }
        }

        System.out.println("\nDaftar Buku:");
        for (Book book : daftarBook) {
            book.display();
            System.out.println("-------------");
        }
    }
}