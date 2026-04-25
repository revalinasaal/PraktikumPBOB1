/* Nama File : Mahasiswa.java
 * Deskripsi : kelas Mahasiswa dengan overloading konstruktor dan method setProgramStudi
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class Mahasiswa{

    //atribut
    private String nim;
    private String nama;
    private String programStudi;

    //(c) konstruktor tanpa parameter 
    public Mahasiswa(){
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi ="n/a";
    }

    //(d) konstruktor tiga parameter
    public Mahasiswa(String nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    //(e) konstruktor copy/kloning dari objek Mahasiswa lain
    public Mahasiswa(Mahasiswa lain){
        this.nim = lain.nim;
        this.nama = lain.nama;
        this.programStudi = lain.programStudi;
    }

    //(a) overloading setProgramStudi, varian 1: tanpa parameter
    public void setProgramStudi(){
        this.programStudi = "Kosong";
    }

    //(a) overloading setProgramStudi, varian 2: satu parameter string
    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }

    //(a) overloading setProgramStudi, varian 3: parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa lain){
        this.programStudi = lain.programStudi;
    }

    //getter
    public String getNim(){return nim;}
    public String getNama(){return nama;}
    public String getProgramStudi(){return programStudi;}

    //setter
    public void setNim(String nim) {this.nim = nim;}
    public void setNama(String nama) {this.nama = nama;}

    //tampil data
    public void tampilData(){
        System.out.println("NIM          :" + nim);
        System.out.println("Nama         :" + nama);
        System.out.println("Program Studi:" + programStudi);
    }
}