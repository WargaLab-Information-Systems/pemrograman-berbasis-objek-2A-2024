package perpustakaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan maksimum jumlah buku yang ingin dimasukkan ke dalam perpustakaan: ");
        int maxBuku = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline dari input sebelumnya

        Perpustakaan perpustakaan = new Perpustakaan(maxBuku);

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline dari input sebelumnya

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1) + ":");
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            char kategori = scanner.nextLine().charAt(0);
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline dari input sebelumnya

            Buku buku = new Buku(judul, penulis, publisher, kategori, stok, tahunTerbit);
            perpustakaan.tambahBuku(buku);
        }

        System.out.println("\nDaftar Buku yang telah dimasukkan:");
        perpustakaan.tampilkanDaftarBuku();
        
        // Tutup scanner setelah digunakan
        scanner.close();
    }
}
