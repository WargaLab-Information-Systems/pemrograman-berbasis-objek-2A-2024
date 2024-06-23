package komputer;

class PC extends Komputer implements Keyboard, Mouse, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("hidupkan PC");
    }
    @Override
    void hidupkan_os(String OSname) {
        System.out.println("user menghidupkan PC dengan menggunakan "+OSname);
    }    
    @Override
    void matikan_os() {
        System.out.println("matikan PC");
    }    
    @Override
    void matikan_os(String OS) {
        System.out.println("user menonaktifkan PC "+OS);
    }
    @Override
    public void klikKiri() {
        System.out.println("klik kiri PC");
    }
    @Override
    public void klikKanan() {
        System.out.println("klik kanan PC");
    }
    @Override
    public void tekanEnter() {
        System.out.println("tekan enter pada PC");
    }
    @Override
    public void cetakData() {
        System.out.println("print dari PC");
    }
}
