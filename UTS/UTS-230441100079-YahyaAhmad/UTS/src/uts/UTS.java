package uts;
import java.util.Scanner;
import java.util.ArrayList;


public class UTS {
    public static void main(String[] args) {
        String nama, nim, asal_sekolah, tanggal_lahir, prodi, alamat;
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> namaList = new ArrayList<>();
        
        System.out.print("Berapa data yang akan diinput: ");
        int jumlahulangi = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < jumlahulangi; i++) {
            ArrayList<String> innerList = new ArrayList<>();
            
            System.out.println("============================");
            System.out.print("Masukkan Nama: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = scanner.nextLine();
            System.out.print("Masukkan Asal Sekolah: ");
            asal_sekolah = scanner.nextLine();
            System.out.print("Masukkan Tanggal Lahir: ");
            tanggal_lahir = scanner.nextLine();
            System.out.print("Masukkan Prodi: ");
            prodi = scanner.nextLine();
            System.out.print("Masukkan Alamat: ");
            alamat = scanner.nextLine();
            
            
            if (prodi.equalsIgnoreCase("SI")) {
                prodi = "Sistem Informasi";
            } else if (prodi.equalsIgnoreCase("TIF")) {
                prodi = "Teknik Informatika";
            } else if (prodi.equalsIgnoreCase("TI")) {
                prodi = "Teknik Industri";
            } else if (prodi.equalsIgnoreCase("TM")) {
                prodi = "Teknik Mesin";
            } else if (prodi.equalsIgnoreCase("TMK")) {
                prodi = "Teknik Mekatronika";
            } else if (prodi.equalsIgnoreCase("Te")) {
                prodi = "Teknik Elektronika";
            }
            
            innerList.add(nama);
            innerList.add(nim);
            innerList.add(asal_sekolah);
            innerList.add(tanggal_lahir);
            innerList.add(prodi);
            innerList.add(alamat);

            namaList.add(innerList);
            
            tampilan2 tampilan2 = new tampilan2();
        
        for (ArrayList<String> list : namaList) {
            tampilan2.untukTapilan1(
                list.get(0),
                list.get(1), 
                list.get(2),
                list.get(3),
                list.get(4),
                list.get(5)
            );
        }
        scanner.close();
        }     
    }  
}
