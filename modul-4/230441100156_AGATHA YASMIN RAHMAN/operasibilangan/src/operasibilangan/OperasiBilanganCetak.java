/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operasibilangan;
import java.util.Scanner;

public final class OperasiBilanganCetak extends OperasiBilangan {
    
    @Override
    protected void set_A(double a) {
        this.a = a;
    }
    
    @Override
    protected void set_B(double b) {
        this.b = b;
    }
    
    @Override
    protected void set_C(double c) {
        this.c = c;    
    }
    
    @Override
    protected double get_A() {
        return this.a;
    }
    
    @Override
    protected double get_B() {
        return this.b;
    }
    
    @Override
    protected double get_C() {
        return this.c;
    }
    
    @Override
    protected void tampil() {
        System.out.println("Hasil Operasi: " + this.c);
    }
    
    private static void CetakOperasi(OperasiBilangan operasi) {
        operasi.tampil();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = "Y";
        while (repeat.equals("Y")) {
        
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();

            OperasiBilangan operasi;
            switch (pilihan) {
                case 1:
                    operasi = new OperasiPenjumlahan();
                    operasi.set_A(angka1);
                    operasi.set_B(angka2);
                    operasi.set_C(angka1 + angka2);
                    CetakOperasi(operasi);
                    break;
                case 2:
                    operasi = new OperasiPengurangan();
                    operasi.set_A(angka1);
                    operasi.set_B(angka2);
                    operasi.set_C(angka1 - angka2);
                    CetakOperasi(operasi);
                    break;
                case 3:
                    operasi = new OperasiPerkalian();
                    operasi.set_A(angka1);
                    operasi.set_B(angka2);
                    operasi.set_C(angka1 * angka2);
                    CetakOperasi(operasi);
                    break;
                case 4:
                    operasi = new OperasiPembagian();
                    operasi.set_A(angka1);
                    operasi.set_B(angka2);
                    operasi.set_C(angka1 / angka2);
                    CetakOperasi(operasi);
                    break;
                default:
                    System.out.println("Pilihan operasi tidak valid.");
            }
            scanner.nextLine();
        
        
           
            System.out.println("Apakah Anda ingin mengulangi lagi Y/T");
            repeat = scanner.nextLine();
        
        }
       
        
    }
}
