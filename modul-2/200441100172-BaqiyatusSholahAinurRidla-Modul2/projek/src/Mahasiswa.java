package projek.src;

public class Mahasiswa {
    String Nama, NIM, Alamat, Prodi;
    static String Univ;

    Mahasiswa(String inputNama, String inputNIM, String inputAlamat, int inputProdi){
        Nama = inputNama;
        NIM = inputNIM;
        Alamat = inputAlamat;
        if (inputProdi == 41) {
            Prodi = "Teknik Informatika";
        }
        else if (inputProdi == 42) {
            Prodi = "Teknik Industri";
        }
        else if (inputProdi == 43) {
            Prodi = "Teknik Elektro";
        }
        else if (inputProdi == 44) {
            Prodi = "Sisten Informasi";
        }
        else if (inputProdi == 48) {
            Prodi = "Teknik Mesin";
        }
        else if (inputProdi == 49) {
            Prodi = "Teknik Mekatronika";
        }
        else{
            Prodi = "Prodi ini tak terdaftar dalam kode angka";
        }

    }

    static void setUniv(String inputUniv){
        Mahasiswa.Univ = inputUniv;
    }

    String getUniv(){
        return Univ;
    }
}
