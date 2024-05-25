/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputer;

class Laptop extends Komputer implements Mouse,Keyboard,Printer {
    @Override
    void Hidupkan_os(){
        System.out.println(" laptop : Menghidupkan Sistem Operasi");
    }
    @Override
    void Matikan_os(){
        System.out.println(" laptop : Mematikan Sistem Operasi");
    }
    @Override
    public void Klik_Kanan(){
        System.out.println(" laptop : Mengeklik Kanan pada Mouse ");
    }
    @Override
    public void Klik_Kiri(){
        System.out.println(" laptop : Mengeklik Kiri pada Mouse ");
    }
    @Override
    public void Tekan_Enter(){
        System.out.println(" laptop : Mengeklik Tombol Enter Pada Keyboard ");
    }
    @Override
    public void Cetak_Data(){
        System.out.println(" laptop : PC Mencetak dalam printer");
    }  
}
