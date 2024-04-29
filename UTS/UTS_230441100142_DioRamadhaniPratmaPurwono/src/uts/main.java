package uts;
        
class uts {
    protected String  nama;
    protected String  nim;
    protected String  asalsekolah;
    protected String  tanggallahir;
    protected String  prodi;
    protected String  alamat;
    
public  uts(String nama, String nim, String asalsekolah, String tanggallahir, String prodi, String alamat){
    this.nama = nama;
    this.nim = nim;
    this.asalsekolah = asalsekolah;
    this.tanggallahir = tanggallahir;
    this.prodi = prodi;
    this.alamat = alamat;
}
public void displayData(){
    System.out.println("Nama:" + nama);
    System.out.println("Nama:" + nim);
    System.out.println("Asal sekolah:" + asalsekolah);
    System.out.println("Tanggal Lahir:" + tanggallahir);
    System.out.println("Prodi:" + prodi);
    System.out.println("Alamat:" + alamat);
    
}
}

     
