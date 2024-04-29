package modul3;

import java.util.Scanner;

public class AplikasiPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarBuku daftarBuku = new DaftarBuku();

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int X = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < X; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1));
            System.out.print("Judul              : ");
            String judul = scanner.nextLine();
            System.out.print("Penulis            : ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher          : ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.nextLine();
            System.out.print("Stok               : ");
            int stok = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Tahun Terbit       : ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); 

            BukuPerpustakaan buku = new BukuPerpustakaan(judul, penulis, publisher, kategori, stok, tahunTerbit);
            daftarBuku.tambahBuku(buku);
        }

        System.out.println("\nDaftar Buku:");
        daftarBuku.tampilkanDaftarBuku();
    }
}
