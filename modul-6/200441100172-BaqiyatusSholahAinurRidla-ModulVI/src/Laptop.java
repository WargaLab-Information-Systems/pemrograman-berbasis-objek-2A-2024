public class Laptop extends Komputer implements Mouse, Keyboard, Printer {

    void hidupkan_OS() {
        System.out.println("Selamat Datang di Laptop");
    }

    void matikan_OS() {
        System.out.println("Laptop Telah di Nonaktifkan");
    }

    public void klik_kanan(){
        System.out.println("Anda Klik Kanan Mouse di Laptop");
    }

    public void klik_kiri(){
        System.out.println("Anda Klik Kiri Mouse di Laptop");
    }

    public void tekan_enter(){
        System.out.println("Anda Menekan Enter Pada Keyboard Laptop \n");
    }

    public void cetak_data(){
        klik_kanan();
        klik_kiri();
        tekan_enter();
    }
}
