/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.modul6;

import java.util.Scanner;

public final class KomputerCetak {
    public final void cetak(Komputer[] obj) {
        for (Komputer komputer : obj) {
            komputer.hidupkan_os();
            komputer.klik_kanan();
            komputer.tekan_enter();
            komputer.cetak_data();
            komputer.matikan_os();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih komputer yang ingin dinyalakan:");
            System.out.println("1. PC");
            System.out.println("2. Laptop");
            System.out.println("3. Netbook");
            System.out.print("Masukkan pilihan (1/2/3): ");
            
            int choice = scanner.nextInt();
            
            Komputer komputer = null;
            
            switch (choice) {
                case 1 -> komputer = new PC();
                case 2 -> komputer = new Laptop();
                case 3 -> komputer = new Netbook();
                default -> {
                    System.out.println("Pilihan tidak valid.");
                    return;
                }
            }
            
            System.out.println();
            System.out.print("Apakah Anda ingin menyalakan sistem operasi? (ya/tidak): ");
            String pilihanNyalakan = scanner.next().toLowerCase();
                
            if (pilihanNyalakan.equals("ya")) {
                if (komputer != null) {
                    System.out.println("Mengoperasikan sistem komputer:");
                    System.out.println("----------------------");
                    komputer.hidupkan_os();                    
            for (;;) {
                System.out.println("\nPilih tindakan:");
                System.out.println("1. Klik Kanan");
                System.out.println("2. Klik Kiri");
                System.out.println("3. Tekan Enter");
                System.out.println("4. Cetak Data");
                System.out.println("5. Matikan OS");
                    int pilihantindakan = scanner.nextInt();
                    
                    switch (pilihantindakan) {
                        case 1 -> {
                            if (komputer != null) {
                                komputer.klik_kanan();
                            }
                        }
                        case 2 -> {
                            if (komputer != null) {
                                komputer.klik_kiri();
                            }
                        }
                        case 3 -> {
                            if (komputer != null) {
                                komputer.tekan_enter();
                            }
                        }
                        case 4 -> {
                            if (komputer != null) {
                                komputer.cetak_data();
                            }
                        }
                        case 5 -> {
                            if (komputer != null) {
                                komputer.matikan_os(); 
                            scanner.close();
                            return;
                        }
                    if (pilihantindakan == 6) {
                        System.out.println("Pilihan tidak valid.");
                    break;
                    }
                        }
                    }
            }
                }
            }
        }
    }
}