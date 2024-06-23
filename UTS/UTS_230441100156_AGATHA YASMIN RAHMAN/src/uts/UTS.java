/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;

/**
 *
 * @author ACER
 */

    class Mahasiswa {

    String namaa;
    String nimm;
    String asalsekolahh;
    String tanggallahir;
    String prodi;
    
    void Biodata() {
        System.out.println("Nama: " + namaa);
        System.out.println("NIM: " + nimm);
        System.out.println("Asal Sekolah: " + asalsekolahh);
        System.out.println("Tanggal Lahir: " + tanggallahir);
        System.out.println("Prodi: " + prodi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Masukkan Nama :");
        mahasiswa.namaa=scanner.nextLine();

        System.out.println("Masukkan NIM :");
        mahasiswa.nimm=scanner.nextLine();

        System.out.println("Masukkan Asal Sekolah :");
        mahasiswa.asalsekolahh=scanner.nextLine();

        System.out.println("Masukkan Tanggal Lahir :");
        mahasiswa.tanggallahir=scanner.nextLine();
        
        System.out.println("Masukkan prodi :");
        mahasiswa.prodi=scanner.nextLine();

       

        
    }
}
