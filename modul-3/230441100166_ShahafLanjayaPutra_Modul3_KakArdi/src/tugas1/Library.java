/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.print("Kategori (A/D/R/SU): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            if (kategori.equalsIgnoreCase("A")) {
                BukuAnak book = new BukuAnak(judul, penulis, publisher, stok, tahunTerbit);
                daftarBook.add(book);
            } else if (kategori.equalsIgnoreCase("D")) {
                BukuDewasa book = new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
                daftarBook.add(book);
            } else if (kategori.equalsIgnoreCase("R")) {
                BukuRemaja book = new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
                daftarBook.add(book);
            } else if (kategori.equalsIgnoreCase("SU")) {
                BukuSemuaUmur book = new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
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
