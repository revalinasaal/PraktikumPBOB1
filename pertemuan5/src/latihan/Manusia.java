package latihan;

/* Nama File : Manusia.java
 * Deskripsi : superclass abstract untuk data manusia
 * Pembuat   : Revalina Salwa
 * NIM       : 24060124140155
 * Tanggal   : 23-3-26
*/

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia{
    //atribut
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    //konstruktor
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //setter alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //getter counter
    public static int getCounterMns(){
        return counterMns;
    }

    //masa kerja
    public int hitungMasaKerja(){
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears();
    }

    //abstract method pajak
    public abstract double hitungPajak();

    //cetak info
    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}