/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ZENDIA AMELIA
 */
import java.util.Scanner;
public class project2_230441100015_zendiaamelia2 {
    public static void main(String [] args){
        // Membuat objek data1
        Project2_230441100015_zendiaamelia1 data_satu = new Project2_230441100015_zendiaamelia1();
        
        String Mengulang = "Y";
        while (Mengulang.equals("Y")) {
            Scanner input = new Scanner(System.in); 

            System.out.println("=============================");
            System.out.println(" Masukkan Data Mahasiswa ");
            System.out.print("Universitas : "); 
            Project2_230441100015_zendiaamelia1.universitas = input.nextLine();
            System.out.print("NIM : "); 
            Project2_230441100015_zendiaamelia1.nim = input.nextLine();
            System.out.print("Nama : "); 
            Project2_230441100015_zendiaamelia1.nama = input.nextLine();
            System.out.print("Alamat : "); 
            Project2_230441100015_zendiaamelia1.alamat = input.nextLine();

            System.out.println("=====DAFTAR JURUSAN=====");
            System.out.println("41. TEKNIK INFORMATIKA");
            System.out.println("42. TEKNIK INDUSTRI");
            System.out.println("43. TEKNIK ELEKTRO");
            System.out.println("44. SISTEM INFORMASI");
            System.out.println("48. TEKNIK MESIN");
            System.out.println("49. TEKNIK MEKATRONIKA");
            System.out.print("Isi sesuai kode jurusan : ");
            
            Project2_230441100015_zendiaamelia1.setJurusan(input.nextLine());
            data_satu.test();

            
            System.out.println(" ");  
            System.out.println("==========Data Mahasiswa==========");
            System.out.println("Universitas : "+ Project2_230441100015_zendiaamelia1.getUniversitas());
            System.out.println("NIM : "+ Project2_230441100015_zendiaamelia1.getNim());
            System.out.println("Nama : "+ Project2_230441100015_zendiaamelia1.getNama());
            System.out.println("Alamat : "+ Project2_230441100015_zendiaamelia1.getAlamat());
            
            switch(Project2_230441100015_zendiaamelia1.getJurusan()){
            case "41" -> System.out.println("Jurusan :TEKNIK INFORMATIKA");
            case "42" -> System.out.println("Jurusan :TEKNIK INDUSTRI");
            case "43" -> System.out.println("Jurusan :TEKNIK ELEKTRO");
            case "44" -> System.out.println("Jurusan :SISTEM INFORMASI");
            case "48" -> System.out.println("Jurusan :TEKNIK MESIN");
            case "49" -> System.out.println("Jurusan :TEKNIK MEKATRONIKA");
            default -> System.out.println("Jurusan : Tidak ada");
            }
   
            System.out.println("======================================");
            
            System.out.println(" ");
            System.out.println("Mengulang lagi? (Y untuk Ya dan T untuk Tidak)");
            System.out.print("Masukkan pilihan : ");
            Mengulang = input.nextLine();
            
            System.out.println("===========================");
            System.out.println("Terimakasih ");
            System.out.println("===========================");
        }
    }
}
