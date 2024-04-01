package pratikum1;

    class manusia {
    String nama;
    String umur;
    String alamat;
    public void berlari(){
        System.out.println("dan saya bisa" + " berlari ");
     }
    public void berjalan(){
        System.out.println("saya bisa" + " berjalan ");
     }
    public void alamat(){  
         System.out.println("alamat saya" + " pamekasan ");
     }
    }

public class Main {
    
    public static void main(String[] args) {
          manusia orang1 = new manusia();
  
        orang1.nama ="Dio Ramadhani pratama p";
        orang1.umur ="19tahun";
        orang1.alamat ="pamekasan";
        System.out.println("Nama: " + orang1.nama);
        System.out.println("Umur: " + orang1.umur);
        System.out.println("Alamat: " + orang1.alamat);


        orang1.berjalan();
        orang1.berlari();
        orang1.alamat();
      
        System.out.println("terimakasih");
        
        

    }
    
}
