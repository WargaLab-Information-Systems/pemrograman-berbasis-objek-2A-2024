/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;

class mahasiswa {
    String nama,nim,asalsekolah,tanggallahir;
    
    void mahasiswa (String nama, String nim, String asalsekolah, String tanggallahir) {
        this.nama = nama;
        this.nim = nim;
        this.asalsekolah = asalsekolah;
        this.tanggallahir = tanggallahir;
        System.out.println("nama : " + nama );
        System.out.println("nim : " + nim);
        System.out.println("asal sekolah : " + asalsekolah);
        System.out.println("tanggal lahir : " + tanggallahir);
}
}
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,nim,asalsekolah,tanggallahir;
        System.out.println("masukkan nama : ");
        input.nextLine();
        System.out.println("masukkan nim : ");
        input.nextLine();
        System.out.println("masukkan asal sekolah : ");
        input.nextLine();
        System.out.println("masukkan tanggal lahir : ");
        input.nextLine();
        
        
    }
    
}
