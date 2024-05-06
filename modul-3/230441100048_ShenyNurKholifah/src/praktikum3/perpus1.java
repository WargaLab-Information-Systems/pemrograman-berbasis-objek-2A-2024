/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author sheny
 */
public class perpus1 extends perpus2 {
    @Override
     public void inilisbuku(String judul, String penulis, String publisher, String kategori, String stok, String tahun){
        System.out.println("=====DAFTAR BUKU=====");
        System.out.println("Judul | Penulis | Publisher | Kategori | Stok | Tahun");
        System.out.println(judul +" | "+ penulis + " | " + publisher +" | "+ kategori +" | "+ stok +" | "+ tahun);
    }
}
