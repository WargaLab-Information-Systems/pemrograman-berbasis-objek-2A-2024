/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Amira Alissiya
 */

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        
        ArrayList <Data> data = new ArrayList<>();
        System.out.print("Banyak buku : ");
        a = input.nextInt();
        int b = 0;
        
        while (b < a){
            System.out.print("Masukkan Judul Buku : ");
            String Judul = input.next();
            System.out.print("Masukkan Nama Penulis Buku : ");
            String Penulis = input.next();
            System.out.print("Masukkan Nama Publisher Buku : ");
            String Publisher = input.next();
            System.out.print("Masukkan Kategori Buku "
                    + "[SU]= Semua Umur [R]=Remaja [D]=Dewasa [A]=Anak-anak : ");
            String Kategori = input.next();
            System.out.print("Jumlah Stok Buku : ");
            int Stok = input.nextInt();
            System.out.print("Tahun Terbit Buku : ");
            int Tahun = input.nextInt();
            
            Data inputData = new Data(Judul, Penulis, Publisher, Kategori, Tahun, Stok);
            inputData.setJudul(Judul);
            inputData.setPenulis(Penulis);
            inputData.setPublisher(Publisher);
            inputData.setKat(Kategori);
            inputData.setTahun(Tahun);
            inputData.setStok(Stok);
            data.add(inputData);
            b++;
        }
        
        System.out.println("==============================================");
        System.out.println("Data Buku");
        for(Data inputData:data){
            System.out.println("Judul : "+ inputData.getJudul());
            System.out.println("Penulis : "+ inputData.getPenulis());
            System.out.println("Publisher : "+ inputData.getPublisher());
            System.out.println("Kategori : "+ inputData.getKategori());
            System.out.println("Tahun :" + inputData.getTahun());
            System.out.println("Stok : " + inputData.getStok());
        System.out.println("==============================================");

        }
    }
}
