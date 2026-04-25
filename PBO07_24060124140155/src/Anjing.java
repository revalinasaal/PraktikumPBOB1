/* Nama File : Anjing.java
 * Deskripsi : kelas turunan Anabul yang merepresentasikan anjing
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class Anjing extends Anabul{

    //konstruktor
    public Anjing(String nama){
        super(nama);
    }

    // override gerak, anjing bergerak dengan melata
    @Override
    public void gerak(){
        System.out.println(getNama()+"bergerak dengan melata");
    }

    // override bersuara, anjing berbunyi guk-guk
    @Override
    public void bersuara(){
        System.out.println(getNama()+"berbunyi Guk-guk");
    }
}