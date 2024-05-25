/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class pc extends komputer {

    @Override
    void hidupkan_os() {
        System.out.println("PC: OS dihidupkan");
    }

    @Override
    void matikan_os() {
        System.out.println("PC: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("PC: klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: tekan enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: mencetak data");
    }
    
}
