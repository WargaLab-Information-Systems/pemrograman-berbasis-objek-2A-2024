/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author sindy
 */
import java.util.Scanner;
public class Uts {
    String nama, nim, sekolah, tanggallahir, prodi;
    
    public Uts(String nama, String nim, String sekolah, String tanggallahir, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.sekolah = sekolah;
        this.tanggallahir = tanggallahir;
        this.prodi = prodi;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Masukkan Nama:");
        String nama = input.nextLine();
        
        System.out.println(" Masukkan NIM:");
        String nim = input.nextLine();
        
        System.out.println(" Masukkan Asal Sekolah:");
        String sekolah = input.nextLine();
        
        System.out.println(" Masukkan Tanggal Lahir:");
        String tanggallahir = input.nextLine();
        
        System.out.println(" Masukkan Prodi:");
        System.out.println(" SI = Sistem Informasi");
        System.out.println(" TI = Teknik Informatika");
        System.out.println(" TM = Teknik Mesin");
        System.out.println(" TMK = Teknik Mekatronika");
        System.out.println(" TE = Teknik Eelektronika");
        String prodi = input.nextLine();
        
        // switch (Uts.prodi()) {
            // case "SI" -> System.out.println(" SI = Sistem Informasi");
            // case "TI" -> System.out.println(" TI = Teknik Informatika");
            // case "TM" -> System.out.println(" TM = Teknik Mesin");
            // case "TMK" -> System.out.println(" TMK = Teknik Mekatronika");
            // case "TE" -> System.out.println(" TE = Teknik Eelektronika");

        }  
    }

