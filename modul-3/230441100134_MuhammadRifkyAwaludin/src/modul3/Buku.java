package Modul3;

// Parent class
class Buku {
    // Atribut-atribut yang umum untuk semua buku
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected int tahunTerbit;

    // Constructor untuk menginisialisasi atribut-atribut
    public Buku(String judul, String penulis, String publisher, int tahunTerbit) 
    {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Publisher    : " + publisher);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}

// Child class yang mewarisi Buku
class BukuPerpustakaan extends Buku {
    // Atribut tambahan untuk buku perpustakaan
    private final char kategori;
    private final int stok;

    // Constructor untuk menginisialisasi atribut tambahan
    public BukuPerpustakaan(String judul, String penulis, String publisher, int tahunTerbit, char kategori, int stok) {
        super(judul, penulis, publisher, tahunTerbit);
        this.kategori = kategori;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi buku perpustakaan
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori     : " + kategori);
        System.out.println("Stok         : " + stok);
    }
}

