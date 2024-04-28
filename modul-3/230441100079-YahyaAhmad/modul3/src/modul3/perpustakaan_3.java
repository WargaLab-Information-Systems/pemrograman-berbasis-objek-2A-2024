package modul3;

public class perpustakaan_3 extends perpustakaan_1{
    @Override
    public void inilisbuku(String judul, String penulis, String publisher, String kategori, String stok, String tahun){
        System.out.println("=====DAFTAR BUKU=====");
        System.out.println("Judul | Penulis | Publisher | Kategori | Stok | Tahun");
        System.out.println(judul +" | "+ penulis + " | " + publisher +" | "+ kategori +" | "+ stok +" | "+ tahun);
    }
}
