package opbilangan;

import java.util.Scanner;

public class OpBilanganCetak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        double nilaiA = scanner.nextDouble();
        System.out.print("Masukkan nilai B: ");
        double nilaiB = scanner.nextDouble();

        OpPenjumlahan a = new OpPenjumlahan(nilaiA, nilaiB);
        a.tampil();
        System.out.println();

        OpPengurangan b = new OpPengurangan(nilaiA, nilaiB);
        b.tampil();
        System.out.println();

        OpPerkalian c = new OpPerkalian(nilaiA, nilaiB);
        c.tampil();
        System.out.println();

        OpPembagian d = new OpPembagian(nilaiA, nilaiB);
        d.tampil();
        System.out.println();

        scanner.close();
        
    }
}
