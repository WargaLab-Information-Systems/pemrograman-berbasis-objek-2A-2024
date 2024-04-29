/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Universitas : ");
        String namaUniversitas = input.next();
        hal2.setNamaUniversitas(namaUniversitas);
        
        ArrayList<hal1> daftarMahasiswa = new ArrayList<>();
        
        char kelas;
        do {
            System.out.println("Masukkan data mahasiswa : ");
            System.out.print("Nama :");
            String nama = input.next();
            input.nextLine();
            System.out.print("NIM : ");
            String nim = input.nextLine();
            System.out.print("Alamat : ");
            String alamat = input.nextLine();
            System.out.println("Pilih Jurusan : ");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (41-49) : ");
            int jurusan = input.nextInt();
            hal1 mahasiswa = new hal1(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);
            System.out.println("Apakah anda ingin memsukkan data lagi? (Y/T)");
            kelas = input.next().charAt(0);            
        } while (kelas == 'Y' || kelas == 'y');
        
        System.out.println("\nDaftar Mahasiswa di " + hal2.getNamaUniversitas()+ ":");
        for (hal1 m : daftarMahasiswa){
            System.out.println("Nama : "+m.getNama());
            System.out.println("NIM : "+m.getNim());
            System.out.println("Alamat : "+m.getAlamat());
            System.out.println("Jurusan : "+ getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }
    private static String getJurusanString(int jurusan) {
        return switch (jurusan) {
            case 41 -> "Teknik Informatika";
            case 42 -> "Teknik Industri";
            case 43 -> "Teknik Elektro";
            case 44 -> "Sistem Informasi";
            case 48 -> "Teknik Mesin";
            case 49 -> "Teknik Mekatronika";
            default -> "Jurusan tidak valid";
        };
    }
}
