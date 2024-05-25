/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul6.pkg1.Main;

/**
 *
 * @author Leyli Agustin
 */
public final class KomputerCetak {
    public final void cetak(Komputer[] obj) {
        for (Komputer komputer : obj) {
            komputer.cetak_data();
        }
    }
}
