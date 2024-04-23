/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbomodul1;

class Manusia {
String nama,alamat;
int umur;

public void Berjalan(){
    System.out.println(nama + " di " + alamat + " Sedang Berjalan");
}
void Berlari(){
    System.out.println(nama + " di " + alamat + " Sedang Berlari");
}
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia orang1 = new Manusia ();
        Manusia orang2 = new Manusia ();
        
        orang1.nama = "Archeron";
        orang1.umur = 21;
        orang1.alamat = "penacony";
        System.out.println("nama : " + orang1.nama);
        System.out.println("umur : " + orang1.umur);
        System.out.println("alamat : " + orang1.alamat);
        orang1.Berjalan();
        orang1.Berlari();
        
        orang2.nama = "Argenti";
        orang2.umur = 25;
        orang2.alamat = "starrail";
        System.out.println("nama : " + orang2.nama);
        System.out.println("umur : " + orang2.umur);
        System.out.println("alamat : " + orang2.alamat);
        orang2.Berjalan();
        orang2.Berlari();
    }
    
}

