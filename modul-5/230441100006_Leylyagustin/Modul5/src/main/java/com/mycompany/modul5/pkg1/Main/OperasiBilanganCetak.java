/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
class OperasiBilanganCetak {
    void cetakSemua(OperasiBilangan[] OB, double a, double b, double c) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C(c);
            operasi.set_D();
            operasi.tampil();
            operasi.Operasi( a, b, c);
        }
    }
}