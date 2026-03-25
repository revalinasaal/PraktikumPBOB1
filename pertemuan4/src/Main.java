/* Nama File : Main.java
 * Deskripsi : main class untuk mencoba objek Persegi dan Lingkaran
 * Pembuat   : Revalina Salwa
 * Tanggal   : 11-3-26
*/

public class Main{
    public static void main(String[] args){

        //buat objek persegi
        Persegi p1 = new Persegi(5, "Merah", "Solid");
<<<<<<< HEAD
        System.out.println("Info Persegi");
=======
        System.out.println("=== Info Persegi ===");
>>>>>>> 518ca69e13275c9251f8293c6904646323cb2b8e
        p1.printInfo();
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());
        System.out.println("Diagonal: " + p1.getDiagonal());

        System.out.println();

        //buat objek lingkaran
        Lingkaran l1 = new Lingkaran(10, "Biru", "Dashed");
<<<<<<< HEAD
        System.out.println("Info Lingkaran");
=======
        System.out.println("=== Info Lingkaran ===");
>>>>>>> 518ca69e13275c9251f8293c6904646323cb2b8e
        l1.printInfo();
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());
        System.out.println("Diameter: " + l1.getDiameter());

        System.out.println();

        //print counter total objek bangun datar
        BangunDatar.printCounterBangunDatar();
    }
}