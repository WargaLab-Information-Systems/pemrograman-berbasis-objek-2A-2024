/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1prak2;

import java.util.ArrayList;
import java.util.HashMap;
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

    public void displayInfo() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Alamat   : " + alamat);
        System.out.println("Jurusan  : " + jurusan);
    }
}

class DataMahasiswa {
    private static String universitas;
    private ArrayList<Mahasiswa> mahasiswas;

    static {
        universitas = "";
    }

    public DataMahasiswa() {
        mahasiswas = new ArrayList<>();
    }

    public static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    public static String getUniversitas() {
        return universitas;
    }

    public void tambahMahasiswa(String nim, String nama, String alamat, String jurusanKode) {
        String jurusan = getJurusan(jurusanKode);
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
        mahasiswas.add(mahasiswa);
    }

    private String getJurusan(String kode) {
        HashMap<String, String> jurusanMap = new HashMap<>();
        jurusanMap.put("41", "TEKNIK INFORMATIKA");
        jurusanMap.put("42", "TEKNIK INDUSTRI");
        jurusanMap.put("43", "TEKNIK ELEKTRO");
        jurusanMap.put("44", "SISTEM INFORMASI");
        jurusanMap.put("48", "TEKNIK MESIN");
        jurusanMap.put("49", "TEKNIK MEKATRONIKA");

        return jurusanMap.getOrDefault(kode, "Unknown");
    }

    public void displayAllMahasiswa() {
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println("Universitas: " + universitas);
            mahasiswa.displayInfo();
            System.out.println();
        }
    }
}

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataMahasiswa dataMahasiswa = new DataMahasiswa();

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        DataMahasiswa.setUniversitas(namaUniversitas);

        while (true) {
            System.out.println("\nMasukkan data mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Kode Jurusan (41-49): ");
            String jurusanKode = scanner.nextLine();

            dataMahasiswa.tambahMahasiswa(nim, nama, alamat, jurusanKode);

            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("\nDaftar Mahasiswa:");
        dataMahasiswa.displayAllMahasiswa();

        scanner.close();
    }
    
}