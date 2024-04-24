/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1_modul2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
class Mahasiswa {
    int nim;
    String nama;
    String alamat;
    int jurusanCode;
    
      public Mahasiswa(int nim, String nama, String alamat, int jurusanCode) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusanCode = jurusanCode;
    }

    public int getNIM() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJurusanCode() {
        return jurusanCode;
    }
    
    public String getJurusan() {
        if (jurusanCode == 41)
            return "TEKNIK INFORMATIKA";
        else if (jurusanCode == 42)
            return "TEKNIK INDUSTRI";
        else if (jurusanCode == 43)
            return "TEKNIK ELEKTRO";
        else if (jurusanCode == 44)
            return "SISTEM INFORMASI";
        else if (jurusanCode == 48)
            return "TEKNIK MESIN";
        else if (jurusanCode == 49)
            return "TEKNIK MEKATRONIKA";
        else
            return "Tidak valid";
    }
}

public class SOAL1_Modul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            char pilihan;
            do {
                System.out.println("DATA UNIVERSITAS TRUNOJOYO MADURA");
                System.out.println("Masukkan Data Mahasiswa:");
                System.out.print("Input NIM: ");
                int nim;
                nim = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Input Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Input Alamat: ");
                String alamat = scanner.nextLine();
                System.out.println("Jurusan:");
                System.out.println("41. TEKNIK INFORMATIKA");
                System.out.println("42. TEKNIK INDUSTRI");
                System.out.println("43. TEKNIK ELEKTRO");
                System.out.println("44. SISTEM INFORMASI");
                System.out.println("48. TEKNIK MESIN");
                System.out.println("49. TEKNIK MEKATRONIKA");
                System.out.print("Pilih Jurusan (41/42/43/44/48/49): ");
                int jurusanCode = scanner.nextInt();
                scanner.nextLine(); 
                
                Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusanCode);
                System.out.println("Data Mahasiswa yang Telah Dimasukkan:");
                System.out.println("NIM: " + mahasiswa.getNIM());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("Alamat: " + mahasiswa.getAlamat());
                System.out.println("Jurusan: " + mahasiswa.getJurusan());
                
                System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
                pilihan = scanner.nextLine().charAt(0);
            }while (pilihan == 'Y' || pilihan == 'y');
        }
    }
}
