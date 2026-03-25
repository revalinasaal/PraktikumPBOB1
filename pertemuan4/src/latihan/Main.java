package latihan;

/* Nama File : Main.java
 * Deskripsi : class utama atau main untuk menjalankan program
 * Pembuat   : Revalina Salwa Aliya W.P
 * Tanggal   : 16-3-26
*/

public class Main {
    public static void main(String[] args){

        
        DosenTetap a = new DosenTetap(
            "9545647548", "Andi", "5 Mei 1990",
            "1 Januari 2015", 5000000,
            "78647324", "Fakultas Sains dan Matematika"
        );

        DosenTamu b = new DosenTamu(
            "02062006", "Rafif", "2 Juni 1993",
            "5 Januari 2016", 3000000,
            "151515", "Fakultas Ilmu Komputer"
        );

        Tendik c = new Tendik(
           "15032005", "alex", "10 Mei 1992",
           "20 Januari 2018", 2000000,
           "Akademik"
        );

        a.printInfo();
        System.out.println();

        b.printInfo();
        System.out.println();

        c.printInfo();
    }
}