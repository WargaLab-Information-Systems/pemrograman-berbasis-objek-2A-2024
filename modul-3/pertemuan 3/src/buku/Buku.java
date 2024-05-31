package buku;

public class Buku {
    String Judul, Penulis, Publisher, Kategori;
    int Stok, TahunTerbit;

    public Buku(String Judul, String Penulis, String Publisher, String Kategori, int Stok, int TahunTerbit) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Publisher = Publisher;
        this.Kategori = Kategori;
        this.Stok = Stok;
        this.TahunTerbit = TahunTerbit;
    }
}