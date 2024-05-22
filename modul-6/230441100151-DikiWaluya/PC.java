package modul6;
public class PC extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("------------------");
        System.out.println("       PC ON      ");
        System.out.println("------------------");
        System.out.println("Sistem operasi dihidupkan");
    }

    @Override
    void matikan_os() {
        System.out.println("------------------");
        System.out.println("      PC OFF      ");
        System.out.println("------------------");
        System.out.println("Sistem operasi dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("------------------");
        System.out.println("     PC MOUSE     ");
        System.out.println("------------------");
        System.out.println("Klik kanan dilakukan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("------------------");
        System.out.println("     PC MOUSE     ");
        System.out.println("------------------");
        System.out.println("Klik kiri dilakukan");
    }

    @Override
    public void tekan_enter() {
        System.out.println("------------------");
        System.out.println("     PC ENTER     ");
        System.out.println("------------------");
        System.out.println("Tombol enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("------------------");
        System.out.println("    PC PRINTER    ");
        System.out.println("------------------");
        System.out.println("Data dicetak");
    }
}
