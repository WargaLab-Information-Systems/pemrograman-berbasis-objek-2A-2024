/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mdl6;
//Metode cetak menerima satu parameter, yaitu objek dari kelas komputer
public final class komputercetak {
//Kelas komputercetak dideklarasikan sebagai final, yang berarti kelas ini tidak bisa diturunkan
    public void cetak(komputer k) {
        k.hidupkan_os(); //Menghidupkan
        k.klik_kanan(); //Melakukan
        k.klik_kiri();
        k.tekan_enter();
        k.cetak_data();
        k.matikan_os();
        System.out.println("--------------");
    }
}
