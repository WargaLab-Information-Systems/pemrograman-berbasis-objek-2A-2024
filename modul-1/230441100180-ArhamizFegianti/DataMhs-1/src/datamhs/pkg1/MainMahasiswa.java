/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamhs.pkg1;

import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String Alamat;

    public Mahasiswa(String nama, String nim, String jurusan, String Alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.Alamat = Alamat;
    }

    public void Tampilan() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + Alamat);
    }
}

public class MainMahasiswa {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data mahasiswa:");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);

        // Memanggil method untuk menampilkan data mahasiswa
        System.out.println("\nData Mahasiswa:");
        mahasiswa.Tampilan();

        scanner.close();
  }
}
