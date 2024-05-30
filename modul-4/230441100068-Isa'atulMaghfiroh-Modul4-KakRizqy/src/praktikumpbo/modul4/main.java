/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpbo.modul4;

public class main {

    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;

        OperasiMatematika[] operasi = {
            new Penjumlahan(a, b),
            new Pengurangan(a, b),
            new Perkalian(a, b),
            new Pembagian(a, b)
        };

        for (OperasiMatematika op : operasi) {
            System.out.println(op.operasi() + ": " + op.hasil());
        }
    }
}