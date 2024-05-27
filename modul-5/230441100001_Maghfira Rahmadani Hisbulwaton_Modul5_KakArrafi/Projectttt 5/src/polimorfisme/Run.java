package polimorfisme;

import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan A, B, dan C dari pengguna
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
        for (operasi op : operasiArray) {
            op.setA(bilA);
            op.setB(bilB);
            op.setC(bilC);
            op.setD();
        }

        // Menampilkan hasil operasi
        for (operasi op : operasiArray) {
            op.tampil();
        }

        scanner.close();
    }
}
