/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nurlailiailhami.tgs2;
import java.util.Scanner;
public class NurlailiailhamiTgs2 {

   
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String NAMA;
        String JURUSAN;
        String ALAMAT;
        long NIM;
        
        System.out.print("INPUT NAMA = ");
        NAMA=input.nextLine();
        System.out.print("INPUT JURUSAN = ");
        JURUSAN=input.nextLine();
        System.out.print("INPUT ALAMAT = ");
        ALAMAT=input.nextLine();
        System.out.print("INPUT NIM = ");
        NIM=input.nextLong();
        
        System.out.println("------------------------------");
        System.out.println("NAMA SAYA = " + NAMA);
        System.out.println("NIM SAYA = " + NIM);
        System.out.println("JURUSAN SAYA = " + JURUSAN);
        System.out.println("ALAMAT SAYA = " + ALAMAT);
        
        
    }
    
}
