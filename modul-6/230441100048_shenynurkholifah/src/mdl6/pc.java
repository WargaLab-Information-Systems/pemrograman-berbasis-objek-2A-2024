/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mdl6;
public class pc extends komputer { //turunan
    @Override //untuk menyediakan implementasi spesifik dari metode" yg didefinisikan dalam kelas induk komputer
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
