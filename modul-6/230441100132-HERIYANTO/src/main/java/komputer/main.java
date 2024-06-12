package komputer;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        Komputer komputer = null; 

        while (komputer == null) {
            System.out.print("Pilih tipe komputer (Laptop/PC/Netbook): ");
            String tipe = scanner.nextLine();

            switch (tipe.toLowerCase()) {
                case "laptop" -> komputer = new Laptop();
                case "pc" -> komputer = new PC();
                case "netbook" -> komputer = new Netbook();
                default -> System.out.println("Tipe komputer tidak dikenal, masukkan lagi");
            }
        }        
        Komputer[] komputerArray = { komputer };        
        KomputerCetak pencetak = new KomputerCetak();
        pencetak.cetak(komputerArray);  
        scanner.close();
    }
}