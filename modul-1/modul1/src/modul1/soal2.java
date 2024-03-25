package modul1;

import java.util.Scanner;

public class soal2 {
    String nim;
    String nama, prodi, alamat, fakultas;
    Scanner input = new Scanner(System.in); 

    void biodata() {
        System.out.print("Nama      : ");
        nama = input.nextLine();
        
        System.out.print("Nim       : ");
        nim = input.nextLine();
        
        System.out.print("Fakultas   :  ");
        fakultas = input.nextLine();
        
        System.out.print("Program Study  : ");
        prodi = input.nextLine();
        
        System.out.print("Alamat    : ");
        alamat = input.nextLine();
    }
    
    void hasil() {
        System.out.println("Nama            : " + nama);
        System.out.println("Nim             : " + nim);
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Program Studi   : " + prodi); 
        System.out.println("Alamat          : " + alamat);
    }
  
    public static void main(String[] args) {
        soal2 mahasiswa = new soal2();
        
        mahasiswa.biodata();
        mahasiswa.hasil();
    }
}
