/* Nama File : CivitasAkademika.java
 * Deskripsi : superclass abstrak yang merepresentasikan anggota civitas akademika
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public abstract class CivitasAkademika{

    //atribut
    private String nama;

    //konstruktor
    public CivitasAkademika(String nama){
        this.nama = nama;
    }

    //method abstrak, implementasi berbeda di Dosen (NIP) dan Mahasiswa (NIM)
    public abstract String getNomor();

    //getter
    public String getNama() {return nama;}

    //setter
    public void setNama(String nama) {this.nama = nama;}
}