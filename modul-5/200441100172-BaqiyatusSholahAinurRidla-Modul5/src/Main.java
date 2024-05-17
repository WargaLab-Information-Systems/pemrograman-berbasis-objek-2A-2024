import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Ini Adalah Operasi Bilangan Tiga Angka\n");
        Scanner masukan = new Scanner(System.in);
        boolean jalan = true;

        do {
            System.out.print("Masukkan bilangan pertama \t: ");
            double a = masukan.nextDouble();
            System.out.print("Masukkan bilangan kedua \t: ");
            double b = masukan.nextDouble();
            System.out.print("Masukkan bilangan ketiga \t: ");
            double c = masukan.nextDouble();

            OperasiBilangan[] OB = new OperasiBilangan[4];

            OB[0] = new OperasiPenjumlahan();
            OB[1] = new OperasiPengurangan();
            OB[2] = new OperasiPerkalian();
            OB[3] = new OperasiPembagian();

            // Untuk Memgakses Method yang Private
            Class cls = Class.forName("OperasiBilanganCetak");
            Object o = cls.newInstance();
            Method m = cls.getDeclaredMethod("CetakSemua", OperasiBilangan.class, double.class, double.class, double.class);
            m.setAccessible(true);

            for(int i = 0; i < OB.length; i++){
                m.invoke(o, OB[i], a, b, c);
                OB[i].getA();
                OB[i].getB();
                OB[i].getC();
                OB[i].getD();
            }
            System.out.print("Ingin menggunakan aplikasi lagi(y/t) \t: ");
            char pilih = masukan.next().charAt(0);

            if (pilih != 'y') {
                jalan = false;
            }
        } while (jalan == true);
    }
}
