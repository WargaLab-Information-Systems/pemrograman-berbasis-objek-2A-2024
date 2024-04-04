/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;

/**
 *
 * @author Erlangga Satrya H
 */
public class JavaApplication11 {
    String nama;
    String alamat;
    String prodi;
    String nim;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JavaApplication11 nm= new JavaApplication11();
        JavaApplication11 n1m= new JavaApplication11();
        JavaApplication11 alt= new JavaApplication11();
        JavaApplication11 prd = new JavaApplication11();
        
        System.out.println("=====================================");
        System.out.println("==========  DATA MAHASISWA  =========");
        System.out.println("=====================================");
        
        System.out.print("Masukkan nama: ");
        nm.nama=input.nextLine();
        
        System.out.print("Masukkan Nim: ");
        n1m.nim=input.nextLine();
        
        
        System.out.print("Masukkan Alamat: ");
        alt.alamat=input.nextLine();
        
        
        System.out.print("Masukkan prodi: ");
        prd.prodi = input.nextLine();
        
        System.out.println("");
        
        System.out.println("=====================================");
        
      
        
        System.out.println("nama = " + nm.nama);
        System.out.println("nim = " + n1m.nim);
        System.out.println("alamat = " + alt.alamat);
        System.out.println("prodi = " + prd.prodi);
        
    }
    
}
