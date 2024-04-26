public class Perpustakaan {
    String[] arrjudul = new String[100];
    String[] arrpenulis = new String[100];
    String[] arrpublisher = new String[100];
    String[] arrkategori = new String[100];
    int[] arrstok = new int[100];
    String[] arrtahun = new String[100];
    int a;

    public void SimpanBuku(String judul, String penulis, String publisher, String kategori, int stok, String tahun, int i) {
        a = i;
        arrjudul[a] = null;
        arrpenulis[a] = null;
        arrpublisher[a] = null;
        arrkategori[a] = null;
        arrstok[a] = 0;
        arrtahun[a] = null;
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
                System.out.println("Tidak Ada Buku");
                break;
            }
        }
    }
}
