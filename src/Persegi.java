/* Nama File : Persegi.java
 * Deskripsi : subclass Persegi yang dari BangunDatar dan mengimplementasi IResize
 * Pembuat   : Revalina Salwa
 * Tanggal   : 18-3-26
*/

public class Persegi extends BangunDatar implements IResize{

    //atribut
    private double sisi;

    //konstruktor kosong
    public Persegi(){
        setJmlSisi(4);
    }

    //konstruktor parameter
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    //getter
    public double getSisi(){
        return sisi;
    }

    //setter
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    //method luas
    public double getLuas(){
        return sisi * sisi;
    }

    //method keliling
    public double getKeliling(){
        return 4 * sisi;
    }

    //method diagonal
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }
    //implementasi zoomIn
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    //implementasi zoomOut
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    //override printInfo
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}