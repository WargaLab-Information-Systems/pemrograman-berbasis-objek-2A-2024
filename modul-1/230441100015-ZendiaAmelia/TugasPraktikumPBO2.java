/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ZENDIA AMELIA
 */
// membuat input an dengan menggunakan scanner
import java.util.Scanner;
//menggunakan sistem OOP adalah program yang menggunakan konsep objek kode yang saling berhubungan

class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String Alamat;

    // method counstruktor adalah method yang sama dengan nama class nya
    public Mahasiswa(String nama, String nim, String prodi, String Alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.Alamat = Alamat;
    }

   //void adalah tipe data untuk mendeklarasikan bahwa sebuah metod tidak mengembalikan nilai apapun
   //public adalah metode yang dapat di akses di luar kelas
    public void Menampilkan_Data(){
       System.out.println("Masukkan Nama Mahasiswa: " + nama);
       System.out.println("Masukkan Nim Mahasiswa: " + nim);
       System.out.println("Masukkan Prodi Mahasiswa: " + prodi);
       System.out.println("Masukkan Alamat Mahasiswa: " + Alamat);
    }   
     
}

public class TugasPraktikumPBO2 {
public static void main(String[] args){
// public static void adalah yang hanya bisa di jalankan di dalam class nya
    Scanner Monitor = new Scanner(System.in);
   
    System.out.println("Masukkan Nama Mahasiswa: ");
    String nama = Monitor.nextLine();
    
    System.out.println("Masukkan Nim Mahasiswa: ");
    String nim = Monitor.nextLine();
    
    System.out.println("Masukkan Prodi Mahasiswa: ");
    String prodi = Monitor.nextLine();
    
    System.out.println("Masukkan Alamat Mahasiswa: ");
    String Alamat = Monitor.nextLine();
    
    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi, Alamat);

    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("Nim Mahasiswa: " + nim);
    System.out.println("Prodi Mahasiswa: " + prodi);
    System.out.println("Alamat Mahasiswa: " + Alamat);
    
    Monitor.close();

    }
}
