/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

class mahasiswa{
    String nama;
    String nim;
    String asalSekolah;
    String tanggalLahir;
    String prodi;
    String alamat;
    
    public mahasiswa(String nama, String nim, String asalSekolah, String tanggalLahir, String prodi, String alamat){
        nama = nama;
        nim = nim;
        asalSekolah = asalSekolah;
        tanggalLahir = tanggalLahir;
        prodi = prodi;
        alamat = alamat;           
    }
    public String getnama(){
        return nama;
        
    }
    public String getnim(){
        return nim;
        
    }
    public String getasalSekolah(){
        return asalSekolah;
        
    }
    public String tanggalLahir(){
        return tanggalLahir;
        
    }
    public String getprodi(){
        return prodi;
        
    }
    public String getalamat(){
        return alamat;
        
    }
}
public class main  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }
}