
package mahasiswa1;

public class objek {
    public String nama, nim, jurusan;
    public int semester;
    
    //constructor
    public objek(){
        nama = "...";
        nim = "...";
        jurusan = "...";
        semester = 0;
        
    }
    
    public objek (String nama, String nim, String jurusan, int semester){
        this.nama=nama;
        this.nim=nim;
        this.jurusan=jurusan;
        this.semester=semester;
    }
    
    //custom
    public void print(){
        System.out.println("Nama = "+ nama +"\nNim = "+ nim + "\nJurusan = "+ jurusan +"\nSemester = "+ semester);
    }

//    //setter
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setNim(String nim) {
//        this.nim = nim;
//    }
//
//    public void setJurusan(String jurusan) {
//        this.jurusan = jurusan;
//    }
//
//    public void setSemester(int semester) {
//        this.semester = semester;
//    }
//    
//    //getter
//    public String getNama(){
//        return nama;
//    }
//
//    public String getNim() {
//        return nim;
//    }
//
//    public String getJurusan() {
//        return jurusan;
//    }
//
//    public int getSemester() {
//        return semester;
//    }
    
    
            
}
