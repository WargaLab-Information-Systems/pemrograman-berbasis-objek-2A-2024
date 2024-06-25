/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author Admin
 */
public class OperasiPerkalian extends OperasiBilanganAbs {
    protected double a,b,c;
    
    @Override
    protected void set_A(double a){
        this.a = a;
    };
    @Override
    protected void set_B(double b){
        this.b = b;
    };
    @Override
    protected void set_C(){
        this.c = a * b;
    };
    
    @Override
    protected double get_A(){
        return this.a;
    };
    @Override
    protected double get_B(){
        return this.b;
    };
    
    @Override
    protected double get_C(){
        return c;
    };
    
    @Override
    protected void tampil(){
        System.out.println("Hasil Perkalian : " + get_C());
        
    };
}
