/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectkalkulator;

/**
 *
 * @author USER
 */
public class OperatorPengurangan extends Kalkulator {

    @Override
    public void tampil () {
        double hasil=getA()-getB();
        System.out.println("Hasil Pengurangan adalah  "+hasil);
    }
    
}
