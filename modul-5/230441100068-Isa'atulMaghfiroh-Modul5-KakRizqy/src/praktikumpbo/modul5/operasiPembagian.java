/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.modul5;

/**
 *
 * @author HP
 */
public class operasiPembagian extends operasiBilangan {
    
    @Override
    void hitung() {
        if (this.b != 0) {
            this.d = this.a / this.b/this.c;
            System.out.println("Hasil Pembagian : " + this.d);
        } else {
            System.out.println("Error : Pembagian dengan nol.");
        }
    }
    
}
