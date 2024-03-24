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

class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String Alamat;

    public Mahasiswa(String nama, String nim, String prodi, String Alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.Alamat = Alamat;
    }
    
    public void Informasi(){
       System.out.println("Nama: " + nama);
       System.out.println("nim: " + nim);
       System.out.println("prodi: " + prodi);
       System.out.println("Alamat: " + Alamat);
    }   
    
}

public class MODUL1_NO2 {
    public static void main(String[] args){
        
    Scanner Keyboard = new Scanner(System.in);
    
    System.out.println("------------------------------");
    System.out.println("Masukkan Nama Mahasiswa: ");
    String nama = Keyboard.nextLine();
    System.out.println("------------------------------");
    System.out.println("Masukkan Nim Mahasiswa: ");
    String nim = Keyboard.nextLine();
    System.out.println("------------------------------");
    System.out.println("Masukkan Prodi Mahasiswa: ");
    String prodi = Keyboard.nextLine();
    System.out.println("------------------------------");
    System.out.println("Masukkan Alamat Mahasiswa: ");
    String Alamat = Keyboard.nextLine();
    System.out.println("------------------------------");
    
    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi, Alamat);
    
    System.out.println("------------------------------");
    System.out.println("HASIL DATA MAHASISWA : ");
    mahasiswa.Informasi();
    System.out.println("------------------------------");
    
    Keyboard.close();
    
    }
}
