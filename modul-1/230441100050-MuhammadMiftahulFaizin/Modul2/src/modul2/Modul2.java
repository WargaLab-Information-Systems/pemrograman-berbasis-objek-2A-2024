/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

import java.util.Scanner;


class Mahasiswa {
 
    public String nama;
    public String nim;
    public String jurusan;
    public String alamat;

   
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    
    public void modul2() {
        System.out.println(" Informasi Mahasiswa ");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat
        );
    }
}


public class Modul2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Prodi Anda: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Alamat Anda: ");
        String alamat = input.nextLine();

        
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, nim, jurusan, alamat);

      
        mahasiswa1.modul2();
    }
}


   