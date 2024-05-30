/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.modul4;

abstract class OperasiMatematika {

    protected double a;
    protected double b;

    public OperasiMatematika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double hasil();

    public abstract String operasi();
}
