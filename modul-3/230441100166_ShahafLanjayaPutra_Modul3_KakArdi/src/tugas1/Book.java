/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
public class Book {
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    public Book(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

