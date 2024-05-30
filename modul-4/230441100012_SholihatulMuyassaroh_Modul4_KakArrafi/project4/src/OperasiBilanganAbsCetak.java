/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */

//class main
public class OperasiBilanganAbsCetak {
    private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for (OperasiBilanganAbs operasi : OB) {
            operasi.setA(a);
            operasi.setB(b);
            operasi.setC();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        OperasiBilanganAbsCetak main = new OperasiBilanganAbsCetak();
        OperasiBilanganAbs[] operasi = {
                new OperasiPenjumlahan(),
                new OperasiPengurangan(),
                new OperasiPerkalian(),
                new OperasiPembagian()
        };

        double a = 9.25;
        double b = 1.25;

        main.cetakSemua(operasi, a, b);
    }
}
