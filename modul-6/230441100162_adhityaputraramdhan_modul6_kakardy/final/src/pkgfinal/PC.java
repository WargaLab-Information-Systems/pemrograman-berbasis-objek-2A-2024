/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

/**
 *
 * @author AdhityaPutraaa
 */
public class PC extends Komputer {
    @Override
    public void hidupkanOs() {
        System.out.println("PC menghidupkan OS...");
    }

    @Override
    public void matikanOs() {
        System.out.println("PC mematikan OS...");
    }

    @Override
    public void klikKanan() {
        System.out.println("PC klik kanan...");
    }

    @Override
    public void klikKiri() {
        System.out.println("PC klik kiri...");
    }

    @Override
    public void tekanEnter() {
        System.out.println("PC tekan enter...");
    }

    @Override
    public void cetakData() {
        System.out.println("PC mencetak data...");
    }
}
