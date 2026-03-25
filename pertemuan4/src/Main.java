/* Nama File : Main.java
 * Deskripsi : main class untuk mencoba objek Persegi dan Lingkaran
 * Pembuat   : Revalina Salwa
 * Tanggal   : 11-3-26
*/

public class Main{
    public static void main(String[] args){

        //buat objek persegi
        Persegi p1 = new Persegi(5, "Pink", "Solid");
        System.out.println("Info Persegi");

        p1.printInfo();
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());
        System.out.println("Diagonal: " + p1.getDiagonal());

        System.out.println();

        //buat objek lingkaran
        Lingkaran l1 = new Lingkaran(10, "Ungu", "Dashed");
        System.out.println("Info Lingkaran");

        l1.printInfo();
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());
        System.out.println("Diameter: " + l1.getDiameter());

        System.out.println();

        BangunDatar.printCounterBangunDatar();
    }
}
