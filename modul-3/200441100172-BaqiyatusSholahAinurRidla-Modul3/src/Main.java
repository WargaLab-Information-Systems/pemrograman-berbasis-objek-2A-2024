import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Perpustakaan rakbuku = new Perpustakaan();
        Buku bukubaru = new Buku();
        System.out.println("data buku sebelumnya : ");
        rakbuku.Tampil();
        Scanner masukan = new Scanner(System.in);
        System.out.print("Ingin menambah berapa Buku : ");
        String x = masukan.nextLine();
        int y = Integer.parseInt(x);
        for(int i = 0; i < y; i++){
            System.out.print("Judul : ");
            String judul = masukan.nextLine();
            System.out.print("Penulis : ");
            String penulis = masukan.nextLine();
            System.out.print("Publisher : ");
            String publisher = masukan.nextLine();
            System.out.print("Kategori : ");
            String kategori = masukan.nextLine();
            System.out.print("Stok : ");
            String stok1 = masukan.nextLine();
            int stok = Integer.parseInt(stok1);
            System.out.print("Tahun Terbit : ");
            String tahun = masukan.nextLine();
            bukubaru.SimpanBuku(judul, penulis, publisher, kategori, stok, tahun, stok, i);
            System.out.println("------------------------");
        }
        masukan.close();
        System.out.println();
        System.out.println("berikut data buku yang berhasil ditambah");
        bukubaru.Tampil();
    }
}
