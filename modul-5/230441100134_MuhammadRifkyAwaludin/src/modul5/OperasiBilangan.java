package modul5;

public abstract class OperasiBilangan {
    // protected digunakan untuk bisa diakses oleh kelas-kelas dalam paket yang sama serta kelas-kelas turunannya. 
    protected double a, b, c, d;
    
    protected abstract void setA(double a);
    protected abstract void setB(double b);
    protected abstract void setC(double c);
    protected abstract void setD();
    
    protected abstract double getA();
    protected abstract double getB();
    protected abstract double getC();
    protected abstract double getD();
    
    protected abstract void tampil();
}
