package polimorfisme;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aplikasi penjumlahan, pengurangan, perkalian, dan pembagian");
        System.out.print("Masukkan bilangan A : ");
        double bilA = scanner.nextDouble();
        System.out.print("Masukkan bilangan B : ");
        double bilB = scanner.nextDouble();
        System.out.print("Masukkan bilangan C : ");
        double bilC = scanner.nextDouble();

        // Membuat objek operasi
        operasi[] operasiArray = new operasi[4];
        operasiArray[0] = new penjumlahan();
        operasiArray[1] = new pengurangan();
        operasiArray[2] = new perkalian();
        operasiArray[3] = new pembagian();

        // Set nilai A, B, dan C pada setiap objek operasi
        operasiArray[0].setA(bilA);
        operasiArray[0].setB(bilB);
        operasiArray[0].setC(bilC);
        operasiArray[0].setD();

        operasiArray[1].setA(bilA);
        operasiArray[1].setB(bilB);
        operasiArray[1].setC(bilC);
        operasiArray[1].setD();

        operasiArray[2].setA(bilA);
        operasiArray[2].setB(bilB);
        operasiArray[2].setC(bilC);
        operasiArray[2].setD();

        operasiArray[3].setA(bilA);
        operasiArray[3].setB(bilB);
        operasiArray[3].setC(bilC);
        operasiArray[3].setD();

        //menampilkan nilai dari masing masing operasi
        operasiArray[0].tampil(); 
        operasiArray[1].tampil(); 
        operasiArray[2].tampil(); 
        operasiArray[3].tampil(); 

        scanner.close();
    }
}