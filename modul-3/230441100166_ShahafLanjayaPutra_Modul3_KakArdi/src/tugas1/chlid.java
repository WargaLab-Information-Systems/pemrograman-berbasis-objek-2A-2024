/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
class BukuAnak extends Book {
    public BukuAnak(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Anak", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Anak");
    }
}

class BukuDewasa extends Book {
    public BukuDewasa(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Dewasa", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Dewasa");
    }
}

class BukuSemuaUmur extends Book {
    public BukuSemuaUmur(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Semua Umur", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Semua Umur");
    }
}

class BukuRemaja extends Book {
    public BukuRemaja(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, "Remaja", stok, tahunTerbit);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Buku Remaja");
    }
}