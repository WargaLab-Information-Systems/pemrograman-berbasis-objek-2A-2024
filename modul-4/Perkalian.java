package modul4;


class Perkalian extends OperasiBilanganAbs {
    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double operasi() {
        return a * b;
    }

    @Override
    protected String getNamaOperasi() {
        return "Perkalian";
    }

    @Override
    protected String getSimbolOperasi() {
        return "*";
    }
}
