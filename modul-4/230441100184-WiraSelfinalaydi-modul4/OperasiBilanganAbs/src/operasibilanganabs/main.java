package operasibilanganabs;
import java.util.Scanner;

public class main {
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