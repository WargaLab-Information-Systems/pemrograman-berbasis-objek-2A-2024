
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class tugas4 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai B: ");
        double b = scanner.nextDouble();

        OperasiBilanganAbs[] operasiArray = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasiArray, a, b);

        scanner.close();
    }
}
