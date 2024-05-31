/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.modul4;


public class Main {
    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;

        OperasiMatematika[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        for (OperasiMatematika op : operasi) {
            op.setA(a);
            op.setB(b);
            op.setC();
            op.tampil();
            System.out.println();
        }
    }
}