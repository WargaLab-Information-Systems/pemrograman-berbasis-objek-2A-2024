/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;
import java.util.Scanner;





public class Modul3 {
    public static void main(String[] args) {
//        Scanner scanner12 = new Scanner(System.in);
        Scanner scanner12 = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku yang akan dimasukkan: ");
        int numBooks = scanner12.nextInt();
        scanner12.nextLine(); // consume newline

        // Array to store book objects
        perpustakaan[] buku1 = new perpustakaan[numBooks];

       
        for (int i = 0; i < numBooks; i++) {
            buku1[i] = perpustakaan.TambahBuku(scanner12);
        }

       
        System.out.println("\nDaftar Buku:");
        for (perpustakaan buku : buku1) {
            System.out.println("---------------------------");
            buku.TampilanBuku();
        }


    }
}
