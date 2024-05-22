/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sindy
 */

//superclass
// abstract class isi nya hanya varibale atau method yang belum detail
public abstract class Komputer implements Mouse,Keyboard,Printer{
    // abstract method
    abstract void hidupkan_os();
    abstract void matikan_os();
}
