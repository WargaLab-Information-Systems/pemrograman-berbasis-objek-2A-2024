/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2.Modul2.pkg1;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

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
    private final String nama;
    private final String nim;
    private final String alamat;
    private final String jurusan;

    public Mahasiswa(String nama, String nim, String alamat, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Universitas: " + getNamaUniversitas());
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Nama Universitas: ");
            String namaUniversitas = scanner.nextLine();
            Universitas.setNamaUniversitas(namaUniversitas);
            
            char pilihan;
            do {
                System.out.println("Masukkan data mahasiswa:");
                
                System.out.print("Nama: ");
                String nama = scanner.next();
                
                System.out.print("NIM: ");
                String nim = scanner.next();
                
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
                
                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, alamat, jurusan);
                mahasiswa.display();
                
                System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
                pilihan = scanner.next().charAt(0);
            } while (pilihan == 'Y' || pilihan == 'y');
            
            
            System.out.println("Terima kasih!");
        }
    }

    private static String getJurusan(int kodeJurusan) {
        return switch (kodeJurusan) {
            case 41 -> "TEKNIK INFORMATIKA";
            case 42 -> "TEKNIK INDUSTRI";
            case 43 -> "TEKNIK ELEKTRO";
            case 44 -> "SISTEM INFORMASI";
            case 48 -> "TEKNIK MESIN";
            case 49 -> "TEKNIK MEKATRONIKA";
            default -> "Unknown";
         };
    }
}