/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1.modul4;

class Perkalian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        bilanganA = a;
    }

    @Override
    protected void set_B(double b) {
        bilanganB = b;
    }

    @Override
    protected void set_C() {
        hasil_C = bilanganA * bilanganB;
    }

    @Override
    protected double get_A() {
        return bilanganA;
    }

    @Override
    protected double get_B() {
        return bilanganB;
    }

    @Override
    protected double get_C() {
        return hasil_C;
    }

    @Override
    protected void tampil() {
    System.out.println("Hasil perkalian " + get_A() + " x " + get_B() + " = " + get_C());
    }
}

