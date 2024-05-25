/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5no1;

class PEMBAGIAN extends OperasiBilangan {
    public class OperasiBilangan {
    protected double a;
    protected double b;
    protected double c;
    protected double d;
}
    
    
    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C(double c) {
        this.c = c;
    }
    
    @Override
    protected void set_D() {
        this.d = this.a / this.b / this.c;
    }
    protected void set_D(double a, double b, double c){
        this.d = a / b / c;
    }    
    
    protected double get_A() {
        return this.get_A();
    }
    
    protected double get_B() {
        return this.get_B();
    }
    
    protected double get_C() {
        return this.get_C();
    }
    
    protected double get_D() {
        return this.get_D();
    }
    
    @Override
    protected void tampil() {
        System.out.println("|==================================|");
        System.out.println("| Hasil pembagian dari "+ this.a + " : " + this.b + " : " + this.c);
        System.out.println("| adalah  " + this.d);
        System.out.println("|==================================|");
    }
}



    