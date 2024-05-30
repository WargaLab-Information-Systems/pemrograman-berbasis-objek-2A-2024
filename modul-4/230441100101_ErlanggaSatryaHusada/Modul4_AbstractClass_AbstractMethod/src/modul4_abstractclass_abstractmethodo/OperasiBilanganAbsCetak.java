/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4_abstractclass_abstractmethodo;

/**
 *
 * @author Erlangga Satrya H
 */
final class OperasiBilanganAbsCetak {
    public void cetakSemua(OperasiBilanganAbs[] ob, double a, double b) {
        for (OperasiBilanganAbs operasi : ob) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        OperasiBilanganAbs[] operasi = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasi, 9.25, 1.25); // Contoh nilai a dan b
    }
}