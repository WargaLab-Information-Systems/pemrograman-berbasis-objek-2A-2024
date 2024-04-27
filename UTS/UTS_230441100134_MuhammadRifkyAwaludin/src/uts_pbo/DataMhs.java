package uts_pbo;
import java.util.Scanner;

public class DataMhs {
    public static void main(String[] args) {
        final int MAX_MAHASISWA = 100; 
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[MAX_MAHASISWA];
        int indexMahasiswa = 0;
        
        String[] jurusanArray = {
"SI = Sistem Informasi,\n" +
"TIF = Teknik Informatika,\n" +
"TI = Teknik Industri,\n" +
"TM = Teknik Mesin,\n" +
"TMK = Teknik Mekatronika,\n" +
"TE = Teknik Elektronika"};

        System.out.println("         DATA MAHASISWA          ");
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;
        
        while (lanjut) {
            for (String jur : jurusanArray) {
                System.out.println(jur);
            }
            System.out.println();
            System.out.println("Silahkan Masukkan Biodata Anda");
            System.out.print("Masukkan ASAL SEKOLAH : ");
            String univ = scanner.nextLine();
            System.out.print("Masukkan NIM         : ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama        : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat      : ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Jurusan     : ");
            String jurusanInput = scanner.nextLine();
            System.out.println();

            int index = Integer.parseInt(jurusanInput.substring(0, 2)) - 41;
            if (index >= 0 && index < jurusanArray.length) {
                String jurusanDisplay = jurusanArray[index].substring(3);
                Mahasiswa mhs = new Mahasiswa(univ, nim, nama, alamat, jurusanDisplay);
                daftarMahasiswa[indexMahasiswa] = mhs;
                indexMahasiswa++;
            } else {
                System.out.println("Jurusan tidak valid.");
            }

            System.out.print("Apakah ingin memasukkan data lagi? (Y/T): ");
            String jawaban = scanner.nextLine();
            lanjut = jawaban.equalsIgnoreCase("Y");
        }

        for (int i = 0; i < indexMahasiswa; i++) {
            Mahasiswa mahasiswa = daftarMahasiswa[i];
            System.out.println("======================================");
            System.out.println("ASAL SEKOLAH : " + mahasiswa.getAsal());
            System.out.println("NIM          : " + mahasiswa.getNim());
            System.out.println("Nama         : " + mahasiswa.getNama());
            System.out.println("Alamat       : " + mahasiswa.getAlamat());
            System.out.println("Jurusan      : " + mahasiswa.getJurusan());
            System.out.println("======================================");
            System.out.println();
        }
    }
    
    public static class Mahasiswa {
        private String asal;
        private String nim;
        private String nama;     
        private String alamat;
        private String jurusan;
        
               //constructor
        public Mahasiswa(String asal,String nim, String nama, String alamat, String jurusan) {
            this.asal = ;
            this.nim = asal;
            this.nama = nama;
            this.alamat = alamat;
            this.jurusan = jurusan;
        }

        public String getUniv() {
            return univ;
        }

        public String getNim() {
            return nim;
        }

        public String getNama() {
            return nama;
        }

        public String getAlamat() {
            return alamat;
        }

        public String getJurusan() {
            return jurusan;
        }
    }
}

