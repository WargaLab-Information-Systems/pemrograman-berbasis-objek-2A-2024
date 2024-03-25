/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tugas.praktikum;
import java.util.Scanner;

//class dosen {
//    String nama, jenis_kelamin;
//    
//    
//    public void mengajar () {
//        System.out.println("sedang mengajar");
//}
//}


class mahasiswa {
    String nama, prodi, alamat;
    String nim;
    
    public void data_mahasiswa(){
        System.out.println("\n|========= DATA MAHASISWA ==========|");
        System.out.println("| Nama    :   " + nama);
        System.out.println("| NIM     :   " + nim);
        System.out.println("| PRODI   :   " + prodi);
        System.out.println("| ALAMAT  :   " + alamat);
        
    }

}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        dosen ini_dosen = new dosen();
        mahasiswa ini_mahasiswa = new mahasiswa();
        Scanner keyboard = new Scanner (System.in);
        
        
//        ini_dosen.mengajar();
        System.out.println("Masukkan nama mahasiswa : ");
        ini_mahasiswa.nama = keyboard.nextLine();
        
        System.out.println("Masukkan nim mahasiswa : ");
        ini_mahasiswa.nim = keyboard.nextLine();
        
        System.out.println("Masukkan Prodi Mahasiswa : ");
        ini_mahasiswa.prodi = keyboard.nextLine();
        
        System.out.println("Masukkan Alamat Mahasiswa : ");
        ini_mahasiswa.alamat = keyboard.nextLine();
        
        ini_mahasiswa.data_mahasiswa();
        
       
        
        
    }
    
}
