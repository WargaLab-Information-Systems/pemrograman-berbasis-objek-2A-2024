import java.util.Scanner;

class Mahasiswa {
    //atribut
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    //method yang memiliki nama yang sama dengan kelasnya
    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.jurusan = "";
        this.alamat = "";
    }

    //digunakan untuk mengambil input pengguna kemudian menyimpan pada atribut
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        this.nama = scanner.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        this.nim = scanner.nextLine();

        System.out.print("Masukkan jurusan mahasiswa: ");
        this.jurusan = scanner.nextLine();

        System.out.print("Masukkan alamat mahasiswa: ");
        this.alamat = scanner.nextLine();

        scanner.close();
    }
// objek dari mahasiswa untuk menampilkan data yang telah diinput
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class Main {
    //method untuk menampilkan data yang telah diinput
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.inputInfo();
        mahasiswa.displayInfo();
    }
}
