/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author User
 */
public class prodi extends mahasiswa{
    String Prodi;
    
    public prodi (String Prodi){
        this.Prodi= Prodi;
    }
    
    public String getProdi(){
        switch (Prodi){
            case "SI":
                return "Sistem Informasi";
            case "TIF":
                return "Teknik Informatika";
            case "TI":
                return "Teknik Industri";
            case "TM":
                return "Teknik Mesin";
            case "TMK":
                return "Teknik Mekatronika";
            case "TE":
                return "Teknik Elektronika";
                        
        }
        return null;
    }
    
    
}
