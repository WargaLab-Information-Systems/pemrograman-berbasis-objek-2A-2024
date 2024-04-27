/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.modul3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama Perpustakaan: ");
        String namaPerpus = scanner.nextLine();
        perpus.setNamaPerpus(namaPerpus);
        

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int X = scanner.nextInt();
        scanner.nextLine();

        apkperpus aplikasi = new apkperpus();

        for (int i = 0; i < X; i++) {
            aplikasi.tambahBuku();
        }
        
        aplikasi.daftarSemuaBuku();
    }
    
}
