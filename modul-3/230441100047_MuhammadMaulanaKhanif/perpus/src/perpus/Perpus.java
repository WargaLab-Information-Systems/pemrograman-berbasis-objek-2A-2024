/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpus;
import java.util.Scanner;
import static perpus.Perpus.InputJumlah;


class inputan {
    
    static void daftar(){
        System.out.println("|========== DAFTAR KATEGORI ==========|");
        System.out.println("|========| TYPE | KETERANGAN |========|");
        System.out.println("|========|  SU  | SEMUA UMUR |========|");
        System.out.println("|========|   D  | DEWASA     |========|");
        System.out.println("|========|   R  | REMAJA     |========|");
        System.out.println("|========|   A  | ANAK-ANAK  |========|");
        System.out.println("| PILIH BERDASARKAN TYPE DIATAS : ");
        
    }
    
    
    
    static String JudulBuku, Penulis, Publisher, Tahun;
    static String Kategori;
    static void getvalue(int i){
        Scanner input = new Scanner(System.in);
        Storage buku = new Storage();
        
        System.out.println("\n|======== MASUKKAN BUKU KE - "+ (i+1) +"========|");
        System.out.println("| MASUKKAN JUDUL BUKU : ");
        JudulBuku = input.nextLine();
        Storage.JudulBuku(JudulBuku);
        System.out.println("| MASUKKAN PENULIS : ");
        Penulis = input.nextLine();
        Storage.Penulis(Penulis);
        System.out.println("| MASUKKAN PUBLISHER : ");
        Publisher = input.nextLine();
        Storage.Publisher(Publisher);
        inputan.daftar();
        Kategori = input.nextLine();
        buku.SetKategori(Kategori);
        System.out.println("| MASUKKAN TAHUN TERBIT : ");
        Tahun = input.nextLine();
        Storage.Tahun(Tahun);
    }
}


public class Perpus {
    static  int InputJumlah;
    
    public static void main(String[] args) {
        int i;
        Storage buku = new Storage();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Banyaknya Inputan : ");
        InputJumlah = input.nextInt();
        perpustakaan.setJjumlahBuku(InputJumlah);
        
        for(i=0 ; i < perpustakaan.getJumlahBuku(); i++){
            inputan.getvalue(i); 
        }
        
        
        System.out.println("\n\n|============= DATA BUKU =============|");
        for(i=0 ; i < perpustakaan.getJumlahBuku(); i++){
            buku.display(i);
        }
       

    }
    
}
