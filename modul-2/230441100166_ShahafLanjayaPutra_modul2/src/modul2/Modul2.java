/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class mahasiswa {
    String Nama, NIM, Alamat;
    
    mahasiswa (String ini_nama, String ini_nim, String ini_alamat) {
        Nama = ini_nama;
        NIM = ini_nim;
        Alamat = ini_alamat;
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Alamat : " + Alamat);
    }
}

class universitas {
    static String nama_univ;
    static char repeat, Value;
    static void setNamaUniv (String IniUniv){
        nama_univ = IniUniv;
    }   
    
    
    static String getNamaUniv (){
        return nama_univ;
        
    }
    static void done (){
        System.out.println("Program Selesai");
    }
    
    
    static void Prodi (int no_prodi) {
        if (no_prodi == 41 ){
            System.out.println("Prodi : Teknik Informatika");
        }
        else if (no_prodi == 42) {
            System.out.println("Prodi : Teknik Industri");
        }
        else if (no_prodi == 43) {
            System.out.println("Prodi : Teknik Elektro");
        }
        else if (no_prodi == 44) {
            System.out.println("Prodi : Sistem Informasi");
        }
        else if (no_prodi == 48) {
            System.out.println("Prodi : Teknik Mesin");
        }
        else if (no_prodi == 49) {
            System.out.println("Prodi : Teknik Mekatronika");
        }
        else {
             System.out.println("Tidak Ditemukan !!!");
        }
    }
}

public class Modul2 {
    
    public static void main(String[] args) {
        char Value, InputRepeat;
        String Univ,InputNama, InputNIM, InputAlamat;
        int InputProdi;
        Scanner input = new Scanner (System.in);
        Value = 'Y';
        // TODO code application logic here
        while (Value == 'Y') {
            //        input value
            System.out.println("masukkan univ : ");
            Univ = input.nextLine();
            System.out.println("Masukkan Nama : ");
            InputNama = input.nextLine();
            System.out.println("Masukkan NIM : ");
            InputNIM = input.nextLine();
            System.out.println("Masukkan PRODI : ");
            InputProdi = input.nextInt();
            input.nextLine();
            System.out.println("Masukkan Alamat : ");
            InputAlamat = input.nextLine();
       
            //        pemanggilan constructor dan static void
            universitas ini_univ = new universitas ();
            ini_univ.setNamaUniv(Univ);
            System.out.println("Univ : " + ini_univ.getNamaUniv());
            universitas.Prodi(InputProdi);
            mahasiswa data_mhs = new mahasiswa(InputNama, InputNIM, InputAlamat);
            System.out.println("Apakah ingin mengulang : ");
            InputRepeat = input.next().charAt(0);
            if (InputRepeat == 'Y'){
                Value = 'Y';
                input.nextLine();
                }
            else {
                Value = 'T';
            }
          }
        universitas.done();
        }
    
}

