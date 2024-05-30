/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectkalkulator;

/**
 *
 * @author USER
 */

abstract class Kalkulator {
    protected double a;
    protected double b;
    
    public void setA(double a){
        this.a=a;
    }
    public void setB(double b){
        this.b=b;
    }
     
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public abstract void tampil();   
}

public class ProjectKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double A= 9.25;
       double B = 1.25;
       
       Kalkulator OperatorPenjumlahan = new OperatorPenjumlahan();
       Kalkulator OperatorPengurangan = new OperatorPengurangan();
       Kalkulator OperatorPerkalian = new OperatorPerkalian();
       Kalkulator OperatorPembagian = new OperatorPembagian();
       
       OperatorPenjumlahan.setA(A);
       OperatorPenjumlahan.setB(B);
       OperatorPengurangan.setA(A);
       OperatorPengurangan.setB(B);
       OperatorPerkalian.setA(A);
       OperatorPerkalian.setB(B);
       OperatorPembagian.setA(A);
       OperatorPembagian.setB(B);
       
       System.out.println("Nilai A : " + A);
       System.out.println("Nilai B : " + B);
       OperatorPenjumlahan.tampil();
       OperatorPengurangan.tampil();
       OperatorPerkalian.tampil();
       OperatorPembagian.tampil();
    }
    
}
