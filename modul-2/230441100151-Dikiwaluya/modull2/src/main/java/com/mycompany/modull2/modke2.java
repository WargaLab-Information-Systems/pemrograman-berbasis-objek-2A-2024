package com.mycompany.modull2;
import java.util.Scanner;

public class modke2 {
//    data2(){
//        System.out.println("23 tutup botol");
//        System.out.println("habis ini saya mau belajar");
//    }
// 
//   
  public static void main(String [] args){
    String Mengulang = "y";
    while (Mengulang.equals("y")) { 
    Scanner input = new Scanner (System.in); 
    
    
    System.out.println("= Masukkan Data Mahasiswa =");
    System.out.println("=============================");

    System.out.print("Universitas : "); 
    mod2.universitas = input.nextLine();
    System.out.print("NIM : "); 
    mod2.nim = input.nextLine();
    System.out.print("Nama : "); 
    mod2.nama = input.nextLine();
    System.out.print("Alamat : "); 
    mod2.alamat = input.nextLine();

    System.out.println("=====DAFTAR JURUSAN=====");
    System.out.println("41. TEKNIK INFORMATIKA");
    System.out.println("42. TEKNIK INDUSTRI");
    System.out.println("43. TEKNIK ELEKTRO");
    System.out.println("44. SISTEM INFORMASI");
    System.out.println("48. TEKNIK MESIN");
    System.out.println("49. TEKNIK MEKATRONIKA");
    System.out.print("Isi sesuai kode jurusan : ");
    mod2.jurusan = input.nextLine();
    System.out.println(" ");  
    System.out.println("==========Data Mahasiswa==========");
    System.out.println("Universitas : "+mod2.getuniversitas());
    System.out.println("NIM : "+mod2.getnim());
    System.out.println("Nama : "+mod2.getnama());
    System.out.println("Alamat : "+mod2.getalamat());
    switch(mod2.getjurusan()){
        case"41" -> System.out.println("Jurusan :TEKNIK INFORMATIKA");
        case"42" -> System.out.println("Jurusan :TEKNIK INDUSTRI");
        case"43" -> System.out.println("Jurusan :TEKNIK ELEKTRO");
        case"44" -> System.out.println("Jurusan :SISTEM INFORMASI");
        case"48" -> System.out.println("Jurusan :TEKNIK MESIN");
        case"49" -> System.out.println("Jurusan :TEKNIK MEKATRONIKA");
        default -> {
    System.out.println("Jurusan : Tidak ada");
    System.out.println(" ");
    System.out.println("======================================");
      }
    }

    System.out.println("Mengulang lagi? (y untuk Ya dan T untuk Tidak)");
    System.out.print("Masukkan pilihan : ");
    Mengulang = input.nextLine();
//      stop = input.nextLine();
      }

    System.out.println("===========================");
    System.out.println(" Terimakasih ");
    System.out.println("===========================");
 
}
}