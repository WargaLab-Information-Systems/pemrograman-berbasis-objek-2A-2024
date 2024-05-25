/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6no1;


public final class KomputerCetak {
    public void cetak(Komputer obj) {
        obj.hidupkan_os();
        obj.klik_kanan();
        obj.klik_kiri();
        obj.tekan_enter();
        obj.cetak_data();
        obj.matikan_os();
    }

   
    public void cetak(Komputer obj, String fileName) {
        obj.hidupkan_os();
        obj.klik_kanan();
        obj.klik_kiri();
        obj.tekan_enter();
        if (obj instanceof pc) {
            ((pc) obj).cetak_data(fileName);
        } else if (obj instanceof Laptop) {
            ((Laptop) obj).cetak_data(fileName);
        } else if (obj instanceof Netbook) {
            ((Netbook) obj).cetak_data(fileName);
        }
        obj.matikan_os();
    }
}