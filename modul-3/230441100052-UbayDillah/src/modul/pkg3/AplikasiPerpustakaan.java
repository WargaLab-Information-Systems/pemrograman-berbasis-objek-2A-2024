package modul.pkg3;
import java.util.ArrayList;
import java.util.Scanner;

class AplikasiPerpustakaan  {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

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

        Buku buku = new Buku(judul, penulis, publisher, kategori, stok, tahunTerbit);
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void daftarSemuaBuku() {
        System.out.println("\n\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.displayInfo();
        }
    }
}