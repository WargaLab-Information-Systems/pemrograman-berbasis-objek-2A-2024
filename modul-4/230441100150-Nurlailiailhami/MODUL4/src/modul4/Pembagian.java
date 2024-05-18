
package modul4;

public class Pembagian extends OperasiMatematika {
    @Override
    double hitung() {
        if (bilanganB != 0) {
            return bilanganA / bilanganB;
        } else {
            System.out.println("Pembagian dengan nol tidak bisa dilakukan.");
            return Double.NaN;
        }
    }
}
