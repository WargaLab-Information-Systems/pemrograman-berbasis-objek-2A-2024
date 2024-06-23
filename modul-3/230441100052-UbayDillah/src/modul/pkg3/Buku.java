package modul.pkg3;
class Buku extends Perpustakaan{
    private String judul;
    private String penulis;
    private String publisher;
    private String kategori;
    private int stok;
    private String tahunTerbit;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, String tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public void displayInfo() {
        System.out.println("==================");
        System.out.println("Nama Perpustakaan: " + getNamaPerpustakaan());
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + getKategori());
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
    
    public String getKategori() {
        return switch (kategori) {
            case "D"  -> "Dewasa";
            case "R"  -> "Remaja";
            case "A"  -> "Anak-Anak";
            case "SU" -> "Semua Umur";
            default   -> "None";
        };
    };
}
