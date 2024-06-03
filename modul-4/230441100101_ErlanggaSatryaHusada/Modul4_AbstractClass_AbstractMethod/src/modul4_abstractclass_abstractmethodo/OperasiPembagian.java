/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4_abstractclass_abstractmethodo;

/**
 *
 * @author Erlangga Satrya H
 */
public class OperasiPembagian extends OperasiBilanganAbs {
    @Override
    public void set_A(double a){
        this.a = a;
    }

    @Override
    public void set_B(double b){
        this.b = b;
    }

    @Override
    public void set_C(){
        this.c = a/b;
    }

    @Override
    public double get_A(){
        return a;
    }

    @Override
    public double get_B(){
        return b;
    }

    @Override
    public double get_C(){
        return c;
    }

    @Override
    public void tampil(){
        System.out.println("-------------------------------------------------");
        System.out.println("|Hasil Pembagian\t\t :" + this.get_C() + "\t\t|");
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }
}

