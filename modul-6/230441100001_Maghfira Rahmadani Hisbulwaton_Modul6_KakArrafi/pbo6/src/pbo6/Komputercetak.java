/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6;

/**
 *
 * @author asus
 */
final class Komputercetak {
    final void cetak(Komputer[] obj) {
        for (Komputer komputer : obj) {
            komputer.hidupkan_OS();
            komputer.matikan_OS();
            komputer.klik_kanan();
            komputer.klik_kiri();
            komputer.tekan_enter();
            komputer.cetak_data();
        }
    }

    public static void main(String[] args) {
        Komputer[] komputerArray = {
            new PC(),
            new Laptop(),
            new Netbook()
        };

        Komputercetak cetak = new Komputercetak();
        cetak.cetak(komputerArray);
    }
}