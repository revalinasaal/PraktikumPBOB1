package PBO09;
/* Nama File : Kucing.java
 * Deskripsi : Subkelas Kucing turunan Anabul
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 6-5-2026
*/

public class Kucing extends Anabul{
    //atribut
    protected double bobot;

    //method

    //konstruktor dengan parameter
    public Kucing(String nama, String panggilan, double bobot){
        super(nama, panggilan);
        this.bobot = bobot;
    }

    //getter 
    public double getBobot(){ 
        return bobot; 
    }
    //setter
    public void setBobot(double bobot){
         this.bobot = bobot; 
        }

    //cara bergerak
    @Override
    public void gerak(){
        System.out.println(nama + " berjalan dengan melata");
    }

    //suara
    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi meong");
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama + ", Panggilan: " + panggilan + ", Bobot: " + bobot + " kg");
    }
}