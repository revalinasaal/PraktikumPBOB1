/* Nama File : dosen.java
 * Deskripsi : kelas turunan CivitasAkademika yang merepresentasikan dosen dengan atribut NIP
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class dosen extends CivitasAkademika{

    //atribut khusus dosen
    private String nip;

    //konstruktor
    public dosen(String nip, String nama){
        super(nama);
        this.nip = nip;
    }

    //override getNomor, mengembalikan NIP untuk dosen
    @Override
    public String getNomor(){
        return nip;
    }

    //getter
    public String getNip() {return nip;}

    //setter
    public void setNip(String nip) {this.nip = nip;}
}