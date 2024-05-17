public class Notebook extends Komputer implements Mouse, Keyboard, Printer {

    void hidupkan_OS() {
        System.out.println("Selamat Datang di Notebook");
    }

    void matikan_OS() {
        System.out.println("Notebook Telah di Nonaktifkan");
    }

    public void klik_kanan(){
        System.out.println("Anda Klik Kanan Mouse di Notebook");
    }

    public void klik_kiri(){
        System.out.println("Anda Klik Kiri Mouse di Notebook");
    }

    public void tekan_enter(){
        System.out.println("Anda Menekan Enter Pada Keyboard Notebook \n");
    }

    public void cetak_data(){
        klik_kanan();
        klik_kiri();
        tekan_enter();
    }
}
