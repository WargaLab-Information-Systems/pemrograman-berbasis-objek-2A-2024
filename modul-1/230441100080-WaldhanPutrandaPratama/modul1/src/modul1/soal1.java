package modul1;

class manusia {
    String nama;
    String umur;
    String alamat;

    public void  berlari() {
        System.out.println("Saya bisa berlari");
    }

    public  void berjalan() {
        System.out.println("Saya bisa berjalan");
    }

    public void alamat() {
        System.out.println("Alamat saya: " + alamat);
    }
}

public class soal1 {
    public static void main(String[] args) {
        manusia orang1 = new manusia();
        manusia orang2 = new manusia();

        orang1.nama = "Waldhan Putranda Pratama";
        orang1.umur = "18 tahun";
        orang1.alamat = "Depok";

        System.out.println("Nama: " + orang1.nama);
        System.out.println("Umur: " + orang1.umur);
        System.out.println("Alamat: " + orang1.alamat);

        orang1.berjalan();
        orang1.berlari();
       
        
        
        orang2.nama = "Mutiara Aura Ramadhan";
        orang2.umur = "18 tahun";
        orang2.alamat = "Depok";

        System.out.println("Nama: " + orang2.nama);
        System.out.println("Umur: " + orang2.umur);
        System.out.println("Alamat: " + orang2.alamat);

        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}
