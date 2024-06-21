package pbo.modul5;

class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_A(double a) {
        this.A = a;
    }

    @Override
    protected void set_B(double b) {
        this.B = b;
    }

    @Override
    protected void set_C(double c) {
        this.C = c;
    }

    @Override
    protected void set_D() {
        this.D = this.A * this.B * this.C;
    }

    @Override
    protected double get_A() {
        return this.A;
    }

    @Override
    protected double get_B() {
        return this.B;
    }

    @Override
    protected double get_C() {
        return this.C;
    }

    @Override
    protected double get_D() {
        return this.D;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian: " + this.D);
    }
}


