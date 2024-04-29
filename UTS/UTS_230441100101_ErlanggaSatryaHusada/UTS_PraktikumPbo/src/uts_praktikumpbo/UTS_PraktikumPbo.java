/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_praktikumpbo;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasmodul2;
import java.util.Scanner;

class mahasiswa {
    String Nama, NIM, AsalSekolah1,TanggalLahir, prodi;
    
    mahasiswa (String ini_nama, String ini_nim, String ini_AsalSekolah, String ini_TanggalLahir,String ini_prodi) {
        Nama = ini_nama;
        NIM = ini_nim;
        AsalSekolah1 = ini_AsalSekolah;
        TanggalLahir= ini_TanggalLahir;
        prodi=ini_prodi;
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Alamat : " + AsalSekolah1);
        System.out.println("Tanggal Lahir :" + TanggalLahir);
        System.out.println("Prodi:" + prodi);
    }
}

class mahasiswa1 { 
    static String nama_univ;
    static char repeat, Value;
    static void setNamaUniv (String IniUniv){
        nama_univ = IniUniv;
    }   

    static void done (){
        System.out.println("Program Telah Selesai");
    }
    
    
    static void Prodi (String nama_prodi) {
        if (nama_prodi == SI ){
            System.out.println("Prodi : Sistem informasi");
        }
        else if (nama_prodi == TIF) {
            System.out.println("Prodi : Teknik Informatika");
        }
        else if (nama_prodi == TI) {
            System.out.println("Prodi : Teknik Industri");
        }
        else if (nama_prodi == TM) {
            System.out.println("Prodi : Teknik Mesin");
        }
        else if (nama_prodi == TMK) {
            System.out.println("Prodi : Teknik Mekatronika");
        }
        else if (nama_prodi == TE) {
            System.out.println("Prodi : Teknik ELektronika");
        }
        else {
             System.out.println("Tidak Ditemukan !!!");
        }
    }
}



public class TugasModul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//           public static void main(String[] args) {
        char Value, InputRepeat;
        String InputNama,InputNim InputAsalSekolah1, InputTanggalLahir,InputProdi;
        int InputNamaProdi;
        Scanner input = new Scanner (System.in);
        Value = 'Y';
        // TODO code application logic here
        while (Value == 'Y') {
            //        input value
            System.out.println("masukkan nama : ");
            InputNama = input.nextLine();
            System.out.println("Masukkan nim : ");
            InputNim = input.nextLine();
            System.out.println("Masukkan Asal Sekolah : ");
            InputAsalSekolah1 = input.nextLine();
            System.out.println("Masukkan PRODI : ");
            InputNamaProdi = input.nextLine();
            input.nextLine();
            System.out.println("Masukkan Alamat : ");
            InputAlamat = input.nextLine();
       
            //-------------------------------------------------------------
            universitas ini_univ = new universitas ();
            universitas.setNamaUniv(Univ);
            System.out.println("Univ : " + universitas.getNamaUniv());
            universitas.Prodi(InputProdi);
            mahasiswa data_mhs = new mahasiswa(InputNama, InputNIM,InputTanggalLahir, InputProdi);
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
