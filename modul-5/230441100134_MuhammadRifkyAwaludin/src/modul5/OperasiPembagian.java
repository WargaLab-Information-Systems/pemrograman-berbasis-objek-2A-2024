package modul5;

public class OperasiPembagian  extends OperasiBilangan {
    @Override
    protected void setA(double a) {
        this.a = a;
    }
    @Override
    protected void setB(double b) {
        this.b = b;
    }
    @Override
    protected void setC(double c) {
        this.c = c;
    }
    @Override
    protected void setD() {
      this.d = a/b/c;  
    }
    @Override
    protected double getA() {
        return a;
    }
    @Override
    protected double getB() {
        return b;
    }
    @Override
    protected double getC() {
        return c;
    }
    @Override
    protected double getD() {
        return d;
    }
    @Override
    protected void tampil() {
        System.out.println("---------------------------------");
        System.out.println("Pembagian");
        System.out.println("Bilangan A       :"+getA());
        System.out.println("Bilangan B       :"+getB());
        System.out.println("Bilangan C       :"+getC());
        System.out.println("Hasil A : B : C  :"+getD());
        System.out.println("---------------------------------");
    }
}

