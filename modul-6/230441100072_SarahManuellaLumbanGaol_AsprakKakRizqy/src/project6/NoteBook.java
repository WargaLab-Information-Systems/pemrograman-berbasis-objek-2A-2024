/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6;

/**
 *
 * @author USER
 */
public abstract class NoteBook extends Komputer implements Imouse,Ikeyboard,Iprinter {
    @Override
    public void Hidupkan_os(){
        System.out.println("============Button dalam NoteBook==============");
        System.out.println("Hidupkan NoteBook");
    }
    @Override
    public void Klik_Kanan(){
        System.out.println("Klik Kanan");
    }
    @Override
    public void Klik_Kiri(){
        System.out.println("Klik Kiri");
    }
    @Override
    public void Tekan_Enter(){
        System.out.println("Tekan Enter");
    }
    @Override
    public void Cetak_Data(){
        System.out.println("Cetak Dat");
    }
    
    @Override
    public void Matikan_os(){
        System.out.println("Matikan NoteBook");
        System.out.println(" ");
    }
}
