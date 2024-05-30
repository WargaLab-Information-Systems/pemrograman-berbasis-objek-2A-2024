/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.modul4;

class Perkalian extends OperasiMatematika {

    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hasil() {
        return a * b;
    }

    @Override
    public String operasi() {
        return "Perkalian";
    }
}