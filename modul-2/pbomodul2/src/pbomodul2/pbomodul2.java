/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbomodul2;

import java.util.Scanner;

class mahasiswa {
    String nama, nim, alamat;
    
    mahasiswa (String nama, String nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Alamat : " + alamat);
    }
}

class universitas {
    private static String namaUniversitas;

    // Setter untuk mengatur nama universitas
    static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    // Getter untuk mendapatkan nama universitas
    static String getNamaUniversitas() {
        return namaUniversitas;
    }

    static void done (){
        System.out.println("Program Selesai");
    }
    
    static void Jurusan (int no_jurusan) {
        if (no_jurusan == 41 ){
            System.out.println("Prodi : Teknik Informatika");
        }
        else if (no_jurusan == 42) {
            System.out.println("Prodi : Teknik Industri");
        }
        else if (no_jurusan == 43) {
            System.out.println("Prodi : Teknik Elektro");
        }
        else if (no_jurusan == 44) {
            System.out.println("Prodi : Sistem Informasi");
        }
        else if (no_jurusan == 48) {
            System.out.println("Prodi : Teknik Mesin");
        }
        else if (no_jurusan == 49) {
            System.out.println("Prodi : Teknik Mekatronika");
        }
        else {
             System.out.println("Tidak Ditemukan !!!");
        }
    }
}


public class pbomodul2 {
    
    public static void main(String[] args) {
        char isilagi, Ulang;
        String Univ,InputNama, InputNIM, InputAlamat;
        int InputJurusan;
        Scanner input = new Scanner (System.in);
        isilagi = 'Y';
        
        while (isilagi == 'Y') {
            // input data
            System.out.println("masukkan univ : ");
            Univ = input.nextLine();
            System.out.println("Masukkan Nama : ");
            InputNama = input.nextLine();
            System.out.println("Masukkan NIM : ");
            InputNIM = input.nextLine();
            System.out.println("Masukkan Jurusan : ");
            InputJurusan = input.nextInt();
            input.nextLine();
            System.out.println("Masukkan Alamat : ");
            InputAlamat = input.nextLine();
       
            // pemanggilan setter
            universitas.setNamaUniversitas(Univ);
            System.out.println("Nama Universitas: " + universitas.getNamaUniversitas());
            mahasiswa Data_mhs = new mahasiswa(InputNama, InputNIM, InputAlamat);
            universitas.Jurusan(InputJurusan);
            System.out.println("Apakah ingin mengulang : ");
            Ulang = input.next().charAt(0);
            if (Ulang == 'Y'){
                isilagi = 'Y';
                input.nextLine();
            }
            else {
                isilagi = 'T';
            }
        }
        universitas.done();
    }
}


