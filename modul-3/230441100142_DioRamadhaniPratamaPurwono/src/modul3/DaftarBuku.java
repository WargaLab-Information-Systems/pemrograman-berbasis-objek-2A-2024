package modul3;


import java.util.ArrayList;

public class DaftarBuku {
    private final ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        for (Buku buku : daftarBuku) {
            buku.displayInfo();
            System.out.println();
        }
    }

}
