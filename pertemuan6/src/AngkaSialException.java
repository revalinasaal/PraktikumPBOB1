/* Nama File  : AngkaSialException.java
 * Deskripsi  : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat    : Revalina Salwa
 * NIM        : 24060124140155
 * Tanggal    : 26-03-2026
 */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}