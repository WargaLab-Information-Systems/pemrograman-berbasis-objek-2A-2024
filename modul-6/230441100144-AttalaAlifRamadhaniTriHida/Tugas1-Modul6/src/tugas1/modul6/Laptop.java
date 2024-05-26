/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1.modul6;

public class Laptop extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    public void hidupkan_os() {
        System.out.println("Laptop: Menyalakan sistem operasi.");
    }

    @Override
    public void matikan_os() {
        System.out.println("Laptop: Sistem operasi telah dimatikan.");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Laptop: Mengklik tombol kanan Touchpad.");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Laptop: Mengklik tombol kiri Touchpad.");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Laptop: Menekan tombol Enter.");
    }

    @Override
    public void cetak_data() {
        System.out.println("Laptop: Mencetak data dalam printer.");
    }
}