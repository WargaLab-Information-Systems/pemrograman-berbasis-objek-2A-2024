/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbomodul1no2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
class Maba{
    String nama, prodi, alamat, nim;
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maba mhs1 = new Maba();
        Scanner input = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Masukkan nama mhs : ");
        mhs1.nama = input.nextLine();
        
        System.out.println("Masukkan prodi mhs: ");
        mhs1.prodi = input.nextLine();
        
        System.out.println("Masukkan alamat mhs: ");
        mhs1.alamat = input.nextLine();
        
        System.out.println("Mauskkan nim mhs : ");
        mhs1.nim = input.nextLine();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("######DATA MAHASISWA######");
        System.out.println("Nama : " + mhs1.nama);
        System.out.println("Nim : " + mhs1.nim);
        System.out.println("Prodi : " + mhs1.prodi);
        System.out.println("Alamat : " + mhs1.alamat);
    }
    
}
