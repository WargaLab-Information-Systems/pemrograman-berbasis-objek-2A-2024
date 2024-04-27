/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_230441100072_sarahmanuellalumbangaol;
import java.util.Scanner;
/**
 *
 * @author USER
 */
class mahasiswa {
    String nama;
    String nim;
    String aslsekolah;
    String tglLahir;
    String Prodi;
    String alamat;
    
    public mahasiswa (String nama,String nim,String aslsekolah,String tglLhir,String prodi,String alamat){
        this.nama =nama;
        this.nim="nim";
        this.aslsekolah="aslsekolah";
        this.tglLahir="tglLahir";
        this.Prodi ="Prodi";
        this.alamat="alamat";   
    }
    
    
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
    public String getaslsekolah(){
        return aslsekolah;
    }
    public String gettglLahir(){
        return tglLahir;
    }
    public String getProdi(){
       return Prodi;
    } 
    public String getalamat(){
        return alamat;
    }
}
public class UTS_230441100072_SarahManuellaLumbanGaol {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Mahasiswa mahasiswa = new Mahasiswa();
            System.out.print("Masukkan Nama Mahasiswa: ");
            System.out.print("Masukkan Nama Mahasiswa: ");
            mahasiswa.setNama(scanner.nextLine());
            System.out.print("Masukkan NIM : ");
            System.out.println("Masukkan asal sekolah :");
            mahasiswa.setaslsekolah(scanner.nextLine());
            System.out.println("Tnggal Lahir");
            mahasiswa.settglLahir(scanner.nextLine());
            mahasiswa.setNIM(scanner.nextLine());
            System.out.print("Masukkan Prodi Mahasiswa: ");
                System.out.println("Jurusan:");
                System.out.println("41. TEKNIK INFORMATIKA");
                System.out.println("42. TEKNIK INDUSTRI");
                System.out.println("43. TEKNIK ELEKTRO");
                System.out.println("44. SISTEM INFORMASI");
                System.out.println("48. TEKNIK MESIN");
                System.out.println("49. TEKNIK MEKATRONIKA");
                System.out.print("Pilih Jurusan (41/42/43/44/48/49): ");
                int jurusanCode = scanner.nextInt();
            mahasiswa.setJurusan(scanner.nextLine());
            System.out.print("Masukkan Alamat: ");
            mahasiswa.setAlamat ( scanner.nextLine());
            
            System.out.println("\nInformasi Mahasiswa:");
            System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
            System.out.println("NIM Mahasiswa: " + mahasiswa.getNIM());
            System.out.println("Asal Mahasiswa: " + mahasiswa.getJurusan());
             System.out.println("tgl lahir Mahasiswa: " + mahasiswa.getJurusan());
            System.out.println("Prodi Mahasiswa: " + mahasiswa.getJurusan());
             System.out.println("Asal Mahasiswa: " + mahasiswa.getJurusan());
            System.out.println("Alamat Mahasiswa: " + mahasiswa.getAlamat());
        }
}
}