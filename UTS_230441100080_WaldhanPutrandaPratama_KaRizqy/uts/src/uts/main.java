package uts;

class Mahasiswa {
    private final String nama;
    private final String nim;
    private final String asalSekolah;
    private final String tanggalLahir;
    private final String prodi;
    private final String alamat;

    public Mahasiswa(String nama, String nim, String asalSekolah, String tanggalLahir, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.tanggalLahir = tanggalLahir;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public void displayData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Prodi: " + prodi);
        System.out.println("Alamat: " + alamat);
    }
}

