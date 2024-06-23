/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulaor;

/**
 *
 * @author Veldoraaa
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang;
        
        do {
            // Inisialisasi bilangan A dan B
            double A, B;
            System.out.print("Masukkan bilangan A: ");
            A = scanner.nextDouble();
            System.out.print("Masukkan bilangan B: ");
            B = scanner.nextDouble();
            
            // Buat objek untuk setiap operasi
            OperasiMatematika penjumlahan = new Penjumlahan();
            OperasiMatematika pengurangan = new Pengurangan();
            OperasiMatematika perkalian = new Perkalian();
            OperasiMatematika pembagian = new Pembagian();
            
            // Tampilkan pilihan operasi kepada pengguna
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan pilihan: ");
            
            int pilihan = scanner.nextInt();
            
            // Lakukan operasi sesuai pilihan pengguna dan cetak hasilnya
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil Penjumlahan: " + penjumlahan.operasi(A, B));
                    break;
                case 2:
                    System.out.println("Hasil Pengurangan: " + pengurangan.operasi(A, B));
                    break;
                case 3:
                    System.out.println("Hasil Perkalian: " + perkalian.operasi(A, B));
                    break;
                case 4:
                    if (B != 0) {
                        System.out.println("Hasil Pembagian: " + pembagian.operasi(A, B));
                    } else {
                        System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            // Meminta pengguna apakah ingin melakukan operasi lagi
            System.out.print("Apakah Anda ingin melakukan operasi matematika lagi? (Y/T): ");
            String jawaban = scanner.next();
            ulang = jawaban.equalsIgnoreCase("Y");
        } while (ulang);
            // Tambahan pesan ketika loop selesai
    System.out.println("Arigatouuuuuuu");
        scanner.close();
    }
}

