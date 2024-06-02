package com.pkg;


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
        System.out.println("PC: Klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: Tekan enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: Data dicetak");
    }
}
