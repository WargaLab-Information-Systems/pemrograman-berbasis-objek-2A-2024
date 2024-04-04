package pbo.praktikum.pkg1;
import java.util.Scanner;

class Manusia{
    String nama, alamat;
    int umur; 
    public void berlari(){
        System.out.println("Objek ini " + this.nama + " Berlari");
    }
    void berjalan(){
        System.out.println("Objek ini " + this.nama + " Berjalan");
    }
}
public class PboPraktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        System.out.print("Masukkan Nama orang 1: ");
        orang1.nama=input.nextLine();
        
        System.out.print("Masukkan umur orang 1: ");
        orang1.umur=input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Alamat orang 1: ");
        orang1.alamat=input.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("Orang pertama bernama " + orang1.nama);
        System.out.println("Orang pertama beralamat di " + orang1.alamat);
        System.out.println("Orang pertama berumur " + orang1.umur + " Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terima kasih");
        
        System.out.println("---------------------------------------------");
        
        orang2.nama="jadid";
        orang2.umur=50;
        orang2.alamat="Sampang";
        System.out.println("Orang kedua bernama " + orang2.nama);
        System.out.println("Orang kedua beralamat di " + orang2.alamat);
        System.out.println("Orang kedua berumur " + orang2.umur + " Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terima Kasih");   
    }
}