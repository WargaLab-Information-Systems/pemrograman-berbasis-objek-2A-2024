/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;
class Buku {
    protected String Judul;
    protected String Penulis;
    protected String Publisher;
    protected String Kategori;
    protected int Stok;
    protected int TahunTerbit;
    
     public Buku(String Judul, String Penulis, String Publisher, String Kategori, int Stok, int TahunTerbit) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Publisher = Publisher;
        this.Kategori = Kategori;
        this.Stok = Stok;
        this.TahunTerbit = TahunTerbit;
    }
    public void hasildaftar(){
        System.out.println("Judul : " + Judul);
        System.out.println("Penulis : "+ Penulis);
        System.out.println("Penerbit : "+ Publisher);
        System.out.println("Kategori : "+ Kategori);
        System.out.println("Stok : "+ Stok);
        System.out.println("Tahun Terbit : "+ TahunTerbit);
    }

  
}
