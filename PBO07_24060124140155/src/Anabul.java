/* Nama File : Anabul.java
 * Deskripsi : merepresentasikan hewan peliharaan (anabul)
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public abstract class Anabul{

    //atribut
    private String nama;

    //konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    //method abstrak, wajib di-override oleh kelas anak
    public abstract void gerak();
    public abstract void bersuara();

    //getter
    public String getNama(){return nama;}

    //setter
    public void setNama(String nama){this.nama = nama;}
}
