
package pbo_praktikum1;

class manusia {
    String nama;
    int umur;
    
    public void berlari(){
        System.out.println("Objek ini berlari " + this.nama + "berlari");
    }
    void berjalan(){
        System.out.println("Objek ini berjalan " + this.nama + "berjalan");
    }
    
}

public class Main {
    public static void main(String[] args) {
        manusia orang1 = new manusia();
        manusia orang2 = new manusia();
        
        orang1.nama = "adid";
        orang1.umur = 19;
       
        System.out.println("nama objek 1 adalah " + orang1.nama);
        System.out.println("umur dari objek 1 adalah " + orang1.umur + " tahun ");
        
        orang2.nama = "yahya";
        orang2.umur = 10000000;
        System.out.println("nama objek 2 adalah " + orang2.nama);
        System.out.println("umur dari objek 2 adalah " + orang2.umur + " tahun ");
        System.out.println("Terimakasih");
        orang2.berjalan();
        orang2.berlari();
    }
    
}
