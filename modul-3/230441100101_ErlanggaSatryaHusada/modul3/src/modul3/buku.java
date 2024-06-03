/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

// Parent class
class buku {
    String judul;
    String penulis;
    String publisher;
    char kategori;
    int stok;
    int TahunTerbit;

    
    public buku(String param_judul, String param_penulis, String param_publisher, char param_kategori, int param_stok, int param_TahunTerbit) {
        this.judul = param_judul;
        this.penulis = param_penulis;
        this.publisher = param_publisher;
        this.kategori = param_kategori;
        this.stok = param_stok;
        this.TahunTerbit = param_TahunTerbit;
    }

    // Method to display book details
    public void TampilanBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + TahunTerbit);
    }
}
