/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;
/**
 *
 * @author sindy
 */
import java.util.Scanner;

public class data2 {
    public static void main(String [] args){
        // objek 
        data2 mahasiswa = new data2 ();
        
        // perulangan
        String mengulang ="Y";
        while (mengulang.equals("Y")){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Masukkan Data Mahasiswa");
            System.out.print("Universitas :");
            data1.universitas = input.nextLine();
            
            System.out.print("NIM :");
            data1.nim = input.nextLine();
            
            System.out.print("Nama :");
            data1.nama = input.nextLine();
            
            System.out.print("Alamat :");
            data1.alamat = input.nextLine();
            
            System.out.println("");
            System.out.println("===============================");
            System.out.println("Daftar Jurusan :");
            System.out.println("41. Teknik Informatika");
            System.out.println("42. Teknik Industri");
            System.out.println("43. Teknik Elektro");
            System.out.println("44. Sistem Informasi");
            System.out.println("48. Teknik Mesin");
            System.out.println("49. Teknik Mekatronika");
            System.out.println("===============================");
            
            System.out.print("Jurusan (isi sesuai kode) :");
            data1.jurusan = input.nextLine();
            
            System.out.println("");
            System.out.println("===============================");
            System.out.println("DATA MAHASISWA :");
            System.out.println("Universitas \t:" + data1.getuniversitas());
            System.out.println("NIM         \t:" + data1.getnim());
            System.out.println("Nama        \t:" + data1.getnama());
            System.out.println("Alamat      \t:" + data1.getalamat());
            
            // switch memeriksa nama variabel 1/lebih memiliki nilai tetap
            // percabangan yang menghasilkan nilai benar
            switch (data1.getjurusan()){
                case "41" -> System.out.println( "Jurusan \t:Teknik Informatika");
                case "42" -> System.out.println( "Jurusan \t:Teknik Industri");
                case "43" -> System.out.println( "Jurusan \t:Teknik Elektro");
                case "44" -> System.out.println( "Jurusan \t:Sistem Informasi");
                case "48" -> System.out.println( "Jurusan \t:Teknik Mesin");
                case "49" -> System.out.println( "Jurusan \t:Teknik Mekatronika");
                default -> System.out.println(  "Jurusan  \t:Tidak ditemukan");
            }
            System.out.println("===============================");
            
            System.out.println("");
            System.out.println("Mengulang lagi? (Y/T)");
            System.out.println("Masukkan Pilihan :");
            // perulangan
            mengulang = input.nextLine();
            
            System.out.println("===============================");
            System.out.println("Terimakasihhh :)");
            System.out.println("===============================");
            
        }
    }
}
