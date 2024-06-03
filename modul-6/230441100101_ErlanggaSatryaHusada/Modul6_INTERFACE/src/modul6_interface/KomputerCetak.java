/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6_interface;

/**
 *
 * @author Erlangga Satrya H
 */
final class KomputerCetak{
    final void cetak(Komputer[] kom){
        for (int i = 0 ; i < kom.length ; i++){
            kom[i].cetak_data();
            System.out.println("----------------");
        }
    }



    public static void main(String[] args) {
        Komputer []kom = {new Pc(),new Laptop(), new Netbook()};
        KomputerCetak print = new KomputerCetak();
        print.cetak(kom);
        System.out.println("test");

    }
}