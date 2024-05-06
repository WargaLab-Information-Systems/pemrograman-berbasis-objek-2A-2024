/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3no1;
import java.util.Scanner;

class buku {
    String judul, penulis, publisher, kategori;
    String stock, tahunterbit; 
    
    public buku(String judul, String penulis, String publisher, String kategori, String stock, String tahunterbit){
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stock = stock;
        this.tahunterbit = tahunterbit;
    }
    
    public void tampilan(){
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Publisher : "+ publisher);
        System.out.println("Kategori : "+ kategori);
        System.out.println("Stok : " + stock);
        System.out.println("Tahun Terbit : "+ tahunterbit);
        System.out.println("=======================");
    }    
}

class BukuAnak extends buku {  
    public BukuAnak(String judul, String penulis, String publisher, String kategori, String stock, String tahunterbit) {
        super(judul, penulis, publisher, "A", stock, tahunterbit);
    }
    @Override
    public void tampilan(){
        System.out.println("===Data Buku Anak-anak===");
        super.tampilan();
    }
}

class BukuRemaja extends buku {
    public BukuRemaja(String judul, String penulis, String publisher, String kategori, String stock, String tahunTerbit) {
        super(judul, penulis, publisher, "R", stock, tahunTerbit);
    }
    @Override
    public void tampilan(){
        System.out.println("===Data Buku Remaja===");
        super.tampilan();
    }
}

class BukuDewasa extends buku {
    public BukuDewasa(String judul, String penulis, String publisher, String kategori, String stock, String tahunTerbit) {
        super(judul, penulis, publisher, "D", stock, tahunTerbit);
    }
     @Override
    public void tampilan(){
        System.out.println("===Data Buku Dewasa===");
        super.tampilan();
    }
}

class BukuSemuaUmur extends buku {
    public BukuSemuaUmur(String judul, String penulis, String publisher, String kategori, String stock, String tahunTerbit) {
        super(judul, penulis, publisher, "SU", stock, tahunTerbit);
    }
     @Override
    public void tampilan(){
        System.out.println("===Data Buku Semua Umur===");
        super.tampilan();
    }
}

public class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Berapa Data Buku Yang Ingin Dimasukkan : ");
        int jumlahbuku = input.nextInt();
        input.nextLine();
        
        
        buku[] daftarbuku = new buku[jumlahbuku];
        
        for (int i = 0; i < jumlahbuku; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1) + ":");
            System.out.print("Judul Buku: ");
            String judul = input.nextLine();
            System.out.print("Masukkan Nama Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Masukkan Nama Publisher: ");
            String publisher = input.nextLine();
            System.out.print("Kategori : ");
            System.out.println("\nSU = Semua Umur");
            System.out.println("A  = Anak-anak");
            System.out.println("R  = Remaja");
            System.out.println("D  = Dewasa");
            String kategori = input.nextLine().toUpperCase(); 
            System.out.print("Stok: ");
            String stock = input.nextLine();
            System.out.print("Tahun Terbit: ");
            String tahunterbit = input.nextLine();
            
            if (kategori.equals("A")) {
                daftarbuku[i] = new BukuAnak(judul, penulis, publisher, kategori, stock, tahunterbit);
            } 
            else if (kategori.equals("R")) {
                daftarbuku[i] = new BukuRemaja(judul, penulis, publisher, kategori, stock, tahunterbit);
            } 
            else if (kategori.equals("D")) {
                daftarbuku[i] = new BukuDewasa(judul, penulis, publisher, kategori, stock, tahunterbit);
            } 
            else if (kategori.equals("SU")) {
                daftarbuku[i] = new BukuSemuaUmur(judul, penulis, publisher, kategori, stock, tahunterbit);
            } 
            else {
                System.out.println("Kategori yang anda masukkan tidak valid.");
                i--;
            }
        }
        
        System.out.println("\nDaftar Buku : ");    
        for (int i = 0; i < jumlahbuku; i++){
            System.out.println("\n Buku Ke-" + (i + 1) + ":");
            daftarbuku[i].tampilan();
        }
        
        input.close(); 
    }
}
