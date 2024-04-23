/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul2;
import java.util.Scanner;
/**
 *
 * @author ZC
 */
public class Praktikum {
       
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SILAHKAN MASUKKAN DATA MAHASISWA");
        System.out.print("Nama Universitas : ");
        String NamaUniversitas = input.nextLine();
        String MasukkanData = "Y";
        
        DataMahasiswa [] Mahasiswa = new DataMahasiswa[1000]; 
        int jumlahMahasiswa = 0;
        
        DataMahasiswa.SetNamaUniversitas(NamaUniversitas);
        
        while (MasukkanData.equals("Y")){
            System.out.print("Nim : ");
            String Nim = input.nextLine();
            System.out.print("Nama : ");
            String Nama = input.nextLine();
            System.out.print("Alamat : ");
            String Alamat = input.nextLine();
            System.out.println("Pilihan Kode Jurusan 41,42,43,44,48,49");
            System.out.print("Kode Jurusan: ");
            int KodeJurusan = input.nextInt();
            input.nextLine();
            System.out.print("Apakah anda ingin memasukkan data lagi? (Y) Ya (T) Tidak ");
            MasukkanData = input.nextLine();
            DataMahasiswa Data1 = new
            DataMahasiswa(Nim,Nama,Alamat,KodeJurusan);
            Mahasiswa[jumlahMahasiswa] = Data1;
            jumlahMahasiswa+=1;//supaya menambah panjang array
         } 
        System.out.println("\n");
        System.out.println("DATA MAHASISWA YANG SUDAH DIMASUKKAN");
        System.out.println("Nama Universitas : "+DataMahasiswa.GetNamaUniversitas());
    for (int a = 0; a < jumlahMahasiswa; a++){
            System.out.println("Nim : "+Mahasiswa[a].Nim);
            System.out.println("Nama : "+Mahasiswa[a].Nama);
            System.out.println("Alamat : "+Mahasiswa[a].Alamat);
            System.out.println("Kode Jurusan : "+NamaJurusan(Mahasiswa[a].KodeJurusan)); 
        }  
    }
public static String NamaJurusan(int kodeJurusan) {
    if (kodeJurusan == 41) {
        return "TEKNIK INFORMATIKA";
    } else if (kodeJurusan == 42) {
        return "TEKNIK INDUSTRI";
    } else if (kodeJurusan == 43) {
        return "TEKNIK ELEKTRO";
    } else if (kodeJurusan == 44) {
        return "SISTEM INFORMASI";
    } else if (kodeJurusan == 48) {
        return "TEKNIK MESIN";
    } else if (kodeJurusan == 49) {
        return "TEKNIK MEKATRONIKA";
    } else {
        return "Nama Jurusan tidak ditemukan";
    }
}
}