/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author shahaflanjaya
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("Input Data Mahasiswa");
        System.out.print("Nama : ");
        String nama = a.nextLine();
        System.out.println("NIM :");
        String nim = a.nextLine();
        System.out.println("Prodi :");
        String prodi = a.nextLine();
        System.out.print("Alamat : ");
        String alamat = a.nextLine ();
        
        System.out.println("========");
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat );
// TODO code application logic here
    }
    
}
