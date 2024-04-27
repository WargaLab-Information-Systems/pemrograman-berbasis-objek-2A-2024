package Modul3;

import java.util.Scanner;
public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menyiapkan array untuk menyimpan buku-buku perpustakaan
        BukuPerpustakaan[] daftarBuku = new BukuPerpustakaan[10]; //ini
        int jumlahBuku = 0;

        // Memasukkan data buku sebanyak beberapa kali
        char ulangi;
        do {
            System.out.println("Masukkan data buku ke-" + (jumlahBuku + 1) + ":");
            System.out.println("");
            System.out.print("Judul        : ");
            String judul = input.nextLine();
            System.out.print("Penulis      : ");
            String penulis = input.nextLine();
            System.out.print("Publisher    : ");
            String publisher = input.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahunTerbit = input.nextInt();
            input.nextLine(); // Membersihkan newline

//            System.out.print("Kategori (SU/D/R/A) : ");
//            char kategori = input.next().charAt(0);
//            System.out.print("Stok         : ");
//            int stok = input.nextInt();
              System.out.print("Kategori (SU/D/R/A) : ");
              char kategori = input.next().charAt(0);
              kategori = Character.toUpperCase(kategori); //Mengubah input menjadi huruf besar

              // Validasi input kategori
              while (kategori != 'S' && kategori != 'U' && 
                      kategori != 'D' && kategori != 'R' && kategori != 'A') {
              System.out.println("Kategori tidak valid. Harap masukkan kategori dd" + "yang benar (SU/D/R/A)!");
              System.out.print("Kategori (SU/D/R/A) : ");
              kategori = input.next().charAt(0);
              kategori = Character.toUpperCase(kategori); // Mengubah input jadi huruf besar
              }

              System.out.print("Stok         : ");
              int stok = input.nextInt();

              
            // Membuat objek BukuPerpustakaan dan menyimpannya ke dalam array
            daftarBuku[jumlahBuku] = new BukuPerpustakaan(judul, penulis, 
                    publisher, tahunTerbit, kategori, stok);
            jumlahBuku++;

            System.out.print("\nApakah ingin memasukkan data buku lagi? (y/n) : ");
            ulangi = input.next().charAt(0);
            input.nextLine(); // Membersihkan newline

            // Validasi input ulangi
            while (ulangi != 'y' && ulangi != 'n') {
                System.out.println("Masukkan yang benar (y/n)!");
                System.out.print("Apakah ingin memasukkan data buku lagi? (y/n) : ");
                ulangi = input.next().charAt(0);
                input.nextLine(); // Membersihkan newline
            }
        } while (ulangi == 'y');

        // Menampilkan daftar buku yang telah dimasukkan
        System.out.println("");
        System.out.println("\nDaftar Buku:");
        System.out.println("");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Buku ke-" + (i + 1));
            daftarBuku[i].displayInfo();
            System.out.println("");
            System.out.println();
        }

//      digunakan untuk membersihkan dan menutup objek Scanner setelah selesai digunakan.
        input.close();
    }
}
