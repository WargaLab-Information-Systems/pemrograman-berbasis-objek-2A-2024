/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6;

/**
 *
 * @author asus
 */
public class Laptop extends Komputer {
    public void hidupkan_OS(){
         System.out.println("menghidupkan OS dari Laptop");
     }
    public void matikan_OS(){
        System.out.println("mematikan OS dari Laptop");
    }
    @Override
    public void klik_kanan() {
        System.out.println("Mengklik kanan pada mouse Laptop");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mengklik kiri pada mouse Laptop");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menekan enter pada keyboard Laptop");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak data dari Laptop");
    }
}
