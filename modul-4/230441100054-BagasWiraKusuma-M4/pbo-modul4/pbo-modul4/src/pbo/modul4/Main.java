package pbo.modul4;

public class Main {
    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;

        OperasiMatematika[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new perkalian(),
            new Pembagian()
        };
        
        for (int i = 0; i < operasi.length; i++) {
            OperasiMatematika op = operasi[i];
            op.setA(a);
            op.setB(b);
            op.setC();
            op.tampil();
        }
    }
}