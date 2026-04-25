/* Nama File : Kucing.java
 * Deskripsi : kelas turunan Anabul yang merepresentasikan kucing
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class Kucing extends Anabul{

    //konstruktor
    public Kucing(String nama){
        super(nama);
    }

    //override gerak,kucing bergerak dengan melata
    @Override
    public void gerak(){
        System.out.println(getNama() + "bergerak dengan melata");
    }

    //override bersuara, kucing berbunyi meong
    @Override
    public void bersuara(){
        System.out.println(getNama()+"berbunyi Meong");
    }
}