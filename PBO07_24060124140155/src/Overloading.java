/* Nama File : Overloading.java
 * Deskripsi : program utama untuk menguji overloading pada kelas Mahasiswa
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class Overloading{
    public static void main(String[] args){

        //(c) konstruktor default
        System.out.println("Konstruktor default");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilData();

        //(d) konstruktor tiga parameter
        System.out.println("\nKonstruktor tiga parameter");
        Mahasiswa mhs2 = new Mahasiswa("24060124140132", "Puti Shasta", "Informatika");
        mhs2.tampilData();

        //(e) konstruktor kloning
        System.out.println("\nKonstruktor kloningan");
        Mahasiswa mhs3 = new Mahasiswa(mhs2);
        mhs3.tampilData();

        //(b) overloading setProgramStudi, varian 1: tanpa parameter
        System.out.println("\nsetProgramStudi() tanpa parameter");
        mhs1.setProgramStudi();
        mhs1.tampilData();

        //(b) overloading setProgramStudi, varian 2: satu string
        System.out.println("\nsetProgramStudi(String)");
        mhs1.setProgramStudi("Informatika");
        mhs1.tampilData();

        //(b) overloading setProgramStudi, varian 3: dari objek lain
        System.out.println("\nsetProgramStudi(Mahasiswa)");
        mhs3.setProgramStudi(mhs2);
        mhs3.tampilData();
    }
}