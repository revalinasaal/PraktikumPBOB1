/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik public class Titik 
 * Pembuat   : Revalina Salwa
 * Tanggal   : 19-02-26
*/

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis Tl dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat Tl dengan nilai 4
        T1.printTitik(); //mencetak koordinat Tl ke layar
        T1.geser (3,4); //menggeser Tl sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat Tl setelah digeser
    }
}