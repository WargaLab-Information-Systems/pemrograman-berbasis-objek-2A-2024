public class Buku extends Perpustakaan {

    public void SimpanBuku(String judul, String penulis, String publisher, String kategori, int stok, String tahun, int stok2, int i) {
                a = i;
                arrjudul[a] = judul;
                arrpenulis[a] = penulis;
                arrpublisher[a] = publisher;
                arrkategori[a] = kategori;
                arrstok[a] = stok;
                arrtahun[a] = tahun;
    }

    public void Tampil() {
        for(int i = 0; i < arrjudul.length; i++){
            if(arrjudul[i] != null){
                System.out.println();
                System.out.print("Buku " + (i+1));
                System.out.print(" Judul : " + arrjudul[i]);     
                System.out.print(" Penulis : " + arrpenulis[i]);    
                System.out.print(" Publisher : " + arrpublisher[i]);  
                System.out.print(" Kategori : " + arrkategori[i]);   
                System.out.print(" Stok : " + arrstok[i]);       
                System.out.print(" Tahun Terbit : " + arrtahun[i]);
            }
            else{
                break;
            }
        }
    }
}
