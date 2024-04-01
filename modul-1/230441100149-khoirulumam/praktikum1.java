public class Manusia {
    String nama;
    int umur;
    String alamat;

    // Constructor dengan parameter nama
    public Manusia(String nama) {
        this.nama = nama;
        System.out.println("nama : " + nama);
    }

    // Constructor dengan parameter umur
    public Manusia(int umur) {
        this.umur = umur;
        System.out.println("umur : " + umur);
    }

    // Constructor dengan parameter alamat
    public Manusia(String alamat) {
        this.alamat = alamat;
        System.out.println("alamat : " + alamat);
    }

    // Method berjalan
    public void berjalan(String kecepatan) {
        System.out.println("Berjalan " + kecepatan);
    }

    // Method berlari
    public void berlari(String kecepatan) {
        System.out.println("Berlari " + kecepatan);
    }

    public static void main(String[] args) {
        // Membuat objek Manusia dengan nama "Umam"
        Manusia orang = new Manusia("Umam");
c:\Users\LENOVO\Downloads\LAPRES2_SMBD_C_220441100038_HUSNUL KHOTIMA2.docx
        // Memanggil method berjalan dan berlari
        orang.berjalan("lambat");
        orang.berlari("cepat");
    }
}
