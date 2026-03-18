/* Nama File : BangunDatar.java
 * Deskripsi : superclass yang berisi atribut dan method dasar bangun datar
 * Pembuat   : Revalina Salwa
 * Tanggal   : 11-3-26
*/

public class BangunDatar{

    //atribut
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    //konstruktor kosong
    public BangunDatar(){
        counterBangunDatar++;
    }

    //konstruktor parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //getter
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    //setter
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    //print info
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    //method static counter
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}