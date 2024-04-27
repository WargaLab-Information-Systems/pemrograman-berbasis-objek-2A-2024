/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2.modul1;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    // Konstruktor
    public Mahasiswa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        this.nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        this.nim = input.nextLine();
        System.out.print("Masukkan jurusan/prodi: ");
        this.jurusan = input.nextLine();
        System.out.print("Masukkan alamat: ");
        this.alamat = input.nextLine();
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tampilkanInformasi();
    }
}
