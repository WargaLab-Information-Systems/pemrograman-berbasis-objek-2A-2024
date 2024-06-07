/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shahaflanjaya
 */
public class Laptop extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Laptop: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("Laptop: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Laptop: Klik kanan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Laptop: Klik kiri mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Laptop: Tekan enter pada keyboard");
    }

    @Override
    public void cetak_data() {
        System.out.println("Laptop: Cetak data");
    }
}
