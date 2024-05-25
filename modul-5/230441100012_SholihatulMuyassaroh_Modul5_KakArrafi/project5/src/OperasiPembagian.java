/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class OperasiPembagian extends OperasiBilangan {
    
    @Override
    protected void set_A (double a){
        this.a = a;
    }
    
    @Override
    protected void set_B (double b){
        this.b = b;
    }
    
    @Override
    protected void set_C (double c){
        this.c = c;
    }
    
    @Override
    protected void set_D (){
        if (b != 0 && c != 0){
            d = a/b/c;
        }else{
            System.out.println("Pembagian dengan 0 tidak dapat dilakukan");
        }
    }
    
    @Override
    protected double get_A(){
        return a;
    }
     
    @Override
    protected double get_B(){
        return b;
    }
    
    @Override
    protected double get_C(){
        return c;
    }
    
    @Override
    protected double get_D() {
        return d;
    }
    
    @Override
    protected void tampil(){
        System.out.println("Hasil Pembagian: " + get_D());
    }
}
