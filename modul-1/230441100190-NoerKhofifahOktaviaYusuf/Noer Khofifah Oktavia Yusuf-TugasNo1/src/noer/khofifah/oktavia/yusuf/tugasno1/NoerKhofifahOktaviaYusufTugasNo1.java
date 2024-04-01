package noer.khofifah.oktavia.yusuf.tugasno1;

class Manusia { 
    String nama; 
    int umur;
    String alamat;
  public void berlari(){ 
      System.out.println("objek ini berlari");
  } 
  
  void berjalan() {
      System.out.println("objek ini berjalan");
      
  }
}
public class NoerKhofifahOktaviaYusufTugasNo1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "novi ";
        orang1.umur = 20;
        orang1.alamat ="pamekasan";
        System.out.print("nama objek 1 adalah " + orang1.nama);
        System.out.println("umur objek 1 adalah " + orang1.umur +"Tahun");
        System.out.println("alamat objek 1 adalah " + orang1.alamat);
        System.out.println("Thank you");
        orang1.berjalan ();
        orang1.berlari ();
        
        orang2.nama ="alif ";
        orang2.umur = 2;
        orang2.alamat ="jakarta";
        System.out.print("nama objek 2 adalah " + orang2.nama);
        System.out.print(" umur objek 2 adalah " + orang2.umur +"Tahun");
        System.out.println(" alamat objek 2 adalah " + orang2.alamat);
        System.out.println("Thank you");
        orang2.berjalan ();
        orang2.berlari ();
        
        
    }
}

