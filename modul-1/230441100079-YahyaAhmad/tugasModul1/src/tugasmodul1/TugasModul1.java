package tugasmodul1;
import java.util.Scanner;

public class TugasModul1 {
    public static void main(String[] args) {
        String nama,prodi, alamat;
        long nim;
        Scanner input = new Scanner(System.in);  
        
        System.out.print("Masukkan Nama Anda = ");
        nama = input.nextLine();
        System.out.print("Masukkan Prodi Anda = ");
        prodi = input.nextLine();
        System.out.print("Masukkan Nim Anda = ");
        nim = input.nextLong();
        
        input.nextLine();
        System.out.print("Masukkan alamat Anda = ");
        alamat = input.nextLine();
        
        
        System.out.println("Nama" + nama + " Prodi " + prodi + " dengan NIM " + nim + " dan beralamat di " + alamat);
    }
    
}
