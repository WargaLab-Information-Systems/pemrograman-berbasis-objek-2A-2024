/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6no1;

public class Modul6No1 {
    public static void main(String[] args) {
        KomputerCetak komputerCetak = new KomputerCetak();

        Komputer pc = new pc();
        Komputer laptop = new Laptop();
        Komputer netbook = new Netbook();

        
        komputerCetak.cetak(pc, "Printer");
        komputerCetak.cetak(laptop, "Print2an");
        komputerCetak.cetak(netbook, "Printer");

        System.out.println();

       
    }
    
}
