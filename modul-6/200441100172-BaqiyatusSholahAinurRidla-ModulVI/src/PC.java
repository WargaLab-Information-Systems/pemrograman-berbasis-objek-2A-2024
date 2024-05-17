public class PC extends Komputer implements Mouse, Keyboard, Printer {

    void hidupkan_OS() {
        System.out.println("Selamat Datang di PC");
    }

    void matikan_OS() {
        System.out.println("PC Telah di Nonaktifkan");
    }

    public void klik_kanan(){
        System.out.println("Anda Klik Kanan Mouse di PC");
    }

    public void klik_kiri(){
        System.out.println("Anda Klik Kiri Mouse di PC");
    }

    public void tekan_enter(){
        System.out.println("Anda Menekan Enter Pada Keyboard PC \n");
    }

    public void cetak_data(){
        klik_kanan();
        klik_kiri();
        tekan_enter();
    }
}
