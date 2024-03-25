/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1_230441100012_sholihatul.muyassaroh.PROJECT1_230441100012_SholihatulMuyassaroh;

/**
 *
 * @author User
 */

import java.util.Scanner;

//mahasiswa ini adalah classnya
class Mahasiswa{
//    nama dll ini adalah atribut dari class
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    
//    method construktor (namanya sama kayak classnya)
    public Mahasiswa(String nama, String nim, String jurusan, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
//    method menampilakn data
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIm: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
//    publick static ini artinya hanya bisa dijalankan di kelas itu sendiri
    public static void main(String[] args) {
        // TODO code application logic here
//        untuk membaca input user
        Scanner scanner = new Scanner (System.in);

        // Input informasi mahasiswa dari pengguna
        System.out.println("*** DATA MAHASISWA UTM ***");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Jurusan/Prodi: ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();

        // Membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);

        // Menampilkan informasi mahasiswa yang sudah diinput
        System.out.println("\nInformasi Data Mahasiswa Utm:");
        mahasiswa.tampilkanInfo();

        scanner.close();
    }
}
