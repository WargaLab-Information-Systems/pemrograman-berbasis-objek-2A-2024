/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utama;

/**
 *
 * @author ZENDIA AMELIA
 */
import java.util.Scanner;
public class Utama {
    String  nama, nim, sekolah, TanggalLahir, Prodi;
    public Utama (String nama, String nim, String sekolah, String TanggalLahir, String Prodi){
     this.nama = nama;
     this.nim = nim;
     this.sekolah = sekolah;
     this.TanggalLahir = TanggalLahir;
     this.Prodi = Prodi;
    
     
    }
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
        System.out.println("masukkan nama");
        String nama = input.nextLine();
        
        System.out.println(" masukkan nim");
        String nim = input.nextLine();
        
        System.out.println(" nama sekolah");
        String sekolah = input.nextLine();
        
        System.out.println("TanggalLahir");
        String TanggalLahir = input.nextLine();
        
        System.out.println(" masukkan Prodi");
        String Prodi = input.nextLine();
           
  
    
        
    } 
    
            
}
