package latihan;

/* Nama File : Pengusaha.java
 * Deskripsi : subclass Pengusaha dari Manusia
 * Pembuat   : Revalina Salwa
 * NIM       : 24060124140155
 * Tanggal   : 23-3-26
*/

public class Pengusaha extends Manusia{
    //atribut
    private String npwp;
    private static int counterPengusaha = 0;
    private final int B = 5;

    //konstruktor
    public Pengusaha(String nama, java.time.LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //getter counter
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    //hitung pajak
    @Override
    public double hitungPajak(){
        return 0.15*pendapatan;
    }

    //masa kerja
    @Override
    public int hitungMasaKerja(){
        return super.hitungMasaKerja() + B;
    }

    //method cetak info
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP:" + npwp);
    }
}
