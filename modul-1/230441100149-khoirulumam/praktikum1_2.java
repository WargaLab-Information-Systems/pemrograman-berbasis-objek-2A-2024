package com.mycompany.pbopraktikum;
import java.math.BigInteger;
import java.util.Scanner;

class mahasiswa {
    String nama;
    BigInteger nim;
    String jurusan;
    String alamat;
}

public class praktikum1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mahasiswa orang1 = new mahasiswa();
        
        // Meminta pengguna memasukkan data
        System.out.print("Masukkan nama : ");
        orang1.nama = scanner.nextLine();
        System.out.print("Masukkan nim : ");
        orang1.nim = new BigInteger (scanner.nextLine());
        System.out.print("Masukkan jurusan: ");
        orang1.jurusan = scanner.nextLine();
        System.out.print("Masukkan alamat : ");
        orang1.alamat = scanner.nextLine();
        
        // Menampilkan data mahasiswa yang dimasukkan
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + orang1.nama);
        System.out.println("NIM: " + orang1.nim);
        System.out.println("Jurusan: " + orang1.jurusan);
        System.out.println("Alamat: " + orang1.alamat);
    }
}
