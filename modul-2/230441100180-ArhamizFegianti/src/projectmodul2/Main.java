/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmodul2;

/**
 *
 * @author Amira Alissiya
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Mahasiswa> dataMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Universitas \t: ");
        String namaUniversitas = input.nextLine();
        Univ.setNamauniv(namaUniversitas);

        while (true) {
            System.out.print("NIM \t: ");
            String nim = input.nextLine();
            System.out.print("Nama \t: ");
            String nama = input.nextLine();
            System.out.print("Alamat \t: ");
            String alamat = input.nextLine();
            System.out.println("Kode Jurusan \t: ");
            System.out.println("41. Teknik Informatika");
            System.out.println("42. TEKNIK INDUSTRI");
            System.out.println("43. TEKNIK ELEKTRO");
            System.out.println("44. SISTEM INFORMASI");
            System.out.println("48. TEKNIK MESIN");
            System.out.println("49. TEKNIK MKEATRONIKA");
            System.out.print("Pilih Kode Jurusan : ");
            String kodeJurusan = input.nextLine();

            String jurusan;
            jurusan = switch (kodeJurusan) {
                case "41" -> "Teknik Informatika";
                case "42" -> "Teknik Industri";
                case "43" -> "Teknik Elektro";
                case "44" -> "Sistem Informasi";
                case "48" -> "Teknik Mesin";
                case "49" -> "Teknik Mekatronika";
                default -> "Jurusan Tidak Terdaftar";
            };

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            dataMahasiswa.add(mahasiswa);

            System.out.print("Ingin memasukkan data lagi? (Y/T) : ");
            String jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("T")) {
                break;
            }
        }
           
        System.out.println("==============================================");
        System.out.println("===Daftar Mahasiswa " + Univ.getNamauniv()+"===");
        for (Mahasiswa mahasiswa : dataMahasiswa) {
            System.out.println(mahasiswa.toString());
        System.out.println("==============================================");
        }
    }
}

