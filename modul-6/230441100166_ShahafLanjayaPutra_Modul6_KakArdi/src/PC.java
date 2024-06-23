/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shahaflanjaya
 */
// Implementasi class PC yang memperluas abstract class Komputer
public class PC extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("PC: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("PC: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("PC: Klik kanan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Klik kiri mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: Tekan enter pada keyboard");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: Cetak data");
    }
}
