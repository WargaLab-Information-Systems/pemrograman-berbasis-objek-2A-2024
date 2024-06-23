/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;

/**
 *
 * @author Amira Alissiya
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class KomputerCetak {
    public void cetak(List<Komputer> obj) {
        for (Komputer komputer : obj) {
            komputer.cetak_data();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KomputerCetak cetak = new KomputerCetak();
        List<Komputer> komputerList = new ArrayList<>();

        System.out.println("Masukkan jumlah jenis komputer:");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan jenis komputer yang dipilih (PC/Laptop/Notebook):");
            String type = scanner.nextLine();
            Komputer komputer = cetak.JenisKomputer(type);
            if (komputer != null) {
                komputerList.add(komputer);
            } else {
                System.out.println("Jenis komputer tidak tersedia");
                i--; 
            }
        }
        
        for (Komputer komputer : komputerList) {
            System.out.println("Pilih Operation " + komputer.getClass().getSimpleName() + " :");
            System.out.println("1. Hidupkan OS");
            System.out.println("2. Matikan OS");
            System.out.println("3. Klik Kanan");
            System.out.println("4. Klik Kiri");
            System.out.println("5. Tekan Enter");
            System.out.println("6. Cetak Data");
            System.out.print("Masukkan pilihan Operation (1-6): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 -> komputer.hidupkan_os();
                case 2 -> komputer.matikan_os();
                case 3 -> komputer.klik_kanan();
                case 4 -> komputer.klik_kiri();
                case 5 -> komputer.tekan_enter();
                case 6 -> komputer.cetak_data();
                default -> System.out.println("Pilihan tidak tersedia");
            }
        }
    }
        public Komputer JenisKomputer(String type) {
        return switch (type.toLowerCase()) {
            case "pc" -> new PC();
            case "laptop" -> new Laptop();
            case "notebook" -> new Notebook();
            default -> null;
        };
    }
}