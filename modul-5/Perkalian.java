package praktikum5;

public class Perkalian extends OPBilanganAbs implements Operasi {
    public Perkalian(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        return a * b;
    }

    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C(double c) {
        this.c = c;
    }

    @Override
    public void tampilHasil() {
        System.out.println("=====");
        System.out.println("Operasi Perkalian");
        System.out.println("bilangan A = " + get_A());
        System.out.println("bilangan B = " + get_B());
        System.out.println("Hasil Perkalian AxB = " + get_C());
        System.out.println("=====");
    }
}