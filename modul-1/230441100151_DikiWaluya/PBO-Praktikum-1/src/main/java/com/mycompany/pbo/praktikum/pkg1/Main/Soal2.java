/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo.praktikum.pkg1.Main;

/**
 *
 * @author NAOFUMI
 */
import java.util.Scanner;

class Mahasiswa {

    String nama;
    String nim;
    String prodi;
    String alamat;

    public Mahasiswa() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getAlamat() {
        return alamat;
    }
}

public class Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data mahasiswa");
        System.out.println("Nama:");
        String nama = scanner.nextLine();
        System.out.println("NIM:");
        String nim = scanner.nextLine();
        System.out.println("Prodi:");
        String prodi = scanner.nextLine();
        System.out.println("Alamat:");
        String alamat = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama(nama);
        mahasiswa.setNIM(nim);
        mahasiswa.setProdi(prodi);
        mahasiswa.setAlamat(alamat);

        System.out.println("\nData mahasiswa:");
        System.out.println("Nama:" + mahasiswa.getNama());
        System.out.println("NIM:" + mahasiswa.getNIM());
        System.out.println("Prodi:" + mahasiswa.getProdi());
        System.out.println("Alamat:" + mahasiswa.getAlamat());
    }
}
