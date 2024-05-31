package OperasiBilangan;

public class Perkalian extends OperasiBilangan {

    @Override
    protected void set_D() {
        this.d = this.a * this.b * this.c;
    }

    @Override
    protected double get_D() {
        return this.d;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian");
        System.out.println(" A * B * C = " + get_D());
    }

    // Overloading
    @Override
    protected void Operasi(double a, double b) {
        // Check if c is 0 (indicates user chose three variables)
        if (this.c == 0) {
            System.out.println("Operasi dengan dua angka: " + a + "*" + b + " = " + (a * b));
        }
    }

    @Override
    protected void Operasi(double a, double b, double c) {
        // Handle invalid C value (when two variables chosen)
        if (this.c != 0) {
            System.out.println("Peringatan: Nilai C diabaikan karena operasi hanya melibatkan dua variabel.");
        }
        System.out.println("Operasi dengan tiga angka: " + a + " * " + b + " * " + c + " = " + (a * b * c));
    }
}
