package com.main;

import java.util.Scanner;

// Parent class 
class Universitas {
    private static String namaUniversitas;

    static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

// Child Class
class Mahasiswa extends Universitas {
    private String nim;
    private String nama;
    private String alamat;
    private int jurusan;

    Mahasiswa(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    void displayInfo() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama Universitas: " + getNamaUniversitas());
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + getJurusanString());
    }

    String getJurusanString() {
        return switch (jurusan) {
            case 41 -> "Teknik Informatika";
            case 42 -> "Teknik Industri";
            case 43 -> "Teknik Elektro";
            case 44 -> "Sistem Informasi";
            case 48 -> "Teknik Mesin";
            case 49 -> "Teknik Mekatronika";
            default -> "Jurusan tidak valid";
        };
    }
}

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);

        // Looping
        String ulang;
        boolean inputLanjut = true;
        
        while (inputLanjut) {
            System.out.println("\nMasukkan Data Mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            
            String alamat = scanner.nextLine();
            System.out.println("Jurusan:");
            System.out.println("41 = Teknik Informatika");
            System.out.println("42 = Teknik Industri");
            System.out.println("43 = Teknik Elektro");
            System.out.println("44 = Sistem Informasi");
            System.out.println("48 = Teknik Mesin");
            System.out.println("49 = Teknik Mekatronika");
            System.out.print("Pilih Jurusan (41/42/43/44/48/49): ");
            int jurusan = scanner.nextInt();
            scanner.nextLine(); 

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            
            // Menampilkan display
            mahasiswa.displayInfo();

            // Input lanjut atau tidak
            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            ulang = scanner.nextLine();
            
            if (ulang.equals("t") || ulang.equals("T")) {
                 inputLanjut = false;
            } else {
                inputLanjut = true;
            }
        } ;
    }
    
}
