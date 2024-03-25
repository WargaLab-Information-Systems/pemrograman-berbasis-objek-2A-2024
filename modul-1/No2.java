import java.util.Scanner;

class Mahasiswa{
    String nama;
    String NIM;
    String Prodi;
    String Alamat;
    
    void Cetak(){
        System.out.println("nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + Prodi);
        System.out.println("Alamat : " + Alamat);
    }
}

public class No2 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Mahasiswa mahasiswa1 = new Mahasiswa();
        System.out.print("masukkan Nama : ");
        mahasiswa1.nama = masuk.nextLine();
        System.out.println("masukkan NIM : ");
        mahasiswa1.NIM = masuk.nextLine();
        System.out.println("masukkan Prodi : ");
        mahasiswa1.Prodi = masuk.nextLine();
        System.out.println("masukkan Alamat : ");
        mahasiswa1.Alamat = masuk.nextLine();
        masuk.close();
        mahasiswa1.Cetak();
    }
}