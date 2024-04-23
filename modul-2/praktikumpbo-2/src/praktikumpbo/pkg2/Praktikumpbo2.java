/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpbo.pkg2;
import java.util.ArrayList;
import java.util.Scanner;

class Universitas {
    //static digunakan untuk mengakses class/method tanpa harus membuat objek
    private static String namaUniversitas = "";

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    public static String UniversitasTrunojoyoMadura() {
        return namaUniversitas;
    }
}

class Mahasiswa extends Universitas {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void displayData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + getJurusanName());
    }

    private String getJurusanName() {
        switch (jurusan) {
            case "41":
                return "TEKNIK INFORMATIKA";
            case "42":
                return "TEKNIK INDUSTRI";
            case "43":
                return "TEKNIK ELEKTRO";
            case "44":
                return "SISTEM INFORMASI";
            case "48":
                return "TEKNIK MESIN";
            case "49":
                return "TEKNIK MEKATRONIKA";
            default:
                return "Jurusan tidak valid";
        }
    }
}

/**
 *
 * @author ASUS
 */
public class Praktikumpbo2 {
     public static ArrayList<Mahasiswa> inputData() {
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            
            System.out.println("Pilihan Jurusan");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
         
            System.out.print("Masukkan Kode Jurusan : ");
            String jurusan = scanner.nextLine();
            
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            dataMahasiswa.add(mahasiswa);
            System.out.println();
            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("Y")) {
                break;
            }
        }
        return dataMahasiswa;
    }

    public static void main(String[] args) {
        Universitas.setNamaUniversitas("Universitas Trunojoyo Madura");
        ArrayList<Mahasiswa> dataMahasiswa = inputData();
        
        System.out.println("\nDaftar Mahasiswa di " + Universitas.UniversitasTrunojoyoMadura());
        for (Mahasiswa mahasiswa : dataMahasiswa) {
            System.out.println();
            mahasiswa.displayData();
        }
    }
}
