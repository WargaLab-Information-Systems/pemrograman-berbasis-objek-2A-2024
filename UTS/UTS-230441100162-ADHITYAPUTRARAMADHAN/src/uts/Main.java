/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        return jurusan;
    }
}

 class Aplikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        String inputLagi;
        do {
            System.out.print("\nMasukkan NIM: ");
            String nim = input.next();
            input.nextLine(); 

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = input.nextLine();

            System.out.println("Pilihan Jurusan:");
            System.out.println("TEKNIK INFORMATIKA");
            System.out.println("TEKNIK INDUSTRI");
            System.out.println("TEKNIK ELEKTRO");
            System.out.println("SISTEM INFORMASI");
            System.out.println("TEKNIK MESIN");
            System.out.println("TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Kode Jurusan: ");
            String kodeJurusan = input.next();
            String jurusan;
  jurusan = switch (kodeJurusan) {
                case "TI" -> "TEKNIK INFORMATIKA";
                case "TIS" -> "TEKNIK INDUSTRI";
                case "TE" -> "TEKNIK ELEKTRO";
                case "SI" -> "SISTEM INFORMASI";
                case "TM" -> "TEKNIK MESIN";
                case "TMK" -> "TEKNIK MEKATRONIKA";
                default -> "Unknown";
            };

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = input.next();
        } while (inputLagi.equalsIgnoreCase("Y"));
    }