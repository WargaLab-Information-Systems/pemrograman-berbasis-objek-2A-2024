package soal1modul3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author USER
 */
class Buku {
    String judul;
    String penulis;
    String publisher;
    String kategori;
    int stok;
    int thnTerbit;
     
    public Buku(String judul,String penulis,String publisher,String kategori,int stok,int thnTerbit){
        this.judul= judul ;
        this.penulis= penulis;
        this.publisher= publisher ;
        this.kategori = kategori;
        this.stok = stok ;
        this.thnTerbit = thnTerbit;
    }
    
    public String getJudul(){
        return judul;
    }
    public String getPenulis () {
        return penulis;
    }
    public String getPublisher (){
        return publisher;
    }
    
    public String getKategori (){
        if (kategori=="SU")
            return "Semua Umur";
        else if (kategori=="D")
            return "Dewas";
        else if (kategori=="R")
            return "Remaja";
        else if (kategori=="A")
            return "Anak Anak";
        else 
            return "Semua Umur";
            
    }
    public int getStok(){
        return stok ;
    }
    public int getThnTerbit(){
        return thnTerbit;
    }
    
    @Override
    public String toString(){
        return  "\nJudul        : " +judul +
                "\nPenulis      : "+penulis +
                "\nPublisher    : "+publisher +
                "\nKategori     : "+getKategori() +
                "\nStok         : "+stok +
                "\nTahun Terbit : "+thnTerbit+"\n";
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList <TypeBook> daftarBuku = new ArrayList<>();
        
        System.out.print("Masukkan jumlah buku yang ingin diinput : ");
        int jumlahBuku = input.nextInt();
        input.nextLine();
        
        for(int i= 0; i < jumlahBuku; i++) {
            System.out.println("Data Buku ke-"+(i+1));
            System.out.print("*Judul \t\t\t: ");
            String judul = input.nextLine();
            System.out.print("*Penulis \t\t: ");
            String penulis = input.nextLine();
            System.out.print("*Publisher \t\t: ");
            String publisher = input.nextLine();
            System.out.println("NOTE:");
            System.out.println("SU: Semua Umur");
            System.out.println("D : Dewasa");
            System.out.println("R : Remaja");
            System.out.println("A : Anak-anak");
            System.out.print("*Kategori (SU/D/R/A)\t: ");
            String kategori = input.nextLine();
            System.out.print("*Stock \t\t\t: ");
            int stok = input.nextInt();
            System.out.print("*Tahun Terbit \t\t: ");
            int thnTerbit = input.nextInt();
            input.nextLine();
        
        TypeBook buku= new TypeBook(judul,penulis,publisher,kategori,stok,thnTerbit);
        daftarBuku.add(buku);
    }
        
       
        System.out.println(" ");
    System.out.println ("\n---------Daftar Buku--------- ");
    for(int i = 0; i<daftarBuku.size();i++){
        System.out.println( );
            System.out.println("Buku ke-" + (i+1) + "->");
            System.out.println(daftarBuku.get(i));
    }
  }
}
    

