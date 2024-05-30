public class PC extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("\nOS PC dihidupkan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    void matikan_os() {
        System.out.println("\n*** OS PC dimatikan ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void klik_kanan() {
        System.out.println("\n*** Klik Kanan pada PC ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void klik_kiri() {
        System.out.println("\n*** Klik Kiri pada PC ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void tekan_enter() {
        System.out.println("\n*** Enter ditekan pada PC ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    @Override
    public void cetak_data() {
        System.out.println("\n ***Cetak data dari PC ***");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

