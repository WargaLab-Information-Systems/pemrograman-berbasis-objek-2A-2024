/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opbilangan;

public class OpPenjumlahan extends OpBilanganCetak{
    protected double a = 9.25;
    protected double b = 1.25;
    protected double c;
    
    protected void set_A(double a){
    this.a = a;
    }
    
    protected void set_B(double b){
    this.b = b;
    } 
    
  
    protected void set_C(double c){
    this.c = c;
    }
    
    protected double get_A(){
    return a;
    }
    
    protected double get_B(){
    return b;
    }
    
    protected double get_C(){
    c = get_A() + get_B();
    return c;
    }
    
    protected void tampil(){
        System.out.println("================================");
        System.out.println("      Operasi Penjumlahan       ");
        System.out.println("Bilangan A = " + get_A());
        System.out.println("Bilangan B = " + get_B());
        System.out.println("Hasil Penjumlahan A + B = " + get_C());
        System.out.println("================================");
        
    }
    
}
