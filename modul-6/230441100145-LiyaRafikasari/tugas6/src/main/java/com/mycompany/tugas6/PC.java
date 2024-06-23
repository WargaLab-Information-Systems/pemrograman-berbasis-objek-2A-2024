/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas6;

/**
 *
 * @author LENOVO
 */
public class PC extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("OS PC dihidupkan.");
    }

    @Override
    public void matikan_os() {
        System.out.println("OS PC dimatikan.");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada PC.");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada PC.");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Enter ditekan pada PC.");
    }

    @Override
    public void cetak_data() {
        System.out.println("Data dicetak dari PC.");
    }
}
