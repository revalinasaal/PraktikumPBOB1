package PBO09;

/* Nama File : Kembangtelon.java
 * Deskripsi : Subkelas Kembangtelon turunan Kucing
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 6-05-2026
*/

public class Kembangtelon extends Kucing{

    //konstruktor
    public Kembangtelon(String nama, String panggilan, double bobot){
        super(nama, panggilan, bobot);
    }

    //cara bergerak 
    @Override
    public void gerak(){
        System.out.println(nama + "berjalan santai");
    }

    //suara 
    @Override
    public void bersuara(){
        System.out.println(nama + "berbunyi meong keras");
    }

    @Override
    public void tampilInfo(){
        System.out.println("Kembangtelon - Nama: " + nama + ", Panggilan: " + panggilan + ", Bobot: " + bobot + " kg");
    }
}