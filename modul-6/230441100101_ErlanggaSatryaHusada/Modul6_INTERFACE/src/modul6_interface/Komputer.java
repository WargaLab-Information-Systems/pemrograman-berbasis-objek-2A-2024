/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6_interface;

/**
 *
 * @author Erlangga Satrya H
 */
abstract class Komputer implements IMouse,IKeyboard,IPrinter {
    abstract void hidupkan_os();
    abstract void matikan_os();
}
