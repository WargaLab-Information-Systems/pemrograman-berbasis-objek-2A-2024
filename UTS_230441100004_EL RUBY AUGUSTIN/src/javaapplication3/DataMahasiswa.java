/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author NAOFUMI
 */
import java.util.Scanner;
import java.util.ArrayList;
public class DataMahasiswa {
    String nama;
    String nim;
    String asal_sekolah;
    int tanggal_lahir;
    
public DataMahasiswa(String nama, String nim, String asal_sekolah, int tanggal_lahir){
    System.out.println("Nama mahasiswa : " + nama);
    System.out.println("Nim mahasiswa : " + nim);
    System.out.println("Asal sekolah: " + asal_sekolah);
    System.out.println("Tanggal lahir: " + tanggal_lahir);
    System.out.println("");
}
   
public class mahasiswa{
public static void main (String[]args){
    Mahasiswa.mahasiswa("Teknik Informatika", TIF );
    Mahasiswa.mahasiswa("Teknik Industri", TI );
    Mahasiswa.mahasiswa("Teknik Mesin", TM );
    Mahasiswa.mahasiswa("Teknik Mekatronika", TMK );
    Mahasiswa.mahasiswa("Teknik Elektro", TE );




}
}
}
