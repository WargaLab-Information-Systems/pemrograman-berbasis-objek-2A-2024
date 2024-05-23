/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;

/**
 *
 * @author ACER
 */

    class Mahasiswa {

    String namaa;
    String nimm;
    String jurusann;
    String alamatt;
    
    void Biodata() {
        System.out.println("Nama: " + namaa);
        System.out.println("NIM: " + nimm);
        System.out.println("Jurusan/Prodi: " + jurusann);
        System.out.println("Alamat: " + alamatt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Masukkan Nama Mahasiswa:");
        mahasiswa.namaa=scanner.nextLine();

        System.out.println("Masukkan NIM Mahasiswa:");
        mahasiswa.nimm=scanner.nextLine();

        System.out.println("Masukkan Jurusan/Prodi Mahasiswa:");
        mahasiswa.jurusann=scanner.nextLine();

        System.out.println("Masukkan Alamat Mahasiswa:");
        mahasiswa.alamatt=scanner.nextLine();

        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa.Biodata();

        scanner.close();
    }
}

