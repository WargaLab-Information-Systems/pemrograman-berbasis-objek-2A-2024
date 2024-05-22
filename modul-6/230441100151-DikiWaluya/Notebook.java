package modul6;

public class Notebook extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("------------------");
        System.out.println("    NOTEBOOK ON   ");
        System.out.println("------------------");
        System.out.println("OS dihidupkan");
    }

    @Override
    void matikan_os() {
        System.out.println("------------------");
        System.out.println("   NOTEBOOK OFF   ");
        System.out.println("------------------");
        System.out.println("OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("------------------");
        System.out.println("  NOTEBOOK CLICK  ");
        System.out.println("------------------");
        System.out.println("Klik kanan dilakukan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("------------------");
        System.out.println("  NOTEBOOK CLICK  ");
        System.out.println("------------------");
        System.out.println("Klik kiri dilakukan");
    }

    @Override
    public void tekan_enter() {
        System.out.println("------------------");
        System.out.println("  NOTEBOOK ENTER  ");
        System.out.println("------------------");
        System.out.println("Tombol enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("------------------");
        System.out.println("  NOTEBOOK PRINT  ");
        System.out.println("------------------");
        System.out.println("Mencetak data...");
    }
}
