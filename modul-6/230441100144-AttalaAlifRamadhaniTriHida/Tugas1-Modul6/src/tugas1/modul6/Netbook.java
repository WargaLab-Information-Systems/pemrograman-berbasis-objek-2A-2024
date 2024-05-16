/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1.modul6;

public class Netbook extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    public void hidupkan_os() {
        System.out.println("Netbook: Menyalakan sistem operasi.");
    }

    @Override
    public void matikan_os() {
        System.out.println("Netbook: Sistem operasi telah dimatikan.");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Netbook: Mengklik tombol kanan Touchpad.");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook: Mengklik tombol kiri Touchpad.");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Netbook: Menekan tombol Enter.");
    }

    @Override
    public void cetak_data() {
        System.out.println("Netbook: Mencetak data dalam printer.");
    }
}