package pkgfinal;

import java.util.Scanner;

public final class Main{
    public void cetak(Komputer[] obj) {
        for (Komputer komputer : obj) {
            komputer.cetakData();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Komputer[] komputers = new Komputer[3];
        komputers[0] = new PC();
        komputers[1] = new Laptop();
        komputers[2] = new Netbook();

        while (true) {
            System.out.println("Pilih komputer (1: PC, 2: Laptop, 3: Netbook):");
            int pilihan = scanner.nextInt() - 1; // Mengubah agar inputan dimulai dari angka 1
            if (pilihan < 0 || pilihan > 2) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }
            Komputer komputer = komputers[pilihan];

            System.out.println("Pilih aksi (1: Hidupkan OS, 2: Matikan OS, 3: Klik Kanan, 4: Klik Kiri, 5: Tekan Enter, 6: Cetak Data):");
            int aksi = scanner.nextInt();

            switch (aksi) {
                case 1:
                    komputer.hidupkanOs();
                    break;
                case 2:
                    komputer.matikanOs();
                    break;
                case 3:
                    komputer.klikKanan();
                    break;
                case 4:
                    komputer.klikKiri();
                    break;
                case 5:
                    komputer.tekanEnter();
                    break;
                case 6:
                    komputer.cetakData();
                    break;
                default:
                    System.out.println("Aksi tidak valid. Silakan coba lagi.");
            }

            // Menanyakan apakah ingin keluar
            System.out.println("Apakah Anda ingin keluar? (y/t):");
            char keluar = scanner.next().charAt(0);
            if (keluar == 'y' || keluar == 'Y') {
                break;
            }
        }
        scanner.close();
    }
}
