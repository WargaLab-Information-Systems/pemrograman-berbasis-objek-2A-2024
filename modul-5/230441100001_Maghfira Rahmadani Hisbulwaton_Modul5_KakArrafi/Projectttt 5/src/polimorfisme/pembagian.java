package polimorfisme;

public class pembagian extends operasi {
    @Override
    protected void setD() {
        this.d = getA() / getB() / getC();
    }

    @Override
    protected void tampil() {
        System.out.println("Pembagian");
        System.out.println("Hasil A / B / C : " + getD());
    }
}
