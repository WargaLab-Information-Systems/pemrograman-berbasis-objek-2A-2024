/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author USER
 */
public class tampilan extends output {

    @Override
    public void listbuku (String judulbuku, String penulis, String publisher, String kategori, String stok, String tahunterbit){
            System.out.println("=====list buku=====");  
            System.out.println("judul buku : " + judulbuku);
            System.out.println("penulis : " + penulis);
            System.out.println("publisher : " + publisher);
            System.out.println("kategori : " + kategori);
            System.out.println("stok : " + stok);
            System.out.println("tahun terbit : " + tahunterbit);
}
}