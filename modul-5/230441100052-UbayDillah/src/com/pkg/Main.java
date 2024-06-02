package com.pkg;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Operasi Bilangan 2 angka atau 3 angka : ");
        int pilihan = scanner.nextInt();
        
        System.out.println("Perhitungan Penjumlahan, Pengurangan, Perkalian, dan Pembagian \n\n");
        
        switch (pilihan) {
            case 2:
                System.out.print("Masukkan angka 1: ");
                double operand1_2 = scanner.nextDouble();
                System.out.print("Masukkan angka 2: ");
                double operand2_2 = scanner.nextDouble();
                
                OperasiMatematika operasi1_2 = new Penjumlahan(operand1_2, operand2_2);
                operasi1_2.display();
                
                OperasiMatematika operasi2_2 = new Pengurangan(operand1_2, operand2_2);
                operasi2_2.display();
                
                OperasiMatematika operasi3_2 = new Perkalian(operand1_2, operand2_2);
                operasi3_2.display();
                
                OperasiMatematika operasi4_2 = new Pembagian(operand1_2, operand2_2);
                operasi4_2.display();
                break;
                
            case 3:
                System.out.print("Masukkan angka 1: ");
                double operand1_3 = scanner.nextDouble();
                System.out.print("Masukkan angka 2: ");
                double operand2_3 = scanner.nextDouble();
                System.out.print("Masukkan angka 3: ");
                double operand3_3 = scanner.nextDouble();
                
                OperasiMatematika operasi1_3 = new Penjumlahan(operand1_3, operand2_3, operand3_3);
                operasi1_3.display();
                
                OperasiMatematika operasi2_3 = new Pengurangan(operand1_3, operand2_3, operand3_3);
                operasi2_3.display();
                
                OperasiMatematika operasi3_3 = new Perkalian(operand1_3, operand2_3, operand3_3);
                operasi3_3.display();
                
                OperasiMatematika operasi4_3 = new Pembagian(operand1_3, operand2_3, operand3_3);
                operasi4_3.display();
                break;
                
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
        
    }
}