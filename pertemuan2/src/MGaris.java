/* Nama File : MGaris.java
 * Deskripsi : program utama class Garis
 * Pembuat   : Revalina Salwa
 * Tanggal   : 01-03-26
*/

public class MGaris{
    public static void main(String[] args){

        Titik A = new Titik(0,0); //membuat titik A
        Titik B = new Titik(4,4); //membuat titik B

        Garis G1 = new Garis(A,B); //membuat garis G1 dari titik A ke B

        G1.printGaris(); //menampilkan garis G1

        System.out.println("Panjang G1 =" + G1.getPanjang()); //menampilkan panjang garis
        System.out.println("Gradien G1 =" + G1.getGradien()); //menampilkan gradien garis

        Titik tengah = G1.getTitikTengah(); //mencari titik tengah
        System.out.print("Titik tengah =");
        tengah.printTitik(); //menampilkan titik tengah

        System.out.println("Persamaan garis =" + G1.persamaanGaris()); //menampilkan persamaan garis

        Garis G2 = new Garis(new Titik(1,2), new Titik(5,6)); //membuat garis G2

        System.out.println("Apakah sejajar =" + G1.isSejajar(G2)); //cek sejajar
        System.out.println("Apakah tegak lurus =" + G1.isTegakLurus(G2)); //cek tegak lurus

        System.out.print("Titik awal = "); //menampilkan getter titik awal
        G1.getTitikAwal().printTitik();
        System.out.print("Titik akhir = "); //menampilkan getter titik akhir
        G1.getTitikAkhir().printTitik();

        System.out.println("Jumlah objek garis =" + Garis.getCounterGaris()); //menampilkan jumlah objek garis
    }
}