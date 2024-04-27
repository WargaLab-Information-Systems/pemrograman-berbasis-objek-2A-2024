package modul1.pbo;

import java.util.Scanner;
import java.math.BigInteger;

class Mahasiswa {
    String nama;
    BigInteger nim;
    String jurusan;
    String alamat;
}

public class modul1PBO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa orang1 = new Mahasiswa();
        
        // Meminta pengguna memasukkan data
        System.out.print("Masukkan nama : ");
        orang1.nama = scanner.nextLine();
        System.out.print("Masukkan nim : ");
        orang1.nim = new BigInteger(scanner.nextLine());
        System.out.print("Masukkan jurusan: ");
        orang1.jurusan = scanner.nextLine();
        System.out.print("Masukkan alamat : ");
        orang1.alamat = scanner.nextLine();
        
        // Menampilkan data mahasiswa yang dimasukkan
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + orang1.nama);
        System.out.println("NIM: " + orang1.nim);
        System.out.println("Jurusan: " + orang1.jurusan);
        System.out.println("Alamat: " + orang1.alamat);
    }
}
