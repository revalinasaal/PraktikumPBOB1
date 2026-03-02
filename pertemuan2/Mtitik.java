package pertemuan2;

/* Nama File : Mtitik.java
 * Deskripsi : program utama class Titik
 * Pembuat   : Revalina Salwa
 * Tanggal   : 25-02-26
*/

public class Mtitik{
    public static void main(String[] args){

        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)

        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        System.out.println("Kuadran T1 = " + T1.getKuadran()); //menampilkan kuadran
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat()); //jarak ke (0,0)
        Titik T2 = new Titik(-2,5); //membuat objek titik T2
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2)); //jarak antar titik

        T1.refleksiX(); //refleksi terhadap sumbu X
        T1.printTitik();
        T1.refleksiY(); //refleksi terhadap sumbu Y
        T1.printTitik();

        Titik T3 = T1.getRefleksiX(); //objek baru refleksi X
        T3.printTitik();
        Titik T4 = T1.getRefleksiY(); //objek baru refleksi Y
        T4.printTitik();
        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik()); //counter objek
    }
}