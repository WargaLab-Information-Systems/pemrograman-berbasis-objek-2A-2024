package Buku;
import java.util.Scanner;
public class AplikasiPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();

        Buku[] daftarBuku = new Buku[jumlahBuku];
//i++= variabel ny akan bertambah 1 setiap perulangan
        for (int i = 0; i < jumlahBuku; i++) 
        { 
            System.out.println("Data Buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.next();
            System.out.print("Penulis: ");
            String penulis = input.next();
            System.out.print("Publisher: ");
            String publisher = input.next();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = input.next();
            System.out.print("Stok: ");
            int stok = input.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();

            BukuPerpustakaan buku = new BukuPerpustakaan(judul, penulis, publisher, kategori, stok, tahunTerbit);
            daftarBuku[i] = buku;
        }
        System.out.println("\nDaftar Buku:");
        for (Buku a : daftarBuku) {
            a.tampilkanInfo();
        }
    }
}