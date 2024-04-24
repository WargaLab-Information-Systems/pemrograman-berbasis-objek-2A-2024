/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author sindy
 */

public class data1 {
    // static method yang dapat langsung diakses tanpa membuat objek
    static String universitas, nim, nama, alamat, jurusan;
    
    // method constructor
    public data1 (String universitas, String nim, String nama, String alamat, String jurusan){
        this.universitas = universitas;
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }
    
    // method getter memiliki nilai kembalian sesuai tipe data yang di ambil.
    public static String getuniversitas() {
        return universitas;
    }
    public static String getnim() {
        return nim;
    }
    public static String getnama() {
        return nama;
    }
    public static String getalamat() {
        return alamat;
    }
    public static String getjurusan() {
        return jurusan;
    }
    
    // method setter untuk mengisi data kedalam atribut
    public static void setuniversitas(String universitas) {
        data1.universitas = universitas;
    }
    public static void setnim(String nim) {
        data1.nim = nim;
    }
        public static void setnama(String nama) {
        data1.nama = nama;
    }
        public static void setalamat(String alamat) {
        data1.alamat = alamat;
    }
        public static void setjurusan(String jurusan) {
        data1.jurusan = jurusan;
    }
}

