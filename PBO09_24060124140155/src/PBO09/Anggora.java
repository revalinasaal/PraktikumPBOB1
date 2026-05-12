package PBO09;

/* Nama File : Anggora.java
 * Deskripsi : Subkelas Anggora turunan Kucing
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 6-05-2026
*/

public class Anggora extends Kucing{

    //konstruktor
    public Anggora(String nama, String panggilan, double bobot){
        super(nama, panggilan, bobot);
    }

    //cara bergerak
   @Override
    public void gerak(){
        System.out.println(nama + "berjalan dengan anggun");
    }

    //suara 
    @Override
    public void bersuara(){
        System.out.println(nama + "berbunyi meong lembut");
    }

    @Override
    public void tampilInfo(){
        System.out.println("Anggora - Nama: " + nama + ", Panggilan: " + panggilan + ", Bobot: " + bobot + " kg");
    }
}