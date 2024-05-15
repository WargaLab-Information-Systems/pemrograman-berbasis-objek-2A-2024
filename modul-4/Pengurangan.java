package modul4;

class Pengurangan extends OperasiBilanganAbs {
    public Pengurangan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double operasi() {
        return a - b;
    }

    @Override
    protected String getNamaOperasi() {
        return "Pengurangan";
    }

    @Override
    protected String getSimbolOperasi() {
        return "-";
    }
}
