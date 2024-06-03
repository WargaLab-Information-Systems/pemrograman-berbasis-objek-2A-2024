/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas6;

/**
 *
 * @author LENOVO
 */
public class Netbook extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("OS Netbook dihidupkan.");
    }

    @Override
    public void matikan_os() {
        System.out.println("OS Netbook dimatikan.");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada Netbook.");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada Netbook.");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Enter ditekan pada Netbook.");
    }

    @Override
    public void cetak_data() {
        System.out.println("Data dicetak dari Netbook.");
    }
}
