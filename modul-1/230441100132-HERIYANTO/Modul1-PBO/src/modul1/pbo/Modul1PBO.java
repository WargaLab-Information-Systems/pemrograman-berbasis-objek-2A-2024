package modul1.pbo; 

class manusia {
    String nama;
    int umur;
    String alamatku;
    
    public void berlari() {
        System.out.println( nama + " sedang berlari" );
    }
    
    public void berjalan() {
        System.out.println( nama + " sedang berjalan" );
    }
}

public class Modul1PBO {
    public static void main(String[] args) {
        manusia orang = new manusia();
        orang.nama = "Harry";
        orang.umur = 20;
        orang.alamatku = "Bangkalan";
        
        // Menampilkan data orang
        System.out.println("Nama: " + orang.nama);
        System.out.println("Umur: " + orang.umur);
        System.out.println("Alamat: " + orang.alamatku);
        orang.berjalan();
    }
}