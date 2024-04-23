/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author ZC
 */
public class DataMahasiswa {
    private static String NamaUniversitas;
String Nim;
String Nama;
String Alamat;
int KodeJurusan;

public DataMahasiswa (){
    
}
    
public DataMahasiswa (String nim,String nama, String alamat, int kodeJurusan){
    Nim = nim;
    Nama = nama;
    Alamat = alamat;
    KodeJurusan = kodeJurusan;
}
public static void SetNamaUniversitas (String namaUniversitas){
    NamaUniversitas = namaUniversitas;
    
}
public static String GetNamaUniversitas (){
    return NamaUniversitas;
}
}