package modul1.soal2;
import java.util.Scanner;

class Modul1Soal2 {
    public static void main(String[] args) {
        String nama,alamat,prodi;
        long nim;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda:");
        nama = input.nextLine();
        System.out.print("Masukkan alamat anda:");
        alamat = input.nextLine();
        System.out.print("Masukkan prodi anda:");
        prodi = input.nextLine();
        System.out.print("Masukkan nim anda:");
        nim = input.nextLong();
        
        input.nextLine();
        System.out.println("nama anda " + nama + " alamat anda " + alamat + " prodi anda " + prodi + " nim anda " + nim);
    }
    
}
