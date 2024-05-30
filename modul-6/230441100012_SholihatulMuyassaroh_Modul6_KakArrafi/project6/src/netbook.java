/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class netbook extends komputer {

    @Override
    void hidupkan_os() {
        System.out.println("Netbook: OS dihidupkan");
    }

    @Override
    void matikan_os() {
        System.out.println("Netbook: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Netbook: klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook: klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Netbook: tekan enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Netbook: mencetak data");
    }
    
}
