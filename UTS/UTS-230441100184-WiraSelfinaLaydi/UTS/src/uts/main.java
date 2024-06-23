/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;
public class data(){
    String nama = this.nama;
    String nim = this.nim;
    String asal = this.asal;
    String tgl = this.tgl;
    String alamat = this.alamat;
}
        
/**
 *
 * @author Dell
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        data Datamhs = new data();
        Scanner input = new Scanner();
        
        System.out.println("nama : ");
        nama = input.nextLine();
        System.out.println("nim : ");
        nim = input.nextLine();
        System.out.println("asal sekolah : ");
        asal = input.nextLine();
        System.out.println("tanggal lahir : ");
        tgl = input.nextLine();
        
        
        System.out.println("prodi : ");
        prodi=input.nextLine()
    }
    
}
