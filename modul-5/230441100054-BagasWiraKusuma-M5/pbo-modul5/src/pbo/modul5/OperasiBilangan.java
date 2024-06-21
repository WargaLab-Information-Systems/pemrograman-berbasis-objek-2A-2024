package pbo.modul5;
abstract class OperasiBilangan {
    protected double A;
    protected double B;
    protected double C;
    protected double D;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C(double c);
    protected abstract void set_D();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract double get_D();
    protected abstract void tampil();
}


