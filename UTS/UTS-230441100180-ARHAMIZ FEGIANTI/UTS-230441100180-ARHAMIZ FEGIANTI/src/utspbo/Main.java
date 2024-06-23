/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utspbo;

/**
 *
 * @author Amira Alissiya
 */

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    
    public static void main(String [] args) {
    ArrayList <Mhs> dataMhs = new ArrayList<>{};
    scanner input = new scanner;
    
    while (True){
        System.out.println("Nama: ");
        String nama = input.NextLine();
        System.out.println("NIM: ");
        Integer NIM = input.NextInt();
        System.out.println("Asal Sekolah: ");
        String AsalSekolah = input.NextLine();
        System.out.println("Tanggal Lahir: ");
        String TanggalLahir = input.NextLine();
        System.out.println("Prodi: ");
        String PilihProdi = input.NextLine();
        
        String Prodi;
        PilihProdi = switch (Prodi){
            case "SI" -> "Sistem Informasi";
            case "TIF" -> "Teknik Informatika";
            case "TI" -> "Teknik Industri";
            case "TM" -> "Teknik Mesin";
            case "TMK" -> "Teknik Mekatro";
            case "TE" -> "Teknik Elektro";
        };
    }
    }
    
}
