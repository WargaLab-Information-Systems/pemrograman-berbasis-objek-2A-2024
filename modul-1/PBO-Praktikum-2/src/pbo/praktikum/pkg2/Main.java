/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg2;
import java.util.Scanner;

/**
 *
 * @author HP
 */
class mahasiswa {
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System.in);
       
    System.out.println("## Masukkan Bio Data Mahasiswa ##");
    System.out.println("=================================");
     
    String nama, nim, jurusan,  alamat;
  
    System.out.print("Nama mahasiswa: ");
    nama = input.nextLine();
     
    System.out.print("NIM: ");
    nim = input.nextLine();
     
     
    System.out.print("Jurusan: ");
    jurusan = input.nextLine();
     
     
    System.out.print("Alamat: ");
    alamat = input.nextLine();
     
    System.out.println();
     
    System.out.println("# Data Mahasiswa #");
    System.out.println("==================");
    System.out.println("Nama: "      + nama);
    System.out.println("NIM: "       + nim);
    System.out.println("Jurusan: "   + jurusan);
    System.out.println("Alamat: "    + alamat);

    }
    
}
