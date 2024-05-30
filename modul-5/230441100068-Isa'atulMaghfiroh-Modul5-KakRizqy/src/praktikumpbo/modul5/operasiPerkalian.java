/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.modul5;

/**
 *
 * @author HP
 */
public class operasiPerkalian extends operasiBilangan {
    
    @Override
    void hitung() {
        this.d = this.a * this.b*this.c;
        System.out.println("Hasil Perkalian : " + this.d);
    }
    
}
