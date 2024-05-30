public class Notebook extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("\n*** OS Notebook dihidupkan ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    void matikan_os() {
        System.out.println("\n*** OS Notebook dimatikan ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void klik_kanan() {
        System.out.println("\n*** Klik Kanan pada Notebook ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void klik_kiri() {
        System.out.println("\n*** Klik Kiri pada Notebook ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void tekan_enter() {
        System.out.println("\n*** Enter ditekan pada Notebook ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void cetak_data() {
        System.out.println("\n*** Cetak data dari Notebook ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}


