/* Nama File : MahasiswaSeminar.java
 * Deskripsi : kelas turunan CivitasAkademika yang merepresentasikan mahasiswa dengan NIM dan dosen wali
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class MahasiswaSeminar extends CivitasAkademika{

    //atribut khusus mahasiswa
    private String nim;
    private dosen dosenWali;

    //konstruktor
    public MahasiswaSeminar(String nim, String nama){
        super(nama);
        this.nim = nim;
        this.dosenWali = null;
    }

    //override getNomor, mengembalikan NIM untuk mahasiswa
    @Override
    public String getNomor(){
        return nim;
    }

    //(i) prosedur setWali, mengubah dosen wali mahasiswa
    public void setWali(dosen dosen){
        this.dosenWali = dosen;
    }

    //(j) prosedur tampilDataMahasiswa, menampilkan NIM, nama, dan nama dosen wali
    public void tampilDataMahasiswa(){
        System.out.println("NIM          :" + nim);
        System.out.println("Nama         :" + getNama());
        System.out.println("Dosen Wali   :" + (dosenWali != null ? dosenWali.getNama() : "Belum ditentukan"));
    }

    //getter
    public String getNim() {return nim;}
    public dosen getDosenWali() {return dosenWali;}

    //setter
    public void setNim(String nim) {this.nim = nim;}
}