/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class OperasiBilangan {
    
    protected double a, b, c, d ;
    
    protected void set_A (double a){
        this.a = a;
    }
    
    protected void set_B (double b){
        this.b = b;
    }
    
    protected void set_C (double c){
        this.c = c;
    }
    
    protected void set_D (){
        this.d = 0;
    }
    
    protected double get_A(){
        return a;
    }
    
    protected double get_B(){
        return b;
    }
    
    protected double get_C(){
        return c;
    }
    
    protected double get_D(){
        return d;
    }
    
    protected void tampil(){
        System.out.println("Hasil: " + get_D());
    }
}
