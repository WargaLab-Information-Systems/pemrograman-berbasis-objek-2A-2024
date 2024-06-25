/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mdl6;
public class laptop extends komputer { //turunan
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
        System.out.println("Laptop: Klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Laptop: Klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Laptop: Tekan enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Laptop: Data dicetak");
    }
}
