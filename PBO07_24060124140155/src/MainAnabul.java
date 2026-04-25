/* Nama File : MainAnabul.java
 * Deskripsi : program utama untuk menjalankan bunyi dan gerakan semua jenis anabul
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class MainAnabul{
    public static void main(String[] args){

        //membuat array polimorfik superclass Anabul
        Anabul[] daftarAnabul ={
            new Kucing("Molly"),
            new Kucing("Molla"),
            new Anjing("Tomat"),
            new Anjing("Choco"),
            new Burung("Loney")
        };

        System.out.println("Simulasi semua anabul\n");

        //polimorfisme bekerja saat runtime menentukan method yang dipanggil
        for (Anabul a : daftarAnabul) {
            System.out.println("---" + a.getNama() + "("+ a.getClass().getSimpleName() +")---");
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }
}