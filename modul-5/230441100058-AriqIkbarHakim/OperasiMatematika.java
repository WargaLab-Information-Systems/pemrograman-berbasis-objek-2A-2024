package praktikum5;

abstract class OperasiMatematika {
    protected double a;
    protected double b;
    protected double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public abstract double hitung();
    public abstract double hitung(double a, double b, double c);
    public abstract double hitung(double a, double b);
    public abstract double hitung(double a);
}
