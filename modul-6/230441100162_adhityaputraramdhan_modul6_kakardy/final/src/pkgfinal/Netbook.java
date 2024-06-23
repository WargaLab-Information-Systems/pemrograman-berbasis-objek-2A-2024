/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

/**
 *
 * @author AdhityaPutraaa
 */
public class Netbook extends Komputer {
    @Override
    public void hidupkanOs() {
        System.out.println("Netbook menghidupkan OS...");
    }

    @Override
    public void matikanOs() {
        System.out.println("Netbook mematikan OS...");
    }

    @Override
    public void klikKanan() {
        System.out.println("Netbook klik kanan...");
    }

    @Override
    public void klikKiri() {
        System.out.println("Netbook klik kiri...");
    }

    @Override
    public void tekanEnter() {
        System.out.println("Netbook tekan enter...");
    }

    @Override
    public void cetakData() {
        System.out.println("Netbook mencetak data...");
    }
}
