/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.modul2;
import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    String alamat;
    String jurusan;

    Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    void display() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + getJurusanName());
    }
        protected String getJurusanName() {
        switch (jurusan) {
            case "41":
                return "Teknik Informatika";
            case "42":
                return "Teknik Industri";
            case "43":
                return "Teknik Elektro";
            case "44":
                return "Sistem Informasi";
            case "48":
                return "Teknik Mesin";
            case "49":
                return "Teknik Mekatronika";
            default:
                return "Jurusan tidak valid";
        }
    }
}

class DataMahasiswa extends Mahasiswa {
    static ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

    DataMahasiswa(String nim, String nama, String alamat, String jurusan) {
        super(nim, nama, alamat, jurusan);
    }

    static void tambahMahasiswa(String nim, String nama, String alamat, String jurusan) {
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        System.out.println("Nama Universitas: " + namaUniversitas);

        char pilihan;
        do {
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.next();
            scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Jurusan (41-TEKNIK INFORMATIKA, 42-TEKNIK INDUSTRI, 43-TEKNIK ELEKTRO, 44-SISTEM INFORMASI, 48-TEKNIK MESIN, 49-TEKNIK MEKATRONIKA): ");
            String jurusan = scanner.next();
            scanner.nextLine();

            DataMahasiswa.tambahMahasiswa(nim, nama, alamat, jurusan);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            pilihan = scanner.next().charAt(0);
        } while (pilihan == 'Y' || pilihan == 'y');

        DataMahasiswa.tampilkanDaftarMahasiswa();

        scanner.close();
    }
}