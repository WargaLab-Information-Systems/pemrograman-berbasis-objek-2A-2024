package modul3;

public class Buku {
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public void displayInfo() {
        System.out.println("========================///========================" );
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Publisher   : " + publisher);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Stok        : " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}