/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputer;

class PC extends Komputer implements Mouse,Keyboard,Printer {
    @Override
    void Hidupkan_os(){
        System.out.println(" PC : Menghidupkan Sistem Operasi");
    }
    @Override
    void Matikan_os(){
        System.out.println(" PC : Mematikan Sistem Operasi");
    }
    @Override
    public void Klik_Kanan(){
        System.out.println(" PC : Mengeklik Kanan pada Mouse ");
    }
    @Override
    public void Klik_Kiri(){
        System.out.println(" PC : Mengeklik Kiri pada Mouse ");
    }

    @Override
    public void Cetak_Data(){
        System.out.println(" PC : PC Mencetak dalam printer");
    }

    @Override
    public void Tekan_Enter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
