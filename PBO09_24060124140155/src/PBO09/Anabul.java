package PBO09;

/* Nama File : Anabul.java
 * Deskripsi : merepresentasikan hewan peliharaan (anabul)
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 06-05-26
*/

public abstract class Anabul{

    //atribut
    protected String nama;
    protected String panggilan;

    //konstruktor
    public Anabul(String nama, String panggilan){
        this.nama = nama;
        this.panggilan = panggilan;
    }

    //method abstrak
    public abstract void gerak();
    public abstract void bersuara();

    //getter & setter nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    //getter & setter panggilan
    public String getPanggilan(){
        return panggilan;
    }
    public void setPanggilan(String panggilan){
        this.panggilan = panggilan;
    }
}