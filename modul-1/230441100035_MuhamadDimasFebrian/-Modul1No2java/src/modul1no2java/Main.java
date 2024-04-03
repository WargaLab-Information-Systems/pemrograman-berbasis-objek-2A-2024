/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1no2java;
import java.util.Scanner;
class DATAMHS {
    
    String Nama, Prodi, Alamat;
    String NIM;
    
}


 public class Main {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DATAMHS mhs = new DATAMHS();
        System.out.print("Masukkan Nama Anda.. ");
        mhs.Nama = input.nextLine();
        System.out.print("Masukka NIM Anda.. ");
        mhs.NIM = input.nextLine();
        System.out.print("Masukkan Prodi Anda.. ");
        mhs.Prodi = input.nextLine();
        System.out.print("Masukkan Alamat Anda.. ");
        mhs.Alamat = input.nextLine();



        System.out.println(" ");
        System.out.println("Nama : " +mhs.Nama);  
        System.out.println("NIM : " +mhs.NIM);
        System.out.println("Prodi : " +mhs.Prodi);
        System.out.println("Alamat : " +mhs.Alamat);


        }

    }

