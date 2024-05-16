/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1.modul5;

public class Penjumlahan extends OperasiBilangan{
    protected double bilanganA;
    protected double bilanganB;
    protected double bilanganC;
    protected double hasilD;
    
    @Override
    protected void set_A(double a){
        this.bilanganA = a;
    }
    
    @Override
    protected void set_B(double b){
        this.bilanganB = b;
    }
    
    @Override
    protected void set_C(double c) {
        this.bilanganC = c;
    }
    
    @Override
    protected void set_D(double bilanganA, double bilanganB) {
        hasilD = bilanganA + bilanganB;
    }
    
    @Override
    protected void set_D(double bilanganA, double bilanganB, double bilanganC) {
        hasilD = bilanganA + bilanganB + bilanganC;
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
        return bilanganC;
    }
    
    @Override
    protected double get_D() {
        return hasilD;
    }

    @Override
    protected void tampil(double bilanganA, double bilanganB) {
        System.out.println("Hasil penjumlahan " + get_A() + " + " + get_B() + " = " + get_D());
    }
    @Override
    protected void tampil(double bilanganA, double bilanganB, double bilanganC) {
        System.out.println("Hasil penjumlahan " + get_A() + " + " + get_B() + " + " + get_C() + " = " + get_D());
    }
}