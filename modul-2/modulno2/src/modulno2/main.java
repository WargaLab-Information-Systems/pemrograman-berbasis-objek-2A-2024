/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulno2;

import java.util.ArrayList;
import java.util.Scanner;

// Parent class Mahasiswa
class Mahasiswa {
    protected String nim;
    protected String nama;
    protected String alamat;
    protected String jurusan;

    // Constructor
    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    // Getter methods
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

// Child class Universitas
class Universitas {
    private static String namaUniversitas;

    // Setter method for static variable
    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    // Getter method for static variable
    public static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

public class  main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniv = scanner.nextLine();
        Universitas.setNamaUniversitas(namaUniv);

        char inputLagi;
        do {
            System.out.println("\nMasukkan data mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Jurusan:");
            System.out.println("1. Teknik Informatika");
            System.out.println("2. Teknik Industri");
            System.out.println("3. Teknik Elektro");
            System.out.println("4. Sistem Informasi");
            System.out.println("5. Teknik Mesin");
            System.out.println("6. Teknik Mekatronika");
            System.out.print("Pilih Jurusan (kode): ");
            String jurusanKode = scanner.nextLine();
            String jurusan = "";

            switch (jurusanKode) {
                case "41":
                    jurusan = "Teknik Informatika";
                    break;
                case "42":
                    jurusan = "Teknik Industri";
                    break;
                case "43":
                    jurusan = "Teknik Elektro";
                    break;
                case "44":
                    jurusan = "Sistem Informasi";
                    break;
                case "48":
                    jurusan = "Teknik Mesin";
                    break;
                case "49":
                    jurusan = "Teknik Mekatronika";
                    break;
                default:
                    System.out.println("Kode jurusan tidak valid!");
                    break;
            }

            // Buat objek Mahasiswa dan tambahkan ke ArrayList
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = scanner.nextLine().charAt(0);
        } while (inputLagi == 'Y' || inputLagi == 'y');

        // Tampilkan daftar mahasiswa yang telah dimasukkan
        System.out.println("\nDaftar Mahasiswa " + Universitas.getNamaUniversitas() + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }

        scanner.close();
    }
}

    
    
    
    
    
    
/**
 *
 * @author Asus
 */

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    
    