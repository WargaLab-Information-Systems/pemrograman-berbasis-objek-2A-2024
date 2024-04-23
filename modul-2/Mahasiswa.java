/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa.jurusan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RIZQY
 */

public class Mahasiswa{
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    
 
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
       this.nama = nama;
       this.nim = nim;
       this.jurusan = jurusan;
       this.alamat = alamat;  
    }
     
    
    //setter untuk nama
    public void setNama(String nama){
        this.nama = nama;
    }
    //getter untuk nama
    public String getNama(){
        return nama ;
    }
    
    //setter untuk nim
    public void setNim(String nim){
        this.nim = nim;
    }
    //getter untuk nim
    public String getNim(){
        return nim ;
    }
    
    //setter untuk jurusan
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    //getter untuk jurusan
     public String getJurusan(){
        return jurusan ;
    }
    
    //setter untuk alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    //getter untuk alamat
    public String getAlamat(){
        return alamat ;
    }
   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        String inputLagi;
        do {
            System.out.print("Masukkan NIM: ");
            String nim = input.next();
            input.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = input.nextLine();

            System.out.println("Pilihan Jurusan:");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Kode Jurusan: ");
            String kodeJurusan = input.next();
            String jurusan;

            // Menggunakan switch-case konvensional
            switch (kodeJurusan) {
                case "41":
                    jurusan = "TEKNIK INFORMATIKA";
                    break;
                case "42":
                    jurusan = "TEKNIK INDUSTRI";
                    break;
                case "43":
                    jurusan = "TEKNIK ELEKTRO";
                    break;
                case "44":
                    jurusan = "SISTEM INFORMASI";
                    break;
                case "48":
                    jurusan = "TEKNIK MESIN";
                    break;
                case "49":
                    jurusan = "TEKNIK MEKATRONIKA";
                    break;
                default:
                    jurusan = "jurusan yang anda pilih tidak ada, pilih kode jurusan dengan benar";
            }

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = input.next();
        } while (inputLagi.equalsIgnoreCase("Y"));

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa1 : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa1.getNim());
            System.out.println("Nama: " + mahasiswa1.getNama());
            System.out.println("Alamat: " + mahasiswa1.getAlamat());
            System.out.println("Jurusan: " + mahasiswa1.getJurusan());
        }
    }
}



