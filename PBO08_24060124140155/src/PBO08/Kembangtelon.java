package PBO08;
/* Nama File : kwmbangtelon.java
 * Deskripsi : Subkelas Kembangtelon yang merupakan jenis kucing dengan implementasi metode gerak() dan bersuara() sesuai karakteristik kucing Kembangtelon.
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 1-5-26
*/

public class Kembangtelon extends Kucing{
    public Kembangtelon(String nama, double bobot){
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + "berjalan santai");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + "berbunyi meong keras");
    }
}