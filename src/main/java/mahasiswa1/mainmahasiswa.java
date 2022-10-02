/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa1;
import java.io.*;

public class mainmahasiswa {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        objek o = new objek();
        objek j = new objek("Diva Putri Yulianda", "21410100053", "SI", 3);
        
        o.print();
        System.out.println();
        j.print();
        
//        o.setNama("Diva Putri Yulianda");
//        o.setNim("214101000053");
//        o.setJurusan("SI");
//        o.setSemester(3);
//        
//        System.out.println("Nama = "+ o.getNama() +"\nNim = "+ o.getNim() + "\nJurusan = "+ o.getJurusan() +"\nSemester = "+ o.getSemester());
//        
    }

    
}
