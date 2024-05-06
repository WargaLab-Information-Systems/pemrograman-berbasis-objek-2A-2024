/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
    //class main
public class Main {
    private void cetakSemua(OperasiMatematika[] OM, double a, double b) {
        for (OperasiMatematika operasi : OM) {
            operasi.setA(a);
            operasi.setB(b);
            operasi.setC();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
         Main main = new Main();
        OperasiMatematika[] operasi = {
                new Penjumlahan(),
                new Pengurangan(),
                new Perkalian(),
                new Pembagian()
        };

        double a = 9.25;
        double b = 1.25;

        main.cetakSemua(operasi, a, b);
    }
}
    

