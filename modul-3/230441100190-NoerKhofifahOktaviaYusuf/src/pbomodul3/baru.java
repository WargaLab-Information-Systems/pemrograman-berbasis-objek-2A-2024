package pbomodul3;
class BukuDewasa extends Buku {
    public BukuDewasa(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
    }
}

class BukuAnak extends Buku {
    public BukuAnak(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
    }
}