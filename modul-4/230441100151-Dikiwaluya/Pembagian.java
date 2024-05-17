package modul4;

class Pembagian extends OperasiBilanganAbs {
    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double operasi() {
        return a / b;
    }

    @Override
    protected String getNamaOperasi() {
        return "Pembagian";
    }

    @Override
    protected String getSimbolOperasi() {
        return "/";
    }
}
