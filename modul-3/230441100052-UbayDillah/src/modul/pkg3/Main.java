package modul.pkg3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama Perpustakaan: ");
        String namaPerpustakaan = scanner.nextLine();
        Perpustakaan.setNamaPerpustakaan(namaPerpustakaan);
        

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int X = scanner.nextInt();
        scanner.nextLine();

        AplikasiPerpustakaan aplikasi = new AplikasiPerpustakaan();

        for (int i = 0; i < X; i++) {
            aplikasi.tambahBuku();
        }
        
        aplikasi.daftarSemuaBuku();
    }
}




