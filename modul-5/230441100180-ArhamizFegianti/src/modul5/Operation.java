/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Amira Alissiya
 */
abstract class Operation {
//    Overloading
    public abstract double operasi(double a, double b);

    public double operasi(double a, double b, double c) {
        
        return operasi(operasi(a, b), c);
    }

    public abstract String tampil();

    
}