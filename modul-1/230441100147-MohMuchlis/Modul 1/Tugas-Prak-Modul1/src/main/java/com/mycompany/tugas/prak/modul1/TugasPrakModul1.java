/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugas.prak.modul1;

/**
 *
 * @author MSI GAMING
 */
import java.util.Scanner;
public class TugasPrakModul1 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String NAMA;
        String NIM;
        String PRODI;
        String ALAMAT;
        
        System.out.print("\nInput Nama = ");
        NAMA=input.nextLine();
        System.out.println("\nInput NIM = ");
        NIM=input.nextLine();
        System.out.println("\nInput Prodi = ");
        PRODI=input.nextLine();
        System.out.println("\nInput Alamat = ");
        ALAMAT=input.nextLine();
        
        System.out.println("");
        System.out.println("Nama saya " + NAMA);
        System.out.println("NIM saya " + NIM);
        System.out.println("Prodi saya " + PRODI);
        System.out.println("Alamat saya " + ALAMAT);
    }
}
