/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ZENDIA AMELIA
 */
public class Netbook extends Komputer implements Mouse, Keyboard, Printer {
  
    @Override
    void hidupkan_os() {
        System.out.println("OS Netbook dihidupkan");
    }
    
    @Override
    void matikan_os() {
        System.out.println("OS Netbook dimatikan");
    }
    
    @Override
    public void klik_kanan() {
        System.out.println("Klik Kanan pada Netbook");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik Kiri pada Netbook");
    }
    
    @Override
    public void tekan_enter() {
        System.out.println("Enter ditekan pada Laptop");
    }
    
    @Override
    public void cetak_data() {
        System.out.println("Cetak data dari Netbook");
    }
}
