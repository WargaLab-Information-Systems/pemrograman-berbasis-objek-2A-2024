/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugas.prak.modul2;

import java.util.Scanner;
public class TugasPrakModul2 {
// Parent class
class Universitas {
    private static String namaUniversitas;

    // Static setter untuk namaUniversitas
    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    // Static getter untuk namaUniversitas
    public static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

// Child class
class Mahasiswa extends Universitas {
    private final String nim;
    private final String nama;
    private final String alamat;
    private final String jurusan;

    // Constructor untuk inisialisasi data mahasiswa
    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data mahasiswa
    public void display() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama Universitas: " + getNamaUniversitas());
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + getJurusan(jurusan));
    }

    // Method untuk mengubah kode jurusan menjadi nama jurusan
    private String getJurusan(String kodeJurusan) {
        return switch (kodeJurusan) {
            case "41" -> "TEKNIK INFORMATIKA";
            case "42" -> "TEKNIK INDUSTRI";
            case "43" -> "TEKNIK ELEKTRO";
            case "44" -> "SISTEM INFORMASI";
            case "48" -> "TEKNIK MESIN";
            case "49" -> "TEKNIK MEKATRONIKA";
            default -> "Jurusan Tidak Diketahui";
        };
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String namaUniversitas;
            
            // Memasukkan nama universitas dan mengatur static variable
            System.out.print("Masukkan Nama Universitas: ");
            namaUniversitas = scanner.nextLine();
            Universitas.setNamaUniversitas(namaUniversitas);
            
            char lagi;
            do {
                // Memasukkan data mahasiswa
                System.out.println("\nMasukkan Data Mahasiswa:");
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Alamat: ");
                String alamat = scanner.nextLine();
                System.out.print("Jurusan (Kode Jurusan): ");
                String jurusan = scanner.nextLine();
                
                // Membuat objek mahasiswa
                Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
                
                // Menampilkan data mahasiswa
                mahasiswa.display();
                
                // Memeriksa apakah ingin memasukkan data lagi
                System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
                lagi = scanner.nextLine().charAt(0);
            } while (lagi == 'Y' || lagi == 'y');
            
            System.out.println("Terima kasih!");
        }
    }
}
}

