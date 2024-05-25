/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author Admin
 */
public class OperasiPenjumlahan extends OperasiBilangan{
     protected double a,b,c,d;
    
     @Override
    protected void set_A(double a){
        this.a = a;
    };
     @Override
    protected void set_B(double b){
        this.b = b;
    };
     @Override
    protected void set_C(double c){
        this.c = c;
    };
    
     @Override
    protected void set_D(double a, double b){
     this.d = a+b;
    };
    
     @Override
    protected void set_D(double a, double b, double c){
     this.d = a+b+c;
    };
    
     @Override
    protected double get_A(double a){
        return a;
    };
     @Override
    protected double get_B(double b){
        return b;
    };
     @Override
    protected double get_C(double c){
        return c;
    };
     @Override
    protected double get_D(){
    return d;
}
     @Override
    protected void tampil(){
        System.out.println("| Hasil adalah penjumlahan : " + get_D());
    }
}
