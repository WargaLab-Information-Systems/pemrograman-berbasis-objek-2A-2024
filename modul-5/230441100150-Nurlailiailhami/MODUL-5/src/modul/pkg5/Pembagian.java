package modul.pkg5;

class Pembagian extends OperasiMatematika {
    @Override
    public double hitung() {
        if (b == 0 || c == 0) {
            throw new ArithmeticException("Pembagian dengan nol");
        }
        return a / b / c;
    }

    @Override
    public double hitung(double a, double b, double c) {
        if (b == 0 || c == 0) {
            throw new ArithmeticException("Pembagian dengan nol");
        }
        return a / b / c;
    }

    @Override
    public double hitung(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol");
        }
        return a / b;
    }

    @Override
    public double hitung(double a) {
        return a;
    }
}