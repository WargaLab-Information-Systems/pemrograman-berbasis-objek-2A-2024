/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author Amira Alissiya
 */

public class Mhs extends Main {
    public class Mahasiswa {
    String nama;
    Integer NIM;
    String AsalSekolah;
    String TanggalLahir;
    String Alamat;
    String Prodi;
}
    
public class Mahasiswa (String nama, Integer NIM, String AsalSekolah, String TanggalLahir, String Prodi, String Alamat){
    this.nama= nama;
    this.NIM= NIM;
    this.AsalSekolah;
    this.Alamat;
}

public String getNama(){
    return nama;
}

public Integer getNIM(){
    return NIM;
}

public String getAsalSekolah(){
    return AsalSekolah;
}

public String getTanggalLahir(){
    return TanggalLahir;
}

public String getAlamat(){
    return Alamat;
}

public String getProdi(){
    return Prodi;
}

public String toString(){
    return "NIM: "+NIM+;
}