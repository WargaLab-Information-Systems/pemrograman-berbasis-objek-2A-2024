/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputer;

class Netbook extends Komputer implements Mouse,Keyboard,Printer {
    @Override
    void Hidupkan_os(){
        System.out.println(" netbook : Menghidupkan Sistem Operasi Windows ");
    }
    @Override
    void Matikan_os(){
        System.out.println(" netbook : Mematikan Sistem Operasi Windows ");
    }
    @Override
    public void Klik_Kanan(){
        System.out.println(" netbook : Mengeklik Kanan pada Mouse ");
    }
    @Override
    public void Klik_Kiri(){
        System.out.println(" netbook : Mengeklik Kiri pada Mouse ");
    }
    @Override
    public void Tekan_Enter(){
        System.out.println(" netbook : Mengeklik Tombol Enter Pada Keyboard ");
    }
    @Override
    public void Cetak_Data(){
        System.out.println(" netbook : PC Mencetak dalam printer");
    }  
}
