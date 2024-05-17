import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean jalan = true;
        System.out.println("Ini Adalah Operasi Komputer (PC, Notebook, Laptop) \n");
        Scanner masukan = new Scanner(System.in);
        System.out.print("Ingin Menjalankan Komputer ? (y/t) \t: ");
        char pilih = masukan.next().charAt(0);
        if (pilih != 'y') {
            jalan = false;
        }

        while (jalan == true) {
            KomputerCetak print = new KomputerCetak();
            Komputer[] OB = new Komputer[3];

            OB[0] = new PC();
            OB[1] = new Laptop();
            OB[2] = new Notebook();
            

            for(int i = 0; i < OB.length; i++){
                print.Cetak(OB[i]);
            }

            System.out.print("Ingin Menjalankan Komputer Lagi ? (y/t) \t: ");
            pilih = masukan.next().charAt(0);

            if (pilih != 'y') {
                jalan = false;
            }
        }
        masukan.close();
    }
}
