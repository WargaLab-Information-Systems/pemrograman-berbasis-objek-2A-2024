/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.utspbo1;

public class utspbo1 {
    static String nama, nim, asalsekolah, tanggallahir, prodi;
    

    public static String getnama() {
        return nama;
    }
    public static String getnim(){
        return nim;
    }
    public static String getasalsekolah(){
        return asalsekolah;
    }
    public static String gettanggallahir(){
        return tanggallahir;
    }
    public static String getprodi(){
        return prodi;
    }
    public static void setuniversitas(String nama){
        utspbo1.nama = nama;
    }
    public static void setnim(String nim){
        utspbo1.nim = nim;
    } 
     public static void setnama(String asalsekolah){
        utspbo1.asalsekolah = asalsekolah;
    }
    public static void Setalamat(String tanggallahir){
        utspbo1.tanggallahir = tanggallahir;
    }
    public static void Setjurusan(String prodi){
        utspbo1.prodi = prodi;
    }
 
}