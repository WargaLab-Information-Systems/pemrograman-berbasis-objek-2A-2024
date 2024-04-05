package com.main;

import java.util.Scanner;

class Mahasiswa {
    String nama, nim, jurusan, alamat;

    // construct
     public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public void tampilkanMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("=======Masukkan data mahasiswa=======");
        
        System.out.print("Nama: ");
        String nama = inputUser.nextLine();
        
        System.out.print("NIM: ");
        String nim = inputUser.nextLine();
        
        System.out.print("Jurusan/Prodi: ");
        String jurusan = inputUser.nextLine();
        
        System.out.print("Alamat: ");
        String alamat = inputUser.nextLine();

        Mahasiswa mahasiswa1 = new Mahasiswa(nama, nim, jurusan, alamat);

        System.out.println("\n=========Data Mahasiswa=========");
        mahasiswa1.tampilkanMahasiswa();
    }
}
