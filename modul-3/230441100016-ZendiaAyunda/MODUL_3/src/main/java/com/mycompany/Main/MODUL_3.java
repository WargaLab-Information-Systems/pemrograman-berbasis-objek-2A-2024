/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

/**
 *
 * @author sindy
 */

import java.util.Scanner;
import java.util.ArrayList;

// Main Class atau Class Utama
public class MODUL_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        
        ArrayList <Library> data = new ArrayList<>();
        System.out.print("Banyak buku : ");
        a = input.nextInt();
        int b = 0;
        
        input.nextLine();
        
    while (b < a){
            System.out.print("Masukkan Judul Buku : ");
            String Judul = input.nextLine();
            System.out.print("Masukkan Nama Penulis Buku : ");
            String Penulis = input.nextLine();
            System.out.print("Masukkan Nama Publisher Buku : ");
            String Publisher = input.nextLine();
            System.out.print("Masukkan Kategori Buku "
                    + "[SU]= Semua Umur [R]=Remaja [D]=Dewasa [A]=Anak-anak : ");
            String Kategori = input.nextLine();
            System.out.print("Jumlah Stok Buku : ");
   
            int Stok = input.nextInt();
            System.out.print("Tahun Terbit Buku : ");
            int Tahun = input.nextInt();
            System.out.println("==============================================");
    
            input.nextLine();
            
            // untuk mengubah data yang diulang 
            Library inputData = new Library(Judul, Penulis, Publisher, Kategori, Tahun, Stok);
            inputData.setJudul(Judul);
            inputData.setPenulis(Penulis);
            inputData.setPublisher(Publisher);
            inputData.setKat(Kategori);
            inputData.setTahun(Tahun);
            inputData.setStok(Stok);
            data.add(inputData);
            b++;
            }
    
    // untuk menampilkan data yang diurutkan secara terstuktur
    System.out.println("==============================================");
        System.out.println("Data Buku");
        for(Library inputData:data){
            System.out.println("Judul       : "+ inputData.getJudul());
            System.out.println("Penulis     : "+ inputData.getPenulis());
            System.out.println("Publisher   : "+ inputData.getPublisher());
            System.out.println("Kategori    : "+ inputData.getKategori());
            System.out.println("Tahun       : "+ inputData.getTahun());
            System.out.println("Stok        : "+ inputData.getStok());
        System.out.println("==============================================");
        }
    }
}
