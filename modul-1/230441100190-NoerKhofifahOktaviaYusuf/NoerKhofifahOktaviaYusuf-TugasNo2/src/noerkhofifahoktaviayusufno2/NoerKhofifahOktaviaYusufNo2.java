package noerkhofifahoktaviayusufno2;
import java.util.Scanner;

public class NoerKhofifahOktaviaYusufNo2 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String NAMA, PRODI, ALAMAT;
        long NIM;

        
        System.out.print("INPUT NAMA : ");
        NAMA = input.nextLine();
        
        System.out.print("INPUT PRODI : ");
        PRODI = input.nextLine();
        
        System.out.print("INPUT ALAMAT : ");
        ALAMAT = input.nextLine();
        
        System.out.print("INPUT NIM : ");
        NIM = input.nextLong();
        
        System.out.println("========================");
        System.out.println(NAMA+ " berasal dari "+ALAMAT );
        System.out.println(" Prodi S1 "+PRODI);
        System.out.println(" dengan Nim "+NIM);
    }
    
}
