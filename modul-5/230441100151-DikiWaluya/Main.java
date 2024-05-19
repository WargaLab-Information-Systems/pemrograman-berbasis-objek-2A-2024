package praktikum5;

import java.util.Scanner;

abstract class Operasi {
    protected double a;
    protected double b;
    protected double c;

    public Operasi(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Operasi(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = 0; 
    }

    public Operasi(double a) {
        this.a = a;
        this.b = 0; 
        this.c = 0; 
    }

    public abstract void tampilHasil();
}

class Penjumlahan extends Operasi {
    public Penjumlahan(double a, double b, double c) {
        super(a, b, c);
    }

 
    public Penjumlahan(double a, double b) {
        super(a, b);
    }

 
    public Penjumlahan(double a) {
        super(a);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Hasil penjumlahan: " + (a + b + c));
    }
}

class Pengurangan extends Operasi {
    public Pengurangan(double a, double b, double c) {
        super(a, b, c);
    }

    
    public Pengurangan(double a, double b) {
        super(a, b);
    }

    
    public Pengurangan(double a) {
        super(a);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Hasil pengurangan: " + (a - b - c));
    }
}

class Perkalian extends Operasi {
    public Perkalian(double a, double b, double c) {
        super(a, b, c);
    }

  
    public Perkalian(double a, double b) {
        super(a, b);
    }

    
    public Perkalian(double a) {
        super(a);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Hasil perkalian: " + (a * b * c));
    }
}

class Pembagian extends Operasi {
    public Pembagian(double a, double b, double c) {
        super(a, b, c);
    }


    public Pembagian(double a, double b) {
        super(a, b);
    }

 
    public Pembagian(double a) {
        super(a);
    }

    @Override
    public void tampilHasil() {
        if (b != 0 && c != 0)
            System.out.println("Hasil pembagian: " + (a / b / c));
        else
            System.out.println("Tidak bisa membagi dengan nol.");
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai A: ");
            double a = scanner.nextDouble();
            System.out.print("Masukkan nilai B: ");
            double b = scanner.nextDouble();
            System.out.print("Masukkan nilai C: ");
            double c = scanner.nextDouble();

            Operasi[] operasi = {
                new Penjumlahan(a, b, c),
                new Penjumlahan(a, b),
                new Penjumlahan(a),
                new Pengurangan(a, b, c),
                new Pengurangan(a, b),
                new Pengurangan(a),
                new Perkalian(a, b, c),
                new Perkalian(a, b),
                new Perkalian(a),
                new Pembagian(a, b, c),
                new Pembagian(a, b),
                new Pembagian(a),
            };

            for (Operasi op : operasi) {
                op.tampilHasil();
            }
        }
    }
}
