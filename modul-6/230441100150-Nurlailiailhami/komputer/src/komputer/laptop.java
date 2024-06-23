package komputer;

class laptop extends Komputer  implements Keyboard, Mouse, Printer {
    @Override
    void hidupkan_os() {
        System.out.println("hidupkan laptop");
    }
    @Override
    void hidupkan_os(String OSname) {
        System.out.println("user menghidupkan laptop dengan menggunakan "+OSname);
    }    
    @Override
    void matikan_os() {
        System.out.println("matikan laptop");
    }    
    @Override
    void matikan_os(String OS) {
        System.out.println("user menonaktifkan perangkat laptop "+OS);
    }
    @Override
    public void klikKiri() {
        System.out.println("klik kiri laptop");
    }
    @Override
    public void klikKanan() {
        System.out.println("klik kanan laptop");
    }
    @Override
    public void tekanEnter() {
        System.out.println("tekan enter pada laptop");
    }
    @Override
    public void cetakData() {
        System.out.println("print dari laptop");
    }
}
