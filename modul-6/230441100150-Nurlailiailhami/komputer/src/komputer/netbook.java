package komputer;

class netbook extends Komputer {
    @Override
    void hidupkan_os() {
        System.out.println("hidupkan netbook");
    }
    @Override
    void hidupkan_os(String OSname) {
        System.out.println("user menghidupkan netbook dengan menggunakan " + OSname);
    }    
    @Override
    void matikan_os() {
        System.out.println("matikan netbook");
    }    
    @Override
    void matikan_os(String OS) {
        System.out.println("user menonaktifkan netbook " + OS);
    }
    @Override
    public void klikKiri() {
        System.out.println("klik kiri netbook");
    }
    @Override
    public void klikKanan() {
        System.out.println("klik kanan netbook");
    }
    @Override
    public void tekanEnter() {
        System.out.println("tekan enter pada netbook.");
    }
    @Override
    public void cetakData() {
        System.out.println("print dari netbook");
    }
}
