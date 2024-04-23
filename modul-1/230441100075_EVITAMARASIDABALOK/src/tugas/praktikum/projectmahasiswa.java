package tugas2.praktikum;
import java.util.Scanner;
//untuk membaca input dari pengguna

public class projectmahasiswa {
     // mendefinisikan class projectmahasiswa

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in); 
        //membuat objek Scanner yang akan digunakan untuk mengambil input dari pengguna m
        
        String NAMA; //variabel untuk menyimpan nama
        String NIM; //variabel untuk menyimpan nim
        String PRODI;
        String ALAMAT;

        System.out.println("INPUT NAMA ="); // digunakan untuk mencetak (menampilkan) teks 
        NAMA = input.nextLine(); //untuk membaca input satu baris teks
        System.out.println("INPUT NIM =");
        NIM = input.nextLine();
        System.out.println("INPUT PRODI =");
        PRODI = input.nextLine();
        System.out.println("INPUT ALAMAT =");
        ALAMAT = input.nextLine();

        System.out.println("---------------");
        System.out.println("Nama saya = " + NAMA);
        System.out.println("Nim = " + NIM);
        System.out.println("Prodi = " + PRODI);
        System.out.println("Alamat = " + ALAMAT);
        
         input.close(); // Menutup objek Scanner setelah selesai digunakan
    
    }

}
 
