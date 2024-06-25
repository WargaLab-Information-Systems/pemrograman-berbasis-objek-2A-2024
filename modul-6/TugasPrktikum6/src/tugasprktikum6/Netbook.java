/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprktikum6;

public class Netbook extends Komputer implements Mouse, Keyboard, Printer{
   String nama;
    Netbook(String admin){
        this.nama = admin;
    }
    @Override
    public void hidupkan_os(){
        System.out.println("| Netbook: "+this.nama+" telah dihidupkan ");
    }
    @Override
    public void matikan_os(){
        System.out.println("| Netbook : "+this.nama+" telah dimatikan\n");
    }
    @Override
    public void klikkanan(){
        System.out.println("| Netbook : "+this.nama+" sedang diklik kanan");
    }
    @Override
    public void klikkiri(){
        System.out.println("| Netbook : "+this.nama+" sedang diklik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("| Keyboard pada Netbook : "+this.nama+" menekan Enter");
    }
    @Override
    public void cetak_data(){
        System.out.println("| Printer pada Netbook : "+this.nama+" mencetak Hello World");
    }
}
