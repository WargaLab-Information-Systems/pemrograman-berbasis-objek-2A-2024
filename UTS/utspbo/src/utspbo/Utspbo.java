/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utspbo;
class Mahasiswa{
    String nama;
    String nim;
    String asalsekolah;
    String tanggallahir;
    String prodi;
    String alamat;
    
    public Mahasiswa(String nama, String nim, String asalsekolah, String tanggallahir, String prodi, String alamat){
    nama = nama;
    nim = nim;
    asalsekolah = asalsekolah;
    tanggallahir = tanggallahir;
    prodi = prodi;
    alamat = alamat;
}
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
    public String getasalsekolah(){
        return asalsekolah;
    }
    public String gettanggallahir(){
        return tanggallahir;
    }
    public String getprodi(){
        return prodi;
    }
    public String getalamat(){
        return alamat;
    }
/**
 *
 * @author ASUS
 */
public class Utspbo {

   
    public static void main(String[] args) {
        String nama ="fira";
        String nim = "2";
        String asalsekolah = "utm";
        String tanggallahir = "25 oktober 2004";
        String prodi = "SI";
        String alamat = "bangkalan";
 }
