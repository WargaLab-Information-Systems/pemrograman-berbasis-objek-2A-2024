/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg2;
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
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Kode Jurusan: ");
            String kodeJurusan = input.next();
            String jurusan;
  jurusan = switch (kodeJurusan) {
                case "41" -> "TEKNIK INFORMATIKA";
                case "42" -> "TEKNIK INDUSTRI";
                case "43" -> "TEKNIK ELEKTRO";
                case "44" -> "SISTEM INFORMASI";
                case "48" -> "TEKNIK MESIN";
                case "49" -> "TEKNIK MEKATRONIKA";
                default -> "Unknown";
            };

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = input.next();
        } while (inputLagi.equalsIgnoreCase("Y"));

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }
    }
}
