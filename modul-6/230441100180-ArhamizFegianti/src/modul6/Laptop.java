/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author Amira Alissiya
 */
public class Laptop extends Komputer implements Mouse,Keyboard,Printer{
    @Override
    void hidupkan_os() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Hidupkan os");
    }

    @Override
    void matikan_os() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Matikan os");
    }

    @Override
    public void klik_kanan() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");    
        System.out.println("Tekan enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("----------------");
        System.out.println("     LAPTOP     ");
        System.out.println("----------------");
        System.out.println("Cetak data");
    }
}
