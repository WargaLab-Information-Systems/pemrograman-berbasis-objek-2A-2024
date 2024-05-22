package modul6;
public class Laptop extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("----------------");
        System.out.println("   LAPTOP ON    ");
        System.out.println("----------------");
        System.out.println("Menyalakan sistem operasi...");
    }

    @Override
    void matikan_os() {
        System.out.println("----------------");
        System.out.println("   LAPTOP OFF   ");
        System.out.println("----------------");
        System.out.println("Mematikan sistem operasi...");
    }

    @Override
    public void klik_kanan() {
        System.out.println("----------------");
        System.out.println("   LAPTOP CLICK ");
        System.out.println("----------------");
        System.out.println("Klik kanan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("----------------");
        System.out.println("   LAPTOP CLICK ");
        System.out.println("----------------");
        System.out.println("Klik kiri mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("----------------");
        System.out.println("  LAPTOP ENTER  ");
        System.out.println("----------------");    
        System.out.println("Tombol enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("----------------");
        System.out.println("   LAPTOP PRINT ");
        System.out.println("----------------");
        System.out.println("Mencetak data...");
    }
}
