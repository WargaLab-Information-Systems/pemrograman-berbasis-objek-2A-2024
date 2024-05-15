/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.modul3;
public class buku extends perpus{
    private String judul;
    private String penulis;
    private String publisher;
    private String kategori;
    private int stok;
    private String tahunTerbit;

    public buku(String judul, String penulis, String publisher, String kategori, int stok, String tahunTerbit) {
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
    }
}