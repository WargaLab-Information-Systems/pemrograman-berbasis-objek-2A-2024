/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;
import java.util.Scanner;
import java.util.ArrayList;
public class DaftarPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> listbuku = new ArrayList<>();
        int jumlahBuku;
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = input.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Input data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String Judul = input.next();
            System.out.print("Penulis: ");
            String Penulis = input.next();
            System.out.print("Publisher: ");
            String Publisher = input.next();
            System.out.println("Kategori(SU/D/R/A): ");
            System.out.println("SU = Semua Umur");
            System.out.println("D = Dewasa");
            System.out.println("R = Remaja");
            System.out.println("A = Anak - Anak");
            System.out.println("Pilih Kategori(SU/D/R/A)");
            String Kategori = input.next();
            System.out.print("Stok: ");
            int Stok = input.nextInt();
            System.out.print("Tahun Terbit: ");
            int TahunTerbit = input.nextInt();

            Buku bukubaru = null;
                switch (Kategori.toUpperCase()) {
                    case "SU" -> bukubaru = new bukuall(Judul, Penulis, Publisher, Kategori, Stok, TahunTerbit);
                    case "A", "R", "D" -> { bukubaru = new bukuall(Judul, Penulis, Publisher, Kategori, Stok, TahunTerbit);
                }
                }
            listbuku.add(bukubaru);         
        }   
            System.out.println("\nDaftar Buku");
            for (Buku buku : listbuku) {
                buku.hasildaftar();
                System.out.println();
        }
    }
}
    

