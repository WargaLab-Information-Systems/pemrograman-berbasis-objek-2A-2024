/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1.no2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

class Mahasiswa {
    String nama, nim, prodi, alamat;
    
  public void tampilkan() {
        System.out.println("Nama  : "  +  nama);
        System.out.println("Nim : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======Input data mahasiswa=======");
        Mahasiswa data = new Mahasiswa();
        
        System.out.print("Nama: ");
        data.nama = input.nextLine();
        
        System.out.print("NIM: ");
        data.nim = input.nextLine();
        
        System.out.print("Prodi: ");
        data.prodi = input.nextLine();
        
        System.out.print("Alamat: ");
        data.alamat = input.nextLine();


        System.out.println("\n=========Data Mahasiswa=========");
        data.tampilkan();

    }
}