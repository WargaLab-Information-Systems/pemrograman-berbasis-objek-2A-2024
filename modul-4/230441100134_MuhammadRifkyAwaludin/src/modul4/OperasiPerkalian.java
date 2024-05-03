package Modul4;

public class OperasiPerkalian extends OperasiBilanganAbs {
    double a = 9.25;
    double b = 1.25;
    double c;    //Method
    protected void set_A(double a){
        this.a = a;
    }
                 //Setter digunakan untuk mengubah nilai properti
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(){
        this.c = a * b;
    }
    protected double get_A(){
        return a;
    }
                  //getter digunakan untuk mengambil nilai properti
    protected double get_B(){
        return b;
    }
    protected double get_C(){
        c = get_A() * get_B();
        return c;

    }
    protected void tampil(){
        System.out.println("=======================");
        System.out.println("Hasil Perkalian");
        System.out.println("Bilangan A = " + get_A());
        System.out.println("Bilangan B = " + get_B());
        System.out.println(get_A() + " x " + get_B() + " = " + get_C());
        System.out.println("=======================");
    }
}
