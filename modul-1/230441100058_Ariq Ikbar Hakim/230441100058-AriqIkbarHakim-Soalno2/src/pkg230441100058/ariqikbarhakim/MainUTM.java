package pkg230441100058.ariqikbarhakim;

import java.util.Scanner;

class UTM {
    String nama;
    String nim;
    String prodi;
    String alamat;
    
    public void tampilkanData(){
       System.out.println("Nama  :"+ nama);
       System.out.println("NIM :"+ nim);
       System.out.println("Penerbit :"+ prodi);
       System.out.println("Alamat :"+ alamat);
    }
}

public class MainUTM{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UTM utm = new UTM();
        
        System.out.print("Masukkan Nama :");
        utm.nama = input.nextLine();
        
        System.out.print("Masukkan NIM :");
        utm.nim = input.nextLine();
        
        System.out.print("Masukkan Nama prodi :");
        utm.prodi = input.nextLine();
        
        System.out.print("Masukkan Alamat :");
        utm.alamat = input.nextLine();
        
        System.out.println("Mahasiswa ");
        utm.tampilkanData();
    }
}