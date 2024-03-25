package pkg230441100058;

class Manusia {
    String nama;
    int umur;
    String alamat;
        public void berlari(){
        System.out.println("Objek ini " + this.nama + "berlari");
    }
        public void berjalan(){
        System.out.println("Objek ini " + this.nama + "berjalan");
    }
}
public class Main {

    public static void main(String[] args) {

        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Riyyan";
        orang1.umur = 20;
        orang1.alamat = "Tuban";
        System.out.println("Nama Objek 1 adalah" + orang1.nama);
        System.out.println("Alamat Objek 1 adalah" + orang1.alamat);
        System.out.println("Umur Objek 1 adalah" + orang1.umur + "Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");
        
        orang2.nama ="Bintang";
        orang2.umur =19;
        orang2.alamat = "Pasuruan";
        System.out.println("Nama Objek 2 adalah" + orang2.nama);
        System.out.println("Alamat Objek 2 adalah" + orang2.alamat);
        System.out.println("Umur Objek 2 adalah" + orang2.umur + "Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
    
}
