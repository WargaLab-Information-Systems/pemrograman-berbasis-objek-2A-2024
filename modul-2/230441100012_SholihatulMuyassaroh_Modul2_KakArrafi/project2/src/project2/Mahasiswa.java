/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author User
 */
public class Mahasiswa extends Universitas {
    public String nim;
    public String nama;
    public String alamat;
    public int jurusan;

    public Mahasiswa(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        switch (jurusan) {
            case 41:
                return "TEKNIK INFORMATIKA";
            case 42:
                return "TEKNIK INDUSTRI";
            case 43:
                return "TEKNIK ELEKTRO";
            case 44:
                return "SISTEM INFORMASI";
            case 48:
                return "TEKNIK MESIN";
            case 49:
                return "TEKNIK MEKATRONIKA";
            default:
                return "Jurusan tidak valid";

        }

    }
}
