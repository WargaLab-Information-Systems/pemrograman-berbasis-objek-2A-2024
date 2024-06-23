/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

public class Praktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SILAHKAN MASUKKAN DATA");
        String nama = input.nextLine();
        String MasukkanData = "Y";
        
        while (MasukkanData.equals("Y")){
            System.out.print("Nama : ");
            String Nim = input.nextLine();
            System.out.print("Nim : ");
            String Nama = input.nextLine();
            System.out.print("Alamat : ");
            String Alamat = input.nextLine();
            System.out.println("Pilihan Kode Jurusan SI,TI,TIF,TM");
            System.out.print("Kode Jurusan: ");
            int KodeJurusan = input.nextInt();
            input.nextLine();
            System.out.print("Apakah anda ingin memasukkan data lagi? (Y) Ya (T) Tidak ");
            MasukkanData = input.nextLine();
         } 
