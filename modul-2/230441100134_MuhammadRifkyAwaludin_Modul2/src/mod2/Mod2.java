import java.util.Scanner;

            //class
public class Mod2 {         //parameter
    public static void main(String[] args) {
        final int MAX_MAHASISWA = 100;    //class
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[MAX_MAHASISWA];
        int indexMahasiswa = 0;
        
        String[] jurusanArray = {
            "41-TEKNIK INFORMATIKA",
            "42-TEKNIK INDUSTRI",
            "43-TEKNIK ELEKTRO",
            "44-SISTEM INFORMASI",
            "48-TEKNIK MESIN",
            "49-TEKNIK MEKATRONIKA"
        };
        System.out.println("=================================");
        System.out.println("         FAKULTAS & PRODI");
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;
        
        while (lanjut) {
            for (String jur : jurusanArray) {
                System.out.println(jur);
            }
            System.out.println("=================================");
            System.out.println();
            System.out.println("Silahkan Masukkan Biodata Anda");
            System.out.print("Masukkan UNIVERSITAS : ");
            String univ = scanner.nextLine();
            System.out.print("Masukkan NIM         : ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama        : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat      : ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Jurusan     : ");
            String jurusanInput = scanner.nextLine();
            System.out.println("=================================");
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
            System.out.println("UNIVERSITAS : " + mahasiswa.getUniv());
            System.out.println("NIM         : " + mahasiswa.getNim());
            System.out.println("Nama        : " + mahasiswa.getNama());
            System.out.println("Alamat      : " + mahasiswa.getAlamat());
            System.out.println("Jurusan     : " + mahasiswa.getJurusan());
            System.out.println("======================================");
            System.out.println();
        }
    }
                        //class
    public static class Mahasiswa {
        private String univ;
        private String nim;
        private String nama;        //attribut
        private String alamat;
        private String jurusan;
        
               //constructor
        public Mahasiswa(String univ,String nim, String nama, String alamat, String jurusan) {
            this.univ = univ;
            this.nim = nim;
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

