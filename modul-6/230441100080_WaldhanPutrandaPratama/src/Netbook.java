public class Netbook extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Netbook: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("Netbook: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Netbook: Klik kanan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook: Klik kiri mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Netbook: Tekan enter pada keyboard");
    }

    @Override
    public void cetak_data() {
        System.out.println("Netbook: Cetak data");
    }
}
