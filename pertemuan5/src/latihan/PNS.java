package latihan;

/* Nama File : PNS.java
 * Deskripsi : subclass PNS dari Manusia
 * Pembuat   : Revalina Salwa
 * NIM       : 24060124140155
 * Tanggal   : 23-3-26
*/

public class PNS extends Manusia{
    //atribut
    private String nip;
    private static int counterPNS = 0;
    private final int A = 5;

    //konstruktor
    public PNS(String nama, java.time.LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //konstruktor tanpa alamat
    public PNS(String nama, java.time.LocalDate tglMulaiKerja, double pendapatan, String nip){
        super(nama, tglMulaiKerja, "-", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //getter counter
    public static int getCounterPNS(){
        return counterPNS;
    }

    //hitung pajak
    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    //masa kerja
    @Override
    public int hitungMasaKerja(){
        return super.hitungMasaKerja() + A;
    }

    //method cetak info
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP:" + nip);
    }
}
