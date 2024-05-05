/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo.pratikum.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */import java.util.Scanner;
  class Mahasiswa {
     String nama;
     int nim;
     String jurusan;
     String alamat;

    public Mahasiswa(String nama, int nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getAlamat() {
        return alamat;
    }
}

public class Modul1No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan NIM mahasiswa:");
        int nim = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan jurusan/prodi mahasiswa:");
        String jurusan = scanner.nextLine();

        System.out.println("Masukkan alamat mahasiswa:");
        String alamat = scanner.nextLine();

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);

        // Menampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan/Prodi: " + mahasiswa.getJurusan());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
}
}