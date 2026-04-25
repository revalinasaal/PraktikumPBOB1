/* Nama File : Burung.java
 * Deskripsi : kelas turunan Anabul yang merepresentasikan burung 
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class Burung extends Anabul{

    //konstruktor
    public Burung(String nama){
        super(nama);
    }

    //override gerak, burung bergerak dengan terbang
    @Override
    public void gerak(){
        System.out.println(getNama()+"bergerak dengan terbang");
    }

    // override bersuara, burung berbunyi cuit
    @Override
    public void bersuara(){
        System.out.println(getNama()+"berbunyi Cuit");
    }
}