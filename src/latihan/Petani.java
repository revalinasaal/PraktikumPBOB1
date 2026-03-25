package latihan;

/* Nama File : Petani.java
 * Deskripsi : subclass Petani dari Manusia
 * Pembuat   : Revalina Salwa
 * NIM       : 24060124140155
 * Tanggal   : 23-3-26
*/

public class Petani extends Manusia{
    //atribut
    private String lokasi;
    private static int counterPetani = 0;
    private final int C = 1;

    //konstruktor
    public Petani(String nama, java.time.LocalDate tglMulaiKerja, String alamat, double pendapatan, String lokasi){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.lokasi = lokasi;
        counterPetani++;
    }

    //getter counter
    public static int getCounterPetani(){
        return counterPetani;
    }

    //hitung pajak
    @Override
    public double hitungPajak(){
        return 0;
    }

    //masa kerja
    @Override
    public int hitungMasaKerja(){
        return super.hitungMasaKerja() + C;
    }

    //method cetak info
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("lokasi:" + lokasi);
    }
}