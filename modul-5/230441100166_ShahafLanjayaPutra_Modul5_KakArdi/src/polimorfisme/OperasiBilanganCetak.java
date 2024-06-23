/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author shahaflanjaya
 */
class OperasiBilanganCetak {
    void cetakSemua(OperasiBilangan operasi, double a, double b, double c) {
        operasi.set_A(a);
        operasi.set_B(b);
        operasi.set_C(c);
        operasi.set_D();
        operasi.tampil();
    }

    void cetakSemua(OperasiPengurangan pengurangan, double a, double b, double c) {
        pengurangan.set_A(a);
        pengurangan.set_B(b);
        pengurangan.set_C(c);
        pengurangan.set_D();
        pengurangan.tampil();
    }
}


