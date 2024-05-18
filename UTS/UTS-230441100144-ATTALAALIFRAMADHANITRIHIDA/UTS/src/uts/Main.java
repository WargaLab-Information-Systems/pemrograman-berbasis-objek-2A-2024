/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String asalsekolah;
    int tanggallahir;
    String prodi;
    String alamat;

    Mahasiswa(String nama, String nim, String asalsekolah, int tanggallahir, String prodi, String alamat) {
        
        this.nama = nama;
        this.nim = nim;
        this.asalsekolah = asalsekolah;
        this.tanggallahir = tanggallahir;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    void display() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Asal sekolah: " + asalsekolah);
        System.out.println("Tanggal lahir: " + tanggallahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Prodi: " + getProdiName());
    }
        protected String getProdiName() {
        switch (prodi) {
            case "SI":
                return "Sistem Informasi";
            case "TIF":
                return "Teknik Informatika";
            case "TI":
                return "Teknik Industri";
            case "TM":
                return "Teknik Mesin";
            case "TMK":
                return "Teknik Mekatronika";
            case "TE":
                return "Teknik Elektronika";
            default:
                return "Jurusan tidak valid";
        }
    }
}

class DataMahasiswa extends Mahasiswa {
    static ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

    DataMahasiswa(String nama, String nim, String asalsekolah, int tanggallahir, String prodi, String alamat) {
        super(nama, nim, asalsekolah, tanggallahir, prodi, alamat);
    }

    static void tambahMahasiswa(String nama, String nim, String asalsekolah, int tanggallahir, String prodi, String alamat) {
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, asalsekolah, tanggallahir, prodi, alamat);
        mahasiswaList.add(mahasiswa);
    }

    static void tampilkanDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            mhs.display();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
        do {
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("Nama: ");
            String nama = input.next();
            input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Asal Sekolah: ");
            String asalsekolah = input.nextLine();
            System.out.print("Tanggal Lahir: ");
            int tanggallahir = input.nextInt();
            System.out.print("Jurusan (SI-SISTEM INFORMASI, TIF-TEKNIK INFORMATIKA, TI-TEKNIK INDUSTRI, TM-TEKNIK MESIN, TMK-TEKNIK MEKATRONIKA, TE-TEKNIK ELEKTRONIKA): ");
            String prodi = input.next();
            input.nextLine();
            System.out.print("Alamat: ");
            String alamat = input.next();
            DataMahasiswa.tambahMahasiswa(nama, nim, asalsekolah, tanggallahir, prodi, alamat);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            pilihan = input.next().charAt(0);
        } while (pilihan == 'Y' || pilihan == 'y');

        DataMahasiswa.tampilkanDaftarMahasiswa();

        input.close();
    }
}