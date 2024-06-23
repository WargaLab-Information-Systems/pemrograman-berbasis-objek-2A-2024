package com.test;
import java.util.Scanner;

class Universitas {
   private String nama;
   private String nim;
   private String asalSekolah;
   private String tanggalLahir;
   private String prodi;
   private String alamat;
           
   Universitas (String nama, String nim, String asalSekolah, String tanggalLahir, String prodi, String alamat) {
       this.nama = nama;
       this.nim = nim;
       this.asalSekolah = asalSekolah;
       this.tanggalLahir = tanggalLahir;
       this.prodi = getProdi(prodi);
       this.alamat = alamat;
   }
   
   void display() {
       System.out.println("\n\nData diri Mahasiswa :");
       System.out.println("Nama : " + this.nama);
       System.out.println("NIM : " + this.nim);
       System.out.println("Asal Sekolah : " + this.asalSekolah);
       System.out.println("Tanggal Lahir : " + this.tanggalLahir);
       System.out.println("Prodi : " + this.prodi);
       System.out.println("Alamat : " + this.alamat);
   }

    private String getProdi(String prodi) {
        return switch(prodi) {
            case "SI" -> "Sistem Informasi";
            case "TIF" -> "Teknik Informatika";
            case "TI" -> "Teknik Industri";
            case "TM" -> "Teknik Mesi";
            case "TMK" -> "Teknik Mekatronika";
            case "TE" -> "Teknik Elektronika";   
            default -> "Prodi Tidak ditemukan";    
        }; 
    }

}

class Mahasiswa extends Universitas {
    Mahasiswa(String nama, String nim, String asalSekolah, String tanggalLahir, String prodi, String alamat){
        super(nama,nim,asalSekolah,tanggalLahir,prodi,alamat);
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Nama : ");
       String nama = scanner.nextLine();
       System.out.print("NIM : ");
       String nim = scanner.nextLine();
       System.out.print("Asal Sekolah : ");
       String asalSekolah = scanner.nextLine();
       System.out.print("Tanggal Lahir : ");
       String tanggalLahir = scanner.nextLine();
       System.out.print("Prodi : ");
       String prodi = scanner.nextLine();
       System.out.print("Alamat : ");
       String alamat = scanner.nextLine();
       
       Mahasiswa mahasiswa = new Mahasiswa(nama, nim, asalSekolah, tanggalLahir, prodi, alamat);
       mahasiswa.display();
    }
    
}
