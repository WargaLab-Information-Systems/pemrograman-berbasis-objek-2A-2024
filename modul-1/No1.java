class Manusia{
    String nama;
    int umur;
    String alamat;

    void Berjalan(){
        System.out.println(nama + " berumur " + umur + " tahun, asal " + alamat + " sedang berjalan.");
    }

    void Berlari(){
        System.out.println(nama + " berumur " + umur + " tahun, asal " + alamat + " sedang berlari.");
    }
}

public class No1{
    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        orang1.nama = "Ucup";
        orang1.umur = 20;
        orang1.alamat = "Bali";
        orang1.Berjalan();
        orang1.Berlari();
        Manusia orang2 = new Manusia();
        orang2.nama = "Bagas";
        orang2.umur = 20;
        orang2.alamat = "Lombok";
        orang2.Berjalan();
        orang2.Berlari();
        Manusia orang3 = new Manusia();
        orang3.nama = "Handi";
        orang3.umur = 20;
        orang3.alamat = "Madura";
        orang3.Berjalan();
        orang3.Berlari();
    }
}