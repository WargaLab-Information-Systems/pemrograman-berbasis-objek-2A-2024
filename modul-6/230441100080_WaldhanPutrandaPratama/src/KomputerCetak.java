import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class KomputerCetak {
    public void cetak(List<Komputer> obj) {
        for (Komputer komputer : obj) {
            komputer.cetak_data();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KomputerFactory factory = new KomputerFactory();
        List<Komputer> komputerList = new ArrayList<>();

        System.out.println("Masukkan jumlah komputer:");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan tipe komputer (PC/Laptop/Netbook):");
            String type = scanner.nextLine();
            Komputer komputer = factory.createKomputer(type);
            if (komputer != null) {
                komputerList.add(komputer);
            } else {
                System.out.println("Tipe komputer tidak dikenal. Silakan coba lagi.");
                i--; 
            }
        }

        for (Komputer komputer : komputerList) {
            System.out.println("Pilih operasi untuk komputer tipe " + komputer.getClass().getSimpleName() + " :");
            System.out.println("1. Hidupkan OS");
            System.out.println("2. Matikan OS");
            System.out.println("3. Klik Kanan");
            System.out.println("4. Klik Kiri");
            System.out.println("5. Tekan Enter");
            System.out.println("6. Cetak Data");
            System.out.print("Masukkan pilihan (1-6): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    komputer.hidupkan_os();
                    break;
                case 2:
                    komputer.matikan_os();
                    break;
                case 3:
                    komputer.klik_kanan();
                    break;
                case 4:
                    komputer.klik_kiri();
                    break;
                case 5:
                    komputer.tekan_enter();
                    break;
                case 6:
                    komputer.cetak_data();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
