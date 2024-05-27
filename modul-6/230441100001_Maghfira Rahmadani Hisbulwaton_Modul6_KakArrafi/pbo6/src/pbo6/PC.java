/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6;

/**
 *
 * @author asus
 */
public class PC extends Komputer implements Mouse, Keyboard, Printer {
    public void hidupkan_OS(){
        System.out.println("menghidupkan OS dari PC");
    }
    public void matikan_OS(){
        System.out.println("mematikan OS dari PC");
    }
    @Override
    public void klik_kanan() {
        System.out.println("Mengklik kanan pada mouse PC");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mengklik kiri pada mouse PC");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menekan enter pada keyboard PC");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak data dari PC");
    }
}
