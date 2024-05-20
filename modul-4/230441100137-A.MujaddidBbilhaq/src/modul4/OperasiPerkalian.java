package modul4;


public class OperasiPerkalian extends OperasiBilanganAbs{
     protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = this.a * this.b;
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return this.b;
    }

    @Override
    protected double get_C() {
        return this.c;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Operasi Perkalian: " + this.a + " x " + this.b + " = " + this.c);
    }
    
}
