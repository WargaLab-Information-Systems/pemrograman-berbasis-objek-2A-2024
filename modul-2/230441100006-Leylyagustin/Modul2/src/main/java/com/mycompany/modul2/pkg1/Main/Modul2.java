/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul2.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */import java.util.Scanner;

class Universitas {
    static String namaUniversitas;

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

class Mahasiswa extends Universitas {
    String nim;
    String nama;
    String alamat;
    String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void display() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Universitas: " + getNamaUniversitas());
    }
}

public class Modul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);

        char pilihan;
        do {
            System.out.println("Masukkan data mahasiswa:");

            System.out.print("NIM: ");
            String nim = scanner.next();

            System.out.print("Nama: ");
            String nama = scanner.next();

            scanner.nextLine(); // consume newline

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            System.out.println("Jurusan: ");
            System.out.println("1. 41 = TEKNIK INFORMATIKA");
            System.out.println("2. 42 = TEKNIK INDUSTRI");
            System.out.println("3. 43 = TEKNIK ELEKTRO");
            System.out.println("4. 44 = SISTEM INFORMASI");
            System.out.println("5. 48 = TEKNIK MESIN");
            System.out.println("6. 49 = TEKNIK MEKATRONIKA");
            System.out.print("Pilih jurusan (kode): ");
            int kodeJurusan = scanner.nextInt();
            String jurusan = getJurusan(kodeJurusan);

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            mahasiswa.display();

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            pilihan = scanner.next().charAt(0);
        } while (pilihan == 'Y' || pilihan == 'y');

        System.out.println("Terima kasih!");
        scanner.close();
    }

    private static String getJurusan(int kodeJurusan) {
        switch (kodeJurusan) {
            case 41:
                return "TEKNIK INFORMATIKA";
            case 42:
                return "TEKNIK INDUSTRI";
            case 43:
                return "TEKNIK ELEKTRO";
            case 44:
                return "SISTEM INFORMASI";
            case 48:
                return "TEKNIK MESIN";
            case 49:
                return "TEKNIK MEKATRONIKA";
            default:
                return "Unknown";
        }
    }
}