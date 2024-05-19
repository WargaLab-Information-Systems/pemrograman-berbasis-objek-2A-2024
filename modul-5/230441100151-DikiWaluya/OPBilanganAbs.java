package praktikum5;

abstract class OPBilanganAbs {
    protected double a;
    protected double b;
    protected double c;

    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C(double c);
}

interface Operasi {
    void tampilHasil();
}