import java.util.Scanner;

class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    // Konstruktor
    public Mahasiswa() {
        // Kosong
    }

    // Method untuk input data mahasiswa
    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        this.nama = input.nextLine();

        System.out.print("Masukkan NIM Mahasiswa: ");
        this.nim = input.nextLine();

        System.out.print("Masukkan Jurusan/Prodi Mahasiswa: ");
        this.jurusan = input.nextLine();

        System.out.print("Masukkan Alamat Mahasiswa: ");
        this.alamat = input.nextLine();
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan/Prodi: " + this.jurusan);
        System.out.println("Alamat: " + this.alamat);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        // Input data mahasiswa
        mhs.inputData();

        // Menampilkan informasi mahasiswa
        mhs.displayInfo();
    }
}