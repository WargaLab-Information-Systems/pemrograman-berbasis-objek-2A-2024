package perpustakaan;

public class Buku extends Perpustakaan {
    String judul;
    String penulis;
    String publisher;
    char kategori;
    int stok;
    int tahunTerbit;

    public Buku(String judul, String penulis, String publisher, char kategori, int stok, int tahunTerbit) {
        super(0); // Panggil konstruktor kelas induk dengan nilai default
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Publisher: " + publisher + ", Kategori: " + kategori + ", Stok: " + stok + ", Tahun Terbit: " + tahunTerbit;
    }
}
