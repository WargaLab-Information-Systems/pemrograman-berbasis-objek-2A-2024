/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project6;

/**
 *
 * @author USER
 */
final class KomputerCetak {

    /**
     * @param args the command line arguments
     */
    
 final static void cetak(Komputer[]komp){
     komp[0]=new PC() {};
     komp[1]=new Laptop(){};
     komp[2]=new NoteBook(){};
     
     
     for (Komputer comp:komp){
         comp.Hidupkan_os();
         comp.Klik_Kanan();
         comp.Klik_Kiri();
         comp.Tekan_Enter();
         comp.Cetak_Data();
         comp.Matikan_os();
     }
 }
    public static void main(String[] args) {
        // TODO code application logic here
        Komputer[]Computer=new Komputer[3];
        cetak(Computer);
    }
    
}
