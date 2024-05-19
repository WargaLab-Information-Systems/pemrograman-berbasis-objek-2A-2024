/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

/**
 *
 * @author Amira Alissiya
 */
import java.util.Scanner;

//A = 10.5
//B = 0.5
//C = 1.25

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();
        System.out.println(" ");

        Operation[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        for (Operation op : operasi) {
            if (!(op instanceof Pembagian) || (op instanceof Pembagian && op.operasi(b, c) != Double.NaN)) {
                double hasilab = op.operasi(a, b);
                double hasilbc = op.operasi(b, c);
                double hasilac = op.operasi(a, c);
                double hasilabc = op.operasi(a, b, c);
                System.out.println(op.tampil() + " dari a dan b: " + hasilab);
                System.out.println(op.tampil() + " dari b dan c: " + hasilbc);
                System.out.println(op.tampil() + " dari a dan c: " + hasilac);
                System.out.println(op.tampil() + " dari a, b, dan c: " + hasilabc);
                System.out.println(" ");
            }
        }
    }
}