/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = data.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);

        char input;
        do {
            System.out.println("Masukkan data mahasiswa");
            System.out.print("NIM: ");
            String nim = data.next();
            data.nextLine(); // Membuang newline
            System.out.print("Nama: ");
            String nama = data.nextLine();
            System.out.print("Alamat: ");
            String alamat = data.nextLine();
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (41-46): ");
            int jurusan = data.nextInt();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            input = data.next().charAt(0);
        } while (input == 'Y' || input == 'y');

        System.out.println("\nDaftar Mahasiswa di " + Universitas.getNamaUniversitas() + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }

        data.close();
    }
}