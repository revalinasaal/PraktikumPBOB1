package PBO09;

/* Nama File : MainKoleksi.java
 * Deskripsi : Aplikasi utama untuk mendemonstrasikan kelas Teman dan Piaraan
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 6-05-2026
*/

public class MainKoleksi{
    public static void main(String[] args){

        //KOLEKSI TEMAN
        System.out.println("--KOLEKSI KELAS TEMAN--");
    
        Teman teman = new Teman();

        //addNama 
        teman.addNama("Puti");
        teman.addNama("Alyssa");
        teman.addNama("Rafif");
        teman.addNama("Galang");
        teman.addNama("Oliv"); 

        //showTeman
        teman.showTeman();
        System.out.println();

        //getNbelm
        System.out.println("jumlah teman: " + teman.getNbelm());

        //getNama
        System.out.println("nama indeks ke 3 :" + teman.getNama(2));

        //setNama
        teman.setNama(2, "Rafif Setya");
        System.out.println("setelah setNama indeks 3 jadi 'Rafif Setya'");
        System.out.println("nama indeks ke 3 sekarang: " + teman.getNama(2));

        //delNama
        teman.delNama("Galang");
        System.out.println("setelah delNama 'Galang'");
        teman.showTeman();
        System.out.println();

        //isMember
        System.out.println("apakah 'Puti' ada? " + teman.isMember("Puti"));
        System.out.println("apakah 'Alyssa' ada? " + teman.isMember("Alyssa"));

        //gantiNama
        teman.gantiNama("Oliv", "Olivia");
        System.out.println("setelah gantiNama 'Oliv' -> 'Olivia'");
        teman.showTeman();
        System.out.println();

        //countNama 
        System.out.println("jumlah 'Puti' dalam list : " + teman.countNama("Puti"));

        //koleksi
        System.out.println("--KOLEKSI KELAS PIARAAN--");

        //objek anabul
        Anggora Molly        = new Anggora("Molly", "Mowi", 4.5);
        Kembangtelon Molla   = new Kembangtelon("Molla", "Mol", 3.5);
        Kucing Tomat         = new Kucing("Tomat", "Nomat", 4.0);
        Anggora Kopita       = new Anggora("Kopita", "Kupii", 3.1);
        Kucing Nomi          = new Kucing("Nomi", "Nom", 3.8);
        Kembangtelon Mento   = new Kembangtelon("Mento", "mentow", 3.2);

        Piaraan klinik = new Piaraan();

        //enqueueAnabul 
        klinik.enqueueAnabul(Tomat);
        klinik.enqueueAnabul(Molly);
        klinik.enqueueAnabul(Nomi);
        klinik.enqueueAnabul(Molla);
        klinik.enqueueAnabul(Kopita);
        klinik.enqueueAnabul(Mento);

        //getNbelm
        System.out.println("jumlah anabul dalam antrian: " + klinik.getNbelm());

        //showAnabul
        System.out.println("\ndaftar anabul dalam antrian:");
        klinik.showAnabul();

        //isMember
        System.out.println("\napakah Tomat kucing oyen ada di antrian?" + klinik.isMember(Tomat));

        //getAnabul 
        System.out.println("\nanabul paling depan: "
                + klinik.getAnabul().getPanggilan());
        System.out.println("jumlah anabul masih: " + klinik.getNbelm());

        //dequeueAnabul 
        Anabul dipanggil = klinik.dequeueAnabul();
        System.out.println("\nanabul yang dipanggil masuk: " + dipanggil.getPanggilan());
        System.out.println("sisa antrian sekarang: " + klinik.getNbelm());
        System.out.println("antrian setelah dequeue:");
        klinik.showAnabul();

        //countKucing
        System.out.println("\njumlah keluarga kucing dalam antrian: " + klinik.countKucing());

        //bobotKucing
        System.out.println("total bobot keluarga kucing:"+ klinik.bobotKucing() + " kg");

        //showJenisAnabul
        System.out.println("\ntampil jenis setiap anabul:");
        klinik.showJenisAnabul();
    }
}