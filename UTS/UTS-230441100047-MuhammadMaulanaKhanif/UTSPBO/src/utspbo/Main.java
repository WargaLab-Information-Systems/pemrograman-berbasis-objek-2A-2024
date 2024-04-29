/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utspbo;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Nama : ");
        String ininama = input.nextLine();
        System.out.println("Masukkan NIM : ");
        String ininim = input.nextLine();
        System.out.println("Masukkan Asal Sekolah : ");
        String iniasal= input.nextLine();
        System.out.println("Masukkan Tanggal Lahir: ");
        String inittl = input.nextLine();
        System.out.println("Masukkan Prodi : ");
        String iniprodi = input.nextLine();
        
//        if(iniprodi.equals("SI")){
//            iniprodi = "SISTEM INFORMASI";
//        }
//        else if(iniprodi.equals("TIF")){
//            iniprodi = "TEKNIK INFORMATIKA";
//        }
//        else if(iniprodi.equals("TI")){
//            iniprodi = "TEKNIK INDUSTRI";
//
//        }
//        else if(iniprodi.equals("TM")){
//            iniprodi = "TEKNIK MEKA";}
//            
//        else if(iniprodi.equals("TE")){
//            iniprodi = "TEKNIK ELEKTRO";}
//        
//        else { System.out.println("tidak ada");}}
    
        
        mhs mhs1 = new mhs(ininama, ininim, iniasal, inittl, iniprodi);
        outputmhs mhs2 = new outputmhs(ininama, ininim, iniasal, inittl, iniprodi);
        mhs2.display();
}}

        
        
        

    

