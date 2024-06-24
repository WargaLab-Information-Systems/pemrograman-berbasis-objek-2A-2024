package perpustakaan;

public class Perpustakaan {
    int maxBuku; // Maksimum buku yang dapat disimpan
    Buku[] daftarBuku;
    int jumlahBuku;

    public Perpustakaan(int maxBuku) {
        this.maxBuku = maxBuku;
        this.daftarBuku = new Buku[maxBuku];
        this.jumlahBuku = 0;
    }

    Perpustakaan(int maxBuku) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < maxBuku) {
            daftarBuku[jumlahBuku++] = buku;
            System.out.println("Buku berhasil ditambahkan.");
        } else {
            System.out.println("Perpustakaan sudah penuh, buku tidak dapat ditambahkan.");
        }
    }

    public void tampilkanDaftarBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Perpustakaan kosong.");
        } else {
            System.out.println("Daftar Buku:");
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println(daftarBuku[i]);
            }
        }
    }
}