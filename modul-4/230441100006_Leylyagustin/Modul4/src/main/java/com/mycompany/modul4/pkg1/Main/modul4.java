/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
public class modul4 {
    public static void main(String[] args) {
        double bilangan_A = 9.25;
        double bilangan_B = 1.25;

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();

        System.out.println("Penjumlahan:");
        cetak.CetakSemua(new OperasiPenjumlahan(), bilangan_A, bilangan_B);

        System.out.println("\nPengurangan:");
        cetak.CetakSemua(new OperasiPengurangan(), bilangan_A, bilangan_B);

        System.out.println("\nPerkalian:");
        cetak.CetakSemua(new OperasiPerkalian(), bilangan_A, bilangan_B);

        System.out.println("\nPembagian:");
        cetak.CetakSemua(new OperasiPembagian(), bilangan_A, bilangan_B);
    }
}