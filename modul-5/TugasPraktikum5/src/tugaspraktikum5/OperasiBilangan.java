/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author Admin
 */
public class OperasiBilangan {
    protected double a,b,c,d;
    
    protected void set_A(double a){
        this.a = a;
    };
    protected void set_B(double b){
        this.b = b;
    };
    protected void set_C(double c){
        this.c = c;
    };
    protected void set_D(double a, double b){
     this.d = a/b;
    };
    
    protected void set_D(double a, double b, double c){
     this.d = a/b/c;
    };
    
    protected double get_A(double a){
        return a;
    };
    protected double get_B(double b){
        return b;
    };
    protected double get_C(double c){
        return c;
    };
    protected double get_D(){
    return d;
}
    protected void tampil(){
        System.out.println("Hasil adalah : ");
    }
    
    
    
}
