package com.pkg;


public class Main {

    public static void main(String[] args) {
        Komputer pc = new PC();
        Komputer laptop = new Laptop();
        Komputer netbook = new Netbook();
        
        KomputerCetak display = new KomputerCetak();
        
        display.cetak(pc);
        display.cetak(laptop);
        display.cetak(netbook);
    }
}   
     