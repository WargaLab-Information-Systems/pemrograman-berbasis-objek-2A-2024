package modul2pbo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        AKU.setNamaUniversitas(namaUniversitas);

        ArrayList<AKU> daftarMahasiswa = new ArrayList<>();
 
        char lagi;
        do {
            System.out.println("Masukkan Data Mahasiswa:");
            System.out.print("Nama: ");
            String nama = scanner.next();
            scanner .nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Pilih Jurusan : ");
            System.out.println("01 = TEKNIK INFORMATIKA");
            System.out.println("02 = TEKNIK INDUSTRI");
            System.out.println("03 = TEKNIK ELEKTRO");
            System.out.println("04 = SISTEM INFORMASI");
            System.out.println("05 = TEKNIK MESIN");
            System.out.println("06 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (01-06): ");
            int jurusan = scanner.nextInt();

            AKU mahasiswa = new AKU(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y/T)");
            lagi = scanner.next().charAt(0);
        } while (lagi == 'Y' || lagi == 'y');

        System.out.println("\nDaftar Mahasiswa di " + AKU.getNamaUniversitas() + ":");
        for (AKU m : daftarMahasiswa) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("Alamat: " + m.getAlamat());
            System.out.println("Jurusan: " + AKU.getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }
}

class AKU {
    private static String namaUniversitas;
    private String nim;
    private String nama;
    private String alamat;
    private int jurusan;

    public AKU(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }
    
    public static void setNamaUniversitas(String namaUniversitas) {
        AKU.namaUniversitas = namaUniversitas;
    }
        
    public static String getNamaUniversitas() {
        return namaUniversitas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }
    public int getJurusan() {
        return jurusan;
    }

    public static String getJurusanString(int jurusan) {
    if (jurusan == 01) {
        return "Teknik Informatika";
    } else if (jurusan == 02) {
        return "Teknik Industri";
    } else if (jurusan == 03) {
        return "Teknik Elektro";
    } else if (jurusan == 04) {
        return "Sistem Informasi";
    } else if (jurusan == 05) {
        return "Teknik Mesin";
    } else if (jurusan == 06) {
        return "Teknik Mekatronika";
    } else {
        return "Jurusan tidak valid";
    }
    }
}