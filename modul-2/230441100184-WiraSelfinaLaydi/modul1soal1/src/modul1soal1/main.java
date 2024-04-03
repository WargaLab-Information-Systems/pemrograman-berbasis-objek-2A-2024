/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1soal1;
/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Universitas: "); 
        String namaUniversitas = input.next();
        kelas2.setNamaUniversitas(namaUniversitas);

        ArrayList<kelas1> daftarMahasiswa = new ArrayList<>();
        // Input data mahasiswa
        char kelas;
        do {
            System.out.println("Masukkan Data Mahasiswa:");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            input.nextLine(); 
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            System.out.println("Pilih Jurusan : ");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI,");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (41-49): ");
            int jurusan = input.nextInt();
            kelas1 mahasiswa = new kelas1(nama, nim, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);
            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y/T)");
            kelas = input.next().charAt(0);
        } while (kelas == 'Y' || kelas == 'y');

        // Menampilkan data mahasiswa
        System.out.println("\nDaftar Mahasiswa di " + kelas2.getNamaUniversitas() + ":");
        for (kelas1 m : daftarMahasiswa) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("Alamat: " + m.getAlamat());
            System.out.println("Jurusan: " + getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }
    private static String getJurusanString(int jurusan) {
        return switch (jurusan) {
            case 41 -> 
                "Teknik Informatika";
            case 42 -> 
                "Teknik Industri";
            case 43 -> 
                "Teknik Elektro";
            case 44 -> 
                "Sistem Informasi";
            case 48 -> 
                "Teknik Mesin";
            case 49 -> 
                "Teknik Mekatronika";
            default ->
                "Jurusan tidak valid";
        };
    }
}