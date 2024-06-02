package com.pkg;

public class Main {
    public static void main(String[] args) {
        Penjumlahan operasi1 = new Penjumlahan (9.25,1.25);
        operasi1.display();
        
        Pengurangan operasi2 = new Pengurangan (9.25,1.25);
        operasi2.display();
        
        Perkalian operasi3 = new Perkalian (9.25,1.25);
        operasi3.display();
        
        Pembagian operasi4 = new Pembagian (9.25,1.25);
        operasi4.display();
    }
}