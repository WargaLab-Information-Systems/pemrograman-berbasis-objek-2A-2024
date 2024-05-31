package OperasiBilangan;

public class BilanganCetak {
    void cetakSemua(OperasiBilangan[] OB, double a, double b, double c) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C(c);
            operasi.set_D();
            operasi.tampil();
            operasi.Operasi( a, b);
            operasi.Operasi( a, b, c);
        }
    }
}

