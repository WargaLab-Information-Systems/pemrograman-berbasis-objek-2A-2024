package projek.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean jalan;
        jalan = true;
        Scanner masukan = new Scanner(System.in);
        while (jalan == true) {
            String inputUniv, inputNama, inputNIM, inputAlamat;
            char jawab;
            int inputProdi;
            System.out.print("Masukkan Universitas Anda : ");
            inputUniv = masukan.next();
            System.out.print("Masukkan Nama Anda : ");
            inputNama = masukan.next();
            System.out.print("Masukkan NIM Anda : ");
            inputNIM = masukan.next();
            System.out.print("Masukkan Alamat Anda : ");
            inputAlamat = masukan.next();
            System.out.println("41 = Teknik Informatika");
            System.out.println("42 = Teknik Industri");
            System.out.println("43 = Teknik Elektro");
            System.out.println("44 = Sistem Informasi");
            System.out.println("48 = Teknik Mesin");
            System.out.println("49 = Teknik Mekatronika");
            System.out.print("Masukkan Prodi Anda (dalam kode angka) : ");
            inputProdi = masukan.nextInt();
            Mahasiswa mahasiswa1 = new Mahasiswa(inputNama, inputNIM, inputAlamat, inputProdi);
            mahasiswa1.setUniv(inputUniv);
            System.out.println();
            System.out.println(mahasiswa1.getUniv());
            System.out.println(mahasiswa1.Nama);
            System.out.println(mahasiswa1.NIM);
            System.out.println(mahasiswa1.Alamat);
            System.out.println(mahasiswa1.Prodi);
            System.out.println();
            System.out.println("Ingin memasukaan data lagi(y/t)?");
            jawab = masukan.next().charAt(0);
            if (jawab == 't') {
                break;
            }
        }    
        masukan.close();
    }
}
