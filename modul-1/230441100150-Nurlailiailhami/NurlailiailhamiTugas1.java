/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nurlailiailhami.tugas1;
/**
 *
 * @author acer
 */
class manusia {
        String nama;
        String alamat;
        int umur;
        
        public void berlari() {
            System.out.println("objek ini berlari");     
        }
        
        void berjalan() {
            System.out.println("objek ini berjalan");
        }
        
    }
public class NurlailiailhamiTugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia();
        manusia orang2 = new manusia();
        
        orang1.nama = "laili";
        orang1.umur = 19;
        orang1.alamat = "sampang";
        
        System.out.print("Nama objek 1 adalah" + orang1.nama );
        System.out.println("umur objek 1 adalah" + orang1.umur +" Tahun");
        System.out.println("alamat objek 1 adalah" + orang1.alamat);
        System.out.println("Terimakasih");
        orang1.berjalan ();
        orang1.berlari();
        
        
        orang2.nama = "firda";
        orang2.umur = 19;
        orang2.alamat = "kalianget";
        
        System.out.print("Nama objek  2 adalah" + orang2.nama);
        System.out.println("umur objek 2 adalah " + orang2.umur +"Tahun");
        System.out.println("alamat objek 2 adalah" + orang2.alamat);
        System.out.println("Terimakasih");
        orang2.berjalan ();
        orang2.berlari();
    
 }
}
