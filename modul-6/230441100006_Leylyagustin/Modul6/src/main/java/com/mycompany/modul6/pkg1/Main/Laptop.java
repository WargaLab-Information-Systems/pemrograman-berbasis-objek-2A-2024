/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul6.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
public class Laptop extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("OS Laptop dihidupkan.");
    }

    @Override
    public void matikan_os() {
        System.out.println("OS Laptop dimatikan.");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada Laptop.");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada Laptop.");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Enter ditekan pada Laptop.");
    }

    @Override
    public void cetak_data() {
        System.out.println("Data dicetak dari Laptop.");
    }
}
