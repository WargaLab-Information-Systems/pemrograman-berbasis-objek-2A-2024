/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg1;
import java.util.Scanner;

/**
 *
 * @author HP
 */
// (Manusia adalah classnya)
class Manusia {
//  (Atribute)
    String nama, alamat;
    int umur;
    
//(method)
   
    public void berlari(){
        System.out.println("Objek ini bisa berlari");
    }
    
    void berjalan(){
        System.out.println("objek ini bisa berjalan");
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        System.out.print("Nama orang1: ");
        orang1.nama = input.nextLine();

        System.out.print("Alamat: ");
        orang1.alamat = input.nextLine();

        System.out.print("Umur: ");
        orang1.umur = input.nextInt();

        System.out.println("Nama: "      + orang1.nama);
        System.out.println("NIM: "       + orang1.alamat);
        System.out.println("Jurusan: "   + orang1.umur);
       
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("Alamat objek 1 adalah " + orang1.alamat);
        System.out.println("Umur objek 1 adalah " + orang1.umur + " tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");
        System.out.println();
        
        
        orang2.nama = "Angga";
        orang2.alamat = "Surabaya";
        orang2.umur = 19;
        System.out.println("Nama objek 2 adalah " + orang2.nama);
        System.out.println("Alamat objek 1 adalah " + orang2.alamat);
        System.out.println("Umur objek 2 adalah " + orang2.umur + " tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    
    }
}
    

