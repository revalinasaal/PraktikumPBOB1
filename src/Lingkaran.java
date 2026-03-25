/* Nama File : Lingkaran.java
 * Deskripsi : subclass Lingkaran yang dari BangunDatar dan mengimplementasi IResize
 * Pembuat   : Revalina Salwa
 * Tanggal   : 18-3-26
*/

public class Lingkaran extends BangunDatar implements IResize{

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

    //implementasi zoomIn
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    //implementasi zoomOut
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    //override printInfo
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari:" + jari);
    }
}