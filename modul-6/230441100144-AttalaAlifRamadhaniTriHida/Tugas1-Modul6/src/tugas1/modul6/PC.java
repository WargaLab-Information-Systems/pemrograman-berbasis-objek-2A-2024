/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1.modul6;

public class PC extends Komputer implements Mouse, Keyboard, Printer{
    @Override
    public void hidupkan_os() {
        System.out.println("PC: Menyalakan sistem operasi.");
    }

    @Override
    public void matikan_os() {
        System.out.println("PC: Sistem operasi telah dimatikan.");
    }

    @Override
    public void klik_kanan() {
        System.out.println("PC: Mengklik tombol kanan mouse.");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Mengklik tombol kiri mouse.");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: Menekan tombol Enter.");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: Mencetak data dalam printer.");
    }
}