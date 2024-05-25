/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6no1;


public class Netbook extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("|==========================|");
        System.out.println("Menghidupkan OS pada Netbook");
    }

    @Override
    public void matikan_os() {
        System.out.println("Mematikan OS pada Netbook");
        System.out.println("|==========================|");
        System.out.println("");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada Netbook");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada Netbook");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Tekan Enter pada Netbook");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak data dari Netbook");
    }
    public void cetak_data(String fileName) {
        System.out.println("Mencetak data dari file " + fileName + " pada Netbook");
    }
}

