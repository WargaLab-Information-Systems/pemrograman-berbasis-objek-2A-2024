/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodul2;

/**
 *
 * @author Amira Alissiya
 */
public class Mahasiswa extends Univ{
    String nama,nim,alamat,jurusan;
    
    
    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String toString() {
        return "Nim \t:"+nim+"\nNama \t:"+nama+"\nAlamat \t:"+alamat+"\nJurusan \t:"+jurusan;
    }
}

