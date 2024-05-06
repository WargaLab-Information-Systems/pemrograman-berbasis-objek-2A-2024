/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi_sederhana;

abstract class OperasiBilanganAbs {
    protected double A;
    protected double B;
    protected double C;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();
    protected abstract void test();

final class OperasiBilanganAbsCetak {
    protected void cetakSemua(OperasiBilanganAbs operasi, double a, double b) {
        operasi.set_A(a);
        operasi.set_B(b);
        operasi.set_C();
        operasi.tampil();
    }
}




public class main {
    public static void main(String[] args) {
        OperasiBilanganAbs operasi;

        operasi = new penjumlahan();
        operasi.set_A(9.25);
        operasi.set_B(1.25);
        operasi.set_C();
        operasi.tampil();
        
        operasi = new pengurangan();
        operasi.set_A(9.25);
        operasi.set_B(1.25);
        operasi.set_C();
        operasi.tampil();
        
        operasi = new perkalian();
        operasi.set_A(9.25);
        operasi.set_B(1.25);
        operasi.set_C();
        operasi.tampil();
        
        operasi = new pembagian();
        operasi.set_A(9.25);
        operasi.set_B(1.25);
        operasi.set_C();
        operasi.tampil();
    }
}

