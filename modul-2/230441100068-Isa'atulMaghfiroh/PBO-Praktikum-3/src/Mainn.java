import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String Univv;
    String nimm;
    String namaa;
    String alamatt;
    String jurusann;

//  nyim ob ma
//  mene im da pe
// OB    
    
    public Mahasiswa(String Univ, String nim, String nama, String alamat, String jurusan) {
        Univv = Univ;
        nimm = nim;
        namaa = nama;
        alamatt = alamat;
        jurusann = jurusan;
    }
//        mengakses nilai atribut
    public String getUniv() {
        return Univv;
    }
    
    public String getNim() {
        return nimm;
    }

    public String getNama() {
        return namaa;
    }

    public String getAlamat() {
        return alamatt;
    }

    public String getJurusan() {
        return jurusann;
    }
}
//  trima im da pe
//  nyim dat ma

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        String inputLagi;
        do {
            System.out.print("\nMasukkan UNIV: ");
            String Univ = input.next();
            input.nextLine();
            
            System.out.print("\nMasukkan NIM: ");
            String nim = input.next();
            input.nextLine(); // Clear the buffer

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = input.nextLine();

            System.out.println("Pilihan Jurusan:");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Kode Jurusan: ");
            String kodeJurusan = input.next();
            String jurusan;
//            if (kodeJurusan == "41"){
//                System.out.println("TEKNIK INFORMATIKA");
//            }
//            else if (kodeJurusan== "42"){
//                System.out.println("TEKNIK INDUSTRI");
//            }
//            else if (kodeJurusan== "43"){
//                System.out.println("TEKNIK ELEKTRO");
//            }
//            else if (kodeJurusan== "44"){
//                System.out.println("SISTEM INFORMASI");
//            }
//            else if (kodeJurusan== "48"){
//                System.out.println("TEKNIK MESIN");
//            }
//            else if (kodeJurusan== "49"){
//                System.out.println("TEKNIK MEKATRONIKA");
//            }
//            else {
//                System.out.println("Jurusan Tidak Valid");
//            }    
            switch (kodeJurusan) {
                case "41":
                    jurusan = "TEKNIK INFORMATIKA";
                    break;
                case "42":
                    jurusan = "TEKNIK INDUSTRI";
                    break;
                case "43":
                    jurusan = "TEKNIK ELEKTRO";
                    break;
                case "44":
                    jurusan = "SISTEM INFORMASI";
                    break;
                case "48":
                    jurusan = "TEKNIK MESIN";
                    break;
                case "49":
                    jurusan = "TEKNIK MEKATRONIKA";
                    break;
                default:
                    jurusan = "Jurusan tidak ada";
                    break;
            }
//            ditambah

            Mahasiswa mahasiswa = new Mahasiswa(Univ, nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = input.next();
        } while (inputLagi.equalsIgnoreCase("Y"));

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("UNIV: " + mahasiswa.getUniv());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }
    }
}