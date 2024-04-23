package modul_2;
import java.util.ArrayList;
import java.util.Scanner;

class universitas{
    private static String namaUniversitas;

    public static void setNamaUniversitas(String nama){
        namaUniversitas = nama;        
    }
    public static String getNamaUniversitas(){
        return namaUniversitas;
    }
}

class Mahasiswa {
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
    
    private String getJurusan(String kodeJurusan) {
        switch (kodeJurusan) {
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
                return "UNKNOWN";
        }
    }
    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Alamat: " + alamat + ", Jurusan: " + getJurusan(jurusan);
    }
    
}

public class Modul_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // Memasukkan Nama Universitas
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        universitas.setNamaUniversitas(namaUniversitas);
        
        char ulangi;
        do {
            // Memasukkan data mahasiswa
            System.out.println("Masukkan Data Mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Jurusan: ");
            String jurusan = scanner.nextLine();

            // Membuat objek Mahasiswa dan menambahkannya ke daftarMahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            ulangi = scanner.next().charAt(0);
            scanner.nextLine(); // Membersihkan buffer
        } while (ulangi == 'Y' || ulangi == 'y');
        
        // Menampilkan daftar Mahasiswa
        System.out.println("\nDaftar Mahasiswa di " + universitas.getNamaUniversitas() + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa);
        }
    }
}
