package komputer;

class Netbook extends Komputer implements Keyboard, Mouse, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("hidupkan notebook");
    }
    @Override
    void hidupkan_os(String OSname) {
        System.out.println("user menghidupkan notebook dengan menggunakan "+OSname);
    }    
    @Override
    void matikan_os() {
        System.out.println("matikan notebook");
    }    
    @Override
    void matikan_os(String OS) {
        System.out.println("user menonaktifkan notebook "+OS);
    }
    @Override
    public void klikKiri() {
        System.out.println("klik kiri notebook");
    }
    @Override
    public void klikKanan() {
        System.out.println("klik kanan notebook");
    }
    @Override
    public void tekanEnter() {
        System.out.println("tekan enter pada notebook.");
    }
    @Override
    public void cetakData() {
        System.out.println("print dari notebook");
    }
}
