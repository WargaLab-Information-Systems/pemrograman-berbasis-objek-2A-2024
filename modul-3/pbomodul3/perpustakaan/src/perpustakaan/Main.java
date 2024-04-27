/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;
import java.util.Scanner;
import java.util.ArrayList;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String judulbuku, penulis, publisher, kategori;
        String stok, tahun;  
        Scanner input = new Scanner(System.in);
        ArrayList <ArrayList<String>> namaList = new ArrayList<>();
        ArrayList<String> innerList = new ArrayList<>();
        System.out.println("Masukkan berapa buku yang ingin dicari : ");
        int repeat = input.nextInt();
        input.nextLine();
        
        for (int i = 0;i<repeat;i++){
            System.out.println("judul buku");
            judulbuku = input.nextLine();
            System.out.println("Masukkan nama penulis: ");
            penulis = input.nextLine();
            System.out.println("Masukkan nama publisher: ");
            publisher = input.nextLine();
            System.out.println("Masukkan kategori judul buku: ");
            kategori = input.nextLine();
            System.out.println("Masukkan stok : ");
            stok = input.nextLine();
            System.out.println("Masukkan tahunterbit: ");
            tahun = input.nextLine();
            
            if (kategori.equals("SU")){
               kategori = "SEMUA UMUR";
            }
            else if (kategori.equals("D")){
                kategori = "DEWASA";
            }
            else if (kategori.equals("R")) {
                kategori = "REMAJA";
            }
            else if (kategori.equals("A")) {
                kategori = "ANAK-ANAK";
            }

            innerList.add(judulbuku);
            innerList.add(penulis);
            innerList.add(publisher);
            innerList.add(kategori);
            innerList.add(stok);
            innerList.add(tahun);
            namaList.add(innerList);   
        }
        
        output display = new output();
        tampilan display1 = new tampilan(); 
        for (int i = 0;i<namaList.size();i++){
            for (int j = 0;j<1;j++){
                String inijudul = namaList.get(i).get(j);
                String inipenulis = namaList.get(i).get(j+1);
                String inipublisher = namaList.get(i).get(j+2);
                String inikategori = namaList.get(i).get(j+3);
                String inistok = namaList.get(i).get(j+4);
                String initahunterbit = namaList.get(i).get(j+5);
                
                display1.listbuku(inijudul, inipenulis, inipublisher, inikategori, inistok, initahunterbit);    
            }
        }
    }   
}
