/* Nama File : Lingkaran.java
 * Deskripsi : subclass Lingkaran yang mewarisi BangunDatar
 * Pembuat   : Revalina Salwa
 * Tanggal   : 11-3-26
*/

public class Lingkaran extends BangunDatar{

    //atribut
    private double jari;

    //konstruktor kosong
    public Lingkaran(){
        setJmlSisi(0);
    }

    //konstruktor parameter (diameter, warna, border)
    public Lingkaran(double diameter, String warna, String border){
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    //getter
    public double getJari(){
        return jari;
    }

    //setter
    public void setJari(double jari){
        this.jari = jari;
    }

    //method luas
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    //method keliling
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    //method diameter
    public double getDiameter(){
        return 2 * jari;
    }

    //override printInfo
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari:" + jari);
    }
}