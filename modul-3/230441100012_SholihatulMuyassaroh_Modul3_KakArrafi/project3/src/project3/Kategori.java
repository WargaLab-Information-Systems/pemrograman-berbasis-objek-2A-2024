/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;

/**
 *
 * @author User
 */
public class Kategori extends Buku {
    public String kategori;

    public Kategori(String judul, String penulis, String publisher, int stok, int tahunTerbit, String kategori) {
        super(judul, penulis, publisher, stok, tahunTerbit);
        this.kategori = kategori;
    }
}

   