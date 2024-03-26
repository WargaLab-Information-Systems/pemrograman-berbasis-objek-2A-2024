/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;

    // Constructor
    public Mahasiswa() {}

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;}
    public void setNIM(String nim) {
        this.nim= nim;}
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;}
    public void setAlamat(String alamat) {
        this.alamat = alamat;}
    public String getNama() {
        return nama;}
    public String getNIM()
        {return nim;}
    public String getJurusan() {
        return jurusan;}
    public String getAlamat() {
        return alamat;}
}
public class pkg {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Mahasiswa mahasiswa = new Mahasiswa();
            System.out.print("Masukkan Nama Mahasiswa: ");
            mahasiswa.setNama(scanner.nextLine());
            System.out.print("Masukkan NIM : ");
            mahasiswa.setNIM(scanner.nextLine());
            System.out.print("Masukkan Jurusan/Prodi Mahasiswa: ");
            mahasiswa.setJurusan(scanner.nextLine());
            System.out.print("Masukkan Alamat: ");
            mahasiswa.setAlamat ( scanner.nextLine());
            
            System.out.println("\nInformasi Mahasiswa:");
            System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
            System.out.println("NIM Mahasiswa: " + mahasiswa.getNIM());
            System.out.println("Jurusan/Prodi Mahasiswa: " + mahasiswa.getJurusan());
            System.out.println("Alamat Mahasiswa: " + mahasiswa.getAlamat());
        }
    }
}
