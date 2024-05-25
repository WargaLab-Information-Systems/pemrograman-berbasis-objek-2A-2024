/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6no1;


public class Laptop extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("|==========================|");
        System.out.println("Menghidupkan OS pada Laptop");
    }

    @Override
    public void matikan_os() {
        System.out.println("Mematikan OS pada Laptop");
        System.out.println("|==========================|");
        System.out.println("");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada Laptop");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada Laptop");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Tekan Enter pada Laptop");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak data dari Laptop");
    }

    
    public void cetak_data(String fileName) {
        System.out.println("Mencetak data dari file " + fileName + " pada Laptop");
    }
}

