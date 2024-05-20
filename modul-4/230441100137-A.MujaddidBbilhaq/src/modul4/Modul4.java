package modul4;

public class Modul4 {
    public static void main(String[] args) {
        OperasiBilanganAbs op1 = new OperasiPenjumlahan();
        OperasiBilanganAbs op2 = new OperasiPengurangan();
        OperasiBilanganAbs op3 = new OperasiPerkalian();
        OperasiBilanganAbs op4 = new OperasiPembagian();

        op1.set_A(9.25);
        op1.set_B(1.25);
        op1.set_C();
        op1.tampil();

        op2.set_A(9.25);
        op2.set_B(1.25);
        op2.set_C();
        op2.tampil();
        
        op3.set_A(9.25);
        op3.set_B(1.25);
        op3.set_C();
        op3.tampil();

        op4.set_A(9.25);
        op4.set_B(1.25);
        op4.set_C();
        op4.tampil();
    }
    
}
