/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul6.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */import java.util.Scanner;

public class Modul6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Pilih jenis komputer: 1. PC 2. Laptop 3. Netbook:");
            int pilihan = scanner.nextInt();

            Komputer komputer = null;
            switch (pilihan) {
                case 1:
                    komputer = new PC();
                    break;
                case 2:
                    komputer = new Laptop();
                    break;
                case 3:
                    komputer = new Netbook();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }

            komputer.hidupkan_os();
            komputer.klik_kanan();
            komputer.klik_kiri();
            komputer.tekan_enter();
            komputer.cetak_data();
            komputer.matikan_os();

            Komputer[] komputers = {komputer};
            KomputerCetak komputerCetak = new KomputerCetak();
            komputerCetak.cetak(komputers);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        } finally {
            scanner.close();
        }
    }
}