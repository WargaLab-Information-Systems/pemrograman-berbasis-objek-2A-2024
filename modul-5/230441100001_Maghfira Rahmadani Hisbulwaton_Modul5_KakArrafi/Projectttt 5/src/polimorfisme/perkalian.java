package polimorfisme;

public class perkalian extends operasi {
    @Override
    protected void setD() {
        this.d = getA() * getB() * getC();
    }

    @Override
    protected void tampil() {
        System.out.println("Perkalian");
        System.out.println("Hasil A * B * C : " + getD());
    }
}
