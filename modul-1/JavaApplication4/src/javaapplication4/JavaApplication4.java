/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author acer
 */
class Mahasiswa {
    // Attribut-attribut dari kelas Mahasiswa
    private final String nama;
    private final String nim;
    private final String jurusan;
    private final String alamat;

    // Konstruktor untuk inisialisasi objek Mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Meminta pengguna untuk memasukkan informasi mahasiswa
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna untuk memasukkan informasi mahasiswa
            System.out.println("Masukkan informasi mahasiswa:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jurusan/Prodi: ");
            String jurusan = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            
            // Membuat objek Mahasiswa menggunakan konstruktor
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);
            
            // Menampilkan informasi mahasiswa
            mahasiswa.displayInfo();
        }
    }  
}
