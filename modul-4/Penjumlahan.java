package modul4;

class Penjumlahan extends OperasiBilanganAbs {
    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double operasi() {
        return a + b;
    }

    @Override
    protected String getNamaOperasi() {
        return "Penjumlahan";
    }

    @Override
    protected String getSimbolOperasi() {
        return "+";
    }
}
