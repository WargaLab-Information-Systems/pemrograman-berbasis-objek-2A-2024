/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author User
 */
public class mahasiswa {
    String nama;
    Integer nim;
    String asalsekolah;
    Integer tanggallahir;
    String alamat;
    
    public mahasiswa (String nama, Integer nim, String asalsekolah, Integer tanggallahir, String alamat ){
        this.nama= nama;
        this.nim= nim;
        this.asalsekolah= asalsekolah;
        this.tanggallahir= tanggallahir;
        this.alamat= alamat;
    }
    
    public String getnama(){
        return nama;
    }
    public Integer getnim () {
        return nim;
    }
    public String getasalsekolah(){
        return asalsekolah;
    }
    public Integer gettanggallahir(){
        return tanggallahir;
    }
    public String getalamat(){
        return alamat;
    }
}
