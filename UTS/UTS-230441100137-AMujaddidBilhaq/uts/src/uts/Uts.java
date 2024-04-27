package uts;
import java.util.Scanner;

// Superclass Mahasiswa
class Mahasiswa {
     String nama;
     String nim;
     String asalSekolah;
     String tanggalLahir;
     String prodi;
     String alamat;

    // Constructor
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

//class MahasiswaSI extends Mahasiswa {
//    public MahasiswaSI(String nama, String nim, String asalSekolah, String tanggalLah{
        
    }
