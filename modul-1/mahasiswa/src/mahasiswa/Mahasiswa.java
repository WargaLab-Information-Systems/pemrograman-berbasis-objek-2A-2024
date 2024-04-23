/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
// dapat membaca input dari pengguna melalui file dengan mudah dan efisien.
import java.util.Scanner;
/**
 *
 * @author RIZQY
 */


public class Mahasiswa {
    
    public static void main(String[] args){
//  deklarasi variabel 
    String nama,prodi,alamat,nim;
    
    
   Scanner inputan = new Scanner(System.in);

    System.out.println("Ketik Nama Mahasiswa : ");
    nama = inputan.nextLine();
    
    System.out.println("Ketik Nim Mahasiswa : ");
    nim = inputan.nextLine();
    
    System.out.println("Ketik Prodi Mahasiswa : ");
    prodi = inputan.nextLine();
    
    System.out.println("Ketik Alamat Mahasiswa : ");
    alamat = inputan.nextLine();
    
    System.out.println();
    System.out.println("===========''===========");
    System.out.println("Nama Mahasiswa : " + nama);
    System.out.println("Nim Mahasiswa : " + nim);
    System.out.println("Prodi Mahasiswa : " + prodi);
    System.out.println("Alamat Mahasiswa : " + alamat);

    }

}
