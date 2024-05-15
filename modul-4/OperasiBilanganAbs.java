package modul4;

abstract class OperasiBilanganAbs {
    protected double a, b;

    public OperasiBilanganAbs(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected abstract double operasi();
    protected abstract String getNamaOperasi();
    protected abstract String getSimbolOperasi(); 

    public void tampil() {
        System.out.println("=======================");
        System.out.println("Hasil " + getNamaOperasi());
        System.out.println("Bilangan A = " + a);
        System.out.println("Bilangan B = " + b);
        System.out.println(a + " " + getSimbolOperasi() + " " + b + " = " + operasi());
        System.out.println("=======================");
    }
}
