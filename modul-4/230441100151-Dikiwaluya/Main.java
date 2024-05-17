package modul4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bilanganA = 0;
        double bilanganB = 0;

        try {
            System.out.print("Masukkan bilangan A: ");
            bilanganA = scanner.nextDouble();

            System.out.print("Masukkan bilangan B: ");
            bilanganB = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Masukan harus berupa bilangan desimal.");
            System.exit(1); 
        }

        OperasiBilanganAbs[] operasi = new OperasiBilanganAbs[4];
        operasi[0] = new Penjumlahan(bilanganA, bilanganB);
        operasi[1] = new Pengurangan(bilanganA, bilanganB);
        operasi[2] = new Perkalian(bilanganA, bilanganB);
        operasi[3] = new Pembagian(bilanganA, bilanganB);

        for (OperasiBilanganAbs op : operasi) {
            op.tampil();
        }

        scanner.close();
    }
}
