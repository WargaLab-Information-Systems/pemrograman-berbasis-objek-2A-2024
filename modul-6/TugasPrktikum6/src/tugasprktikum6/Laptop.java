/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprktikum6;

public class Laptop extends Komputer implements Mouse, Keyboard, Printer{
     String nama;
    Laptop(String admin){
        this.nama = admin;
    }
    @Override
    public void hidupkan_os(){
        System.out.println("| Laptop : "+this.nama+" telah dihidupkan ");
    }
    @Override
    public void matikan_os(){
        System.out.println("| Laptop : "+this.nama+" telah dimatika\n");
    }
    @Override
    public void klikkanan(){
        System.out.println("| Laptop : "+this.nama+" sedang diklik kanan");
    }
    @Override
    public void klikkiri(){
        System.out.println("| Laptop : "+this.nama+" sedang diklik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("| Keyboard pada Laptop : "+this.nama+" menekan Enter");
    }
    @Override
    public void cetak_data(){
        System.out.println("| Printer pada Laptop : "+this.nama+" mencetak Hello World");
    }
}
