package modul.pkg3;

class Perpustakaan {
    private static String namaPerpustakaan;
    
    static void setNamaPerpustakaan(String nama) {
        namaPerpustakaan = nama;
    }
    
    public String getNamaPerpustakaan(){
        return namaPerpustakaan;
    }
}