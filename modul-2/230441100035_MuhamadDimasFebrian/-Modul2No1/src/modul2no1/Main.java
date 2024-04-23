package modul2no1;
import java.util.Scanner;

class Universitas {
    static String nama_universitas;

    static void setNamaUniversitas(String iniUniversitas) {
        nama_universitas = iniUniversitas; 
    }

    static String getNamaUniversitas() {
        return nama_universitas;
    }

    static void selesai() {
        System.out.println("Program Selesai");
    }
}

class Mahasiswa {
    String Nama, NIM, Alamat;

    Mahasiswa(String Nama, String NIM, String Alamat, int Prodi) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Alamat = Alamat;
        Prodi(Prodi);
    }

    void Prodi(int Prodi) {
        if (Prodi == 41) {
            System.out.println("Prodi : Teknik Informatika");
        } else if (Prodi == 42) {
            System.out.println("Prodi : Teknik Industri");
        } else if (Prodi == 43) {
            System.out.println("Prodi : Teknik Elektro");
        } else if (Prodi == 44) {
            System.out.println("Prodi : Sistem Informasi");
        } else if (Prodi == 48) {
            System.out.println("Prodi : Teknik Mesin");
        } else if (Prodi == 49) {
            System.out.println("Prodi : Teknik Mekatronika");
        } else {
            System.out.println("Tidak Ditemukan Kode Prodi Yang Anda Maksud");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char inputan_ulang, ulangi = 'Y';

        System.out.println("Masukkan Nama Dari Universitas Anda : ");
        String namaUniv = input.nextLine();
        Universitas.setNamaUniversitas(namaUniv);

        while (ulangi == 'Y') {
            System.out.println("Masukkan data mahasiswa:");
            System.out.println("Universitas : " + Universitas.getNamaUniversitas());
            System.out.println("Nama :");
            String nama = input.nextLine();
            System.out.println("NIM : ");
            String nim = input.nextLine();
            System.out.println("Alamat : ");
            String alamat = input.nextLine();
            System.out.println("Kode Prodi : ");
            System.out.println("   41 = Teknik Informatika");
            System.out.println("   42 = Teknik Industri");
            System.out.println("   43 = Teknik Elektro");
            System.out.println("   44 = Sistem Informasi");
            System.out.println("   48 = Teknik Mesin");
            System.out.println("   49 = Teknik Mekatronika");
            int prodi = input.nextInt();

            Mahasiswa mhs = new Mahasiswa(nama, nim, alamat, prodi);

            System.out.println("\nData Mahasiswa!");
            System.out.println("Universitas : " + Universitas.getNamaUniversitas());
            System.out.println("Nama: " + mhs.Nama);
            System.out.println("NIM: " + mhs.NIM);
            System.out.println("Alamat: " + mhs.Alamat);
            
            mhs.Prodi(prodi);

            System.out.println("Ingin Mengulangi Inputan?");
            inputan_ulang = input.next().charAt(0);
            if (inputan_ulang != 'Y') {
                ulangi = 'N';
            } 
            else {
                input.nextLine();
            }

        }
        Universitas.selesai();
    }
}
