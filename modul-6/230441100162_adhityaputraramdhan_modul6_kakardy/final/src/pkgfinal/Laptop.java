/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

/**
 *
 * @author AdhityaPutraaa
 */
public class Laptop extends Komputer {
    @Override
    public void hidupkanOs() {
        System.out.println("Laptop menghidupkan OS...");
    }

    @Override
    public void matikanOs() {
        System.out.println("Laptop mematikan OS...");
    }

    @Override
    public void klikKanan() {
        System.out.println("Laptop klik kanan...");
    }

    @Override
    public void klikKiri() {
        System.out.println("Laptop klik kiri...");
    }

    @Override
    public void tekanEnter() {
        System.out.println("Laptop tekan enter...");
    }

    @Override
    public void cetakData() {
        System.out.println("Laptop mencetak data...");
    }
}
