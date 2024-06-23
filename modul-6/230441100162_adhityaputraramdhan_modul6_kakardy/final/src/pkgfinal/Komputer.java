/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

import pkgfinal.INTERFACE.Keyboard;
import pkgfinal.INTERFACE.Mouse;
import pkgfinal.INTERFACE.Printer;

/**
 *
 * @author AdhityaPutraaa
 */
public abstract class Komputer implements Mouse, Keyboard, Printer {
    public abstract void hidupkanOs();
    public abstract void matikanOs();
}

