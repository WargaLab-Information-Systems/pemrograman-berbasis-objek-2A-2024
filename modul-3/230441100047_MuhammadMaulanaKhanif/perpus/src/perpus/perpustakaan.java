/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class perpustakaan {
    Scanner input = new Scanner(System.in);
    
    static int JumlahBuku;
    
    static void setJjumlahBuku (int jbuku){
        JumlahBuku = jbuku;
    }
    
    static int getJumlahBuku(){
        return JumlahBuku;
    }
    
    public void display(int i){
        System.out.println("\n|======== IDENTITAS BUKU KE - "+ (i+1) +"========|");

    }
}