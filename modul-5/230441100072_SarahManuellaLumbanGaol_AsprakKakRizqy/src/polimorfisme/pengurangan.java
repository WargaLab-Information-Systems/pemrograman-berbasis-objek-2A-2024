package polimorfisme;

public class pengurangan extends operasi {
    @Override
    protected void setD() {
        this.d = getA() - getB() - getC();
    }

    @Override
    protected void tampil() {
        System.out.println("Pengurangan");
        System.out.println("Hasil A - B - C : " + getD());
    }
}
