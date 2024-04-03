/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.util.Scanner;


class Mahasiswa{
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    
    public Mahasiswa (String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    public String getAlamat() {
        return alamat;
    }
}
public class pbosoal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan nim mahasiswa: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan jurusan: ");
        String jurusan = scanner.nextLine();
        
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);
        
        System.out.println("\nData Mahasiswa");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
        
        scanner.close();
    }
}
