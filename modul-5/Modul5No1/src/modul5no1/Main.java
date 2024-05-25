/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5no1;
import java.util.Scanner;

class OperasiBilangan {
    protected double a;
    protected double b;
    protected double c;
    protected double d;
    
    protected void set_A(double a){
        this.a = a;
    }
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(double c){
        this.c = c;
    }
    protected void set_D(){
        this.d = d;
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
        System.out.println("Nilai hasilnya adalah " + this.d);
    }
}

public class Main {
    public static void cetak(OperasiBilangan[] ob,double a, double b, double c){
        ob[0]= new PENJUMLAHAN();
        ob[1]= new PENGURANGAN();
        ob[2]= new PERKALIAN();
        ob[3]= new PEMBAGIAN();
        
        for (int i=0; i<4;i++){
            ob[i].set_A(a);
            ob[i].set_B(b);
            ob[i].set_C(c);
            ob[i].set_D();
            ob[i].tampil();
        }
    }
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("Masukkan Angka 1: ");
        double angka1 = inputan.nextDouble();
        
        System.out.println("Masukkan Angka 2: ");
        double angka2 = inputan.nextDouble();

        System.out.println("Masukkan Angka 3: ");
        double angka3 = inputan.nextDouble();
        
        
        OperasiBilangan[] nyetak= new OperasiBilangan[4];
        cetak(nyetak,angka1, angka2, angka3);
    
   
    }
    
}
