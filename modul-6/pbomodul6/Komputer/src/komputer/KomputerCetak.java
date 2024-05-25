package komputer;

import java.util.ArrayList;
import java.util.Scanner;

final class KomputerCetak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Komputer> devices = new ArrayList<>();

        // Menambahkan perangkat
        System.out.println("Masukkan jumlah perangkat yang ingin ditambahkan:");
        int nomerDevices = scanner.nextInt();
        for (int i = 0; i < nomerDevices; i++) {
            System.out.println("pilih perangkat yang di inginkan: ");
            System.out.println("1. PC");
            System.out.println("2. Laptop");
            System.out.println("3. Netbook");
            int perangkatdipilih = scanner.nextInt();

            switch (perangkatdipilih) {
                case 1:
                    devices.add(new PC());
                    System.out.println("PC ditambahkan ke dalam device.");
                    break;
                case 2:
                    devices.add(new Laptop());
                    System.out.println("Laptop ditambahkan ke dalam device.");
                    break;
                case 3:
                    devices.add(new Netbook());
                    System.out.println("Netbook ditambahkan ke dalam device.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih perangkat yang valid.");
                    i--; // Pilihan tidak valid, ulangi iterasi ini
            }
        }

        // melakukan tindakan dengan perangkat yang dipilih
        for (;;) {
            if (devices.isEmpty()) {
                System.out.println("Tidak ada perangkat yang tersedia. Keluar dari program.");
                break;
            }
            System.out.println("\nPilih perangkat untuk melakukan tindakan:");
            for (int i = 0; i < devices.size(); i++) {
                System.out.println((i + 1) + ". " + devices.get(i).getClass().getSimpleName());
            }
            System.out.println((devices.size() + 1) + ". Keluar");

            int deviceIndex = scanner.nextInt() - 1;

            if (deviceIndex == devices.size()) {
                break; // Keluar dari loop
            } else if (deviceIndex < 0 || deviceIndex >= devices.size()) {
                System.out.println("Pilihan tidak valid. Silakan pilih perangkat yang valid.");
                continue;
            }

            Komputer pilihDevice = devices.get(deviceIndex);

            for (;;) {
                System.out.println("\nPilih tindakan:");
                System.out.println("1. Hidupkan OS");
                System.out.println("2. Matikan OS");
                System.out.println("3. Klik Kanan");
                System.out.println("4. Klik Kiri");
                System.out.println("5. Tekan Enter");
                System.out.println("6. Cetak Data");
                System.out.println("7. Kembali ke pemilihan perangkat");

                int pilihantindakan = scanner.nextInt();

                switch (pilihantindakan) {
                    case 1:
                        pilihDevice.Hidupkan_os();
                        break;
                    case 2:
                        pilihDevice.Matikan_os();
                        System.out.println("Program selesai karena Sistem operasi dimatikan.");
                        scanner.close();
                        return; // Keluar dari program
                    case 3:
                        if (pilihDevice instanceof Mouse) {
                            ((Mouse) pilihDevice).Klik_Kanan();
                        }
                        break;
                    case 4:
                        if (pilihDevice instanceof Mouse) {
                            ((Mouse) pilihDevice).Klik_Kiri();
                        }
                        break;
                    case 5:
                        if (pilihDevice instanceof Keyboard) {
                            ((Keyboard) pilihDevice).Tekan_Enter();
                        }
                        break;
                    case 6:
                        if (pilihDevice instanceof Printer) {
                            ((Printer) pilihDevice).Cetak_Data();
                        }
                        break;
                    case 7:
                        break; // Keluar dari loop tindakan dan kembali ke pemilihan perangkat
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih tindakan yang valid.");
                }
                
                if (pilihantindakan == 7) {
                    break; // Keluar dari loop tindakan
                }
            }
        }

        scanner.close();
    }
}
