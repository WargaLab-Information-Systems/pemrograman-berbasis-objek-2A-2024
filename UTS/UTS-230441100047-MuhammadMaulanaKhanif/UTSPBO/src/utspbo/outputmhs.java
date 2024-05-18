/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author Admin
 */
public class outputmhs extends mhs{
    
    public outputmhs(String nama, String nim, String asal, String ttl, String prodi) {
        super(nama, nim, asal, ttl, prodi);
    }
    
   
    @Override
     public void display(){
        System.out.println("Nama : " + Nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Asal Sekolah : " + Asal);
        System.out.println("TTL : " + Ttl);
        System.out.println("Prodi : " + Prodi);
    }
     
}
