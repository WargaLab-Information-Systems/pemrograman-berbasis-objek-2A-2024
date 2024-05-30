package polimorfisme;

public class penjumlahan extends operasi {
    @Override
    protected void setD() {
        this.d = getA() + getB() + getC();
    }

    @Override
    protected void tampil() {
        System.out.println("Penjumlahan");
        System.out.println("Hasil A + B + C : " + getD());
    }
}
