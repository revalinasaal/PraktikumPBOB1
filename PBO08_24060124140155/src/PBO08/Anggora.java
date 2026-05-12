package PBO08;
/* Nama File : Anggora.java
 * Deskripsi : Subkelas Anggora yang merupakan jenis kucing dengan implementasi metode gerak() dan bersuara() sesuai karakteristik kucing Anggora.
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 1-5-26
*/

public class Anggora extends Kucing{
    public Anggora(String nama, double bobot){
        super(nama, bobot);
    }

    @Override
    public void gerak(){
        System.out.println(nama + " berjalan dengan anggun");
    }

    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi meong lembut");
    }
}