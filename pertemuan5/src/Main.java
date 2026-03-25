/* Nama File : Main.java
 * Deskripsi : main class untuk menguji abstract class dan interface
 * Pembuat   : Revalina Salwa
 * Tanggal   : 18-3-26
*/

public class Main{
    public static void main(String[] args){

        //objek persegi
        Persegi p1 = new Persegi(5, "Pink", "Solid");

        //objek lingkaran
        Lingkaran l1 = new Lingkaran(10, "Ungu", "Dashed");

        System.out.println("persegi");
        p1.printInfo();
        System.out.println("luas:" + p1.getLuas());

        System.out.println("\nlingkaran");
        l1.printInfo();
        System.out.println("keliling:" + l1.getKeliling());

        System.out.println("\nluas sama?" + p1.isEqualLuas(l1));
        System.out.println("keliling sama?" + p1.isEqualKeliling(l1));

        p1.zoomIn();
        l1.zoomOut();

        System.out.println("\nafter zoom:");
        System.out.println("luas Persegi:" + p1.getLuas());
        System.out.println("keliling lingkaran:" + l1.getKeliling());

        BangunDatar.printCounterBangunDatar();
    }
}