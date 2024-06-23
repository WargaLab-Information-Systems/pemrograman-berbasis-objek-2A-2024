package modul.pkg5;

class Penjumlahan extends OperasiMatematika {
    @Override
    public double hitung() {
        return a + b + c;
    }

    @Override
    public double hitung(double a, double b, double c) {
        return a + b + c;
    }

    @Override
    public double hitung(double a, double b) {
        return a + b;
    }

    @Override
    public double hitung(double a) {
        return a;
    }
}