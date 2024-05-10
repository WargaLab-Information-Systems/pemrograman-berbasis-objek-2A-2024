/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecode.uts.pbo.a;
import java.util.Scanner;

class universitas {
    String nama,nim,sekolah,tgllahir,prodi,alamat;
    
    universitas (String nama, String nim, String sekolah, String tgllahir, String prodi, String alamat) {
        this.nama = nama ;
        this.nim = nim ;
        this.sekolah = sekolah ;
        this.tgllahir = tgllahir ;
        this.prodi = prodi ;
        this.alamat = alamat ;   
    }
    void output() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : "+ this.nim);
        System.out.println("Asal Sekolah : " + this.sekolah);
        System.out.println("Tanggal Lahir : " + this.tgllahir);
        System.out.println("Prodi : " + this.prodi);
        System.out.println("Alamat : " + this.alamat);
    }
    
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukan NIM : ");
        String nim = scanner.nextLine();
        System.out.print("Masukan Asal Sekolah : ");
        String sekolah = scanner.nextLine();
        System.out.print("Masukan Tanggal Lahir : ");
        String tgllahir = scanner.nextLine();
        System.out.print("Masukan Prodi : ");
        String prodi = scanner.nextLine();
        System.out.print("Masukan Alamat : ");
        String alamat = scanner.nextLine();
        
        universitas mhs = new universitas(nama, nim, sekolah, tgllahir, prodi, alamat);
        mhs.output();
    }
}
