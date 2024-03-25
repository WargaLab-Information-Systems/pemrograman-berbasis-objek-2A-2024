/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum.nomor.pkg2;
import java.util.Scanner;
class data{
    String nama, jurusan, prodi, alamat;
    double nim;
    
    public void mahasiswa(){
        System.out.println(" ");
        System.out.println("======DATA MAHASISWA======");
        System.out.println(" ");
        System.out.println("Nama : "+this.nama);
        System.out.println("Jurusan : "+this.jurusan);
        System.out.println("Prodi : "+this.prodi);
        System.out.println("Alamat: "+this.alamat);
        System.out.println("NIM : "+this.nim);

    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        data mhs = new data();
        Scanner input = new Scanner(System.in);
        System.out.print("isi nama : ");
        mhs.nama = input.nextLine();
        System.out.print("isi alamat : ");
        mhs.alamat = input.nextLine();
        System.out.print("isi jurusan : ");
        mhs.jurusan= input.nextLine();
        System.out.print("isi prodi : ");
        mhs.prodi= input.nextLine();
        System.out.print("isi NIM : ");
        mhs.nim= input.nextDouble();
        
        mhs.mahasiswa();

    }
    
}
