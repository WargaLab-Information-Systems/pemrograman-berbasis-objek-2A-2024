/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;
import java.util.ArrayList;

public class Storage extends perpustakaan {

    static ArrayList StorageJudul = new ArrayList();
    static ArrayList StoragePenulis = new ArrayList();
    static ArrayList StoragePublisher = new ArrayList();
    static ArrayList StorageKategori = new ArrayList();
    static ArrayList StorageTahun = new ArrayList();
    
    static void JudulBuku(String inijudul){
        StorageJudul.add(inijudul);
    }
    
    static void Penulis(String inipenulis){
        StoragePenulis.add(inipenulis);
    }
    
    static void Publisher(String inipublisher){
        StoragePublisher.add(inipublisher);
    }
    
    static void Tahun(String initahun){
        StorageTahun.add(initahun);
    }
    
    @Override
    public void display(int i){
        super.display(i);
        System.out.println("| Judul Buku    : " + StorageJudul.get(i));
        System.out.println("| Penulis Buku  : " + StoragePenulis.get(i));
        System.out.println("| Publisher Buku: " + StoragePublisher.get(i));
        System.out.println("| Kategori Buku : " +  StorageKategori.get(i));
        System.out.println("| Tahun Buku    : " +  StorageTahun.get(i));
        System.out.println("|=====================================|\n");
        
    }
    
    public void SetKategori(String inikategori){
        if (inikategori.equals("SU"))
        StorageKategori.add("Semua Umur");
        
        else if (inikategori.equals("D"))
        StorageKategori.add("Dewasa");
        
        else if (inikategori.equals("R"))
        StorageKategori.add("Remaja");
        
        else if (inikategori.equals("A"))
        StorageKategori.add("Anak anak");
        
        else {
            StorageKategori.add("Tidak Terdefinisi");
        }
        
    }
    
}
