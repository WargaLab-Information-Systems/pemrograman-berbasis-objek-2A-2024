package Modul4;

public class OperasiPembagian extends OperasiBilanganAbs {
    double a = 9.25;
    double b = 1.25;
    double c;
    
    @Override           
    protected void set_A(double a){
        this.a = a;
    }
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(){
        this.c = c;
    }
    protected double get_A(){
        return a;
    }
    protected double get_B(){
        return b;
    }
    protected double get_C(){
        c = get_A() / get_B();
        return c;

    }
    protected void tampil(){
        System.out.println("=======================");
        System.out.println("Hasil Pembagian");
        System.out.println("Bilangan A = " + get_A());
        System.out.println("Bilangan B = " + get_B());
        System.out.println(get_A() + " : " + get_B() + " = " + get_C());
        System.out.println("=======================");
    }
}

