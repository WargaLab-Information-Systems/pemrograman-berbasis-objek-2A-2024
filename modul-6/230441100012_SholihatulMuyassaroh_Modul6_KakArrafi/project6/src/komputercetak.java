/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
final class komputercetak {
    
    final void cetak(komputer[] obj) {
        for (komputer komputer : obj) {
            komputer.hidupkan_os();
            komputer.klik_kanan();
            komputer.klik_kiri();
            komputer.tekan_enter();
            komputer.cetak_data();
            komputer.matikan_os();
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        komputer[] komputerArray = {
            new pc(),
            new laptop(),
            new netbook()
        };

        komputercetak cetak = new komputercetak();
        cetak.cetak(komputerArray);

    }
    
}
