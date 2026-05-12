package PBO09;

/* Nama File : Piaraan.java
 * Deskripsi : Kelas koleksi antrian Anabul untuk klinik hewan
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 6-05-2026
*/

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan{

    //atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;

    //konstruktor
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    //getNbelm 
    public int getNbelm(){
        return nbelm;
    }

    //enqueueAnabul 
    public void enqueueAnabul(Anabul anabul){

        Lanabul.add(anabul);
        nbelm = nbelm + 1;
    }

    //isMember 
    public boolean isMember(Anabul anabul){
        for (Anabul a : Lanabul){
            if (a == anabul){
                return true;
            }
        }
        return false;
    }

    //getAnabul 
    public Anabul getAnabul(){
        if (nbelm == 0) return null;
        return Lanabul.peek();
    }

    //dequeueAnabul 
    public Anabul dequeueAnabul(){
        if (nbelm == 0) return null;
        nbelm = nbelm - 1;
        return Lanabul.poll();
    }

    //showAnabul 
    public void showAnabul(){
        System.out.println("Antrian anabul (" + nbelm + " hewan):");
        int urut = 1;
        for (Anabul a : Lanabul){
            System.out.println("  " + urut + ". " + a.getPanggilan());
            urut = urut + 1;
        }
    }

    //countKucing
    public int countKucing(){
        int jumlah = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                jumlah = jumlah + 1;
            }
        }
        return jumlah;
    }

    //bobotKucing
    public double bobotKucing(){
        double total = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                total = total + ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    //showJenisAnabul 
    public void showJenisAnabul(){
        System.out.println("Antrian anabul beserta jenisnya:");
        int urut = 1;
        for (Anabul a : Lanabul) {
            System.out.println("  " + urut + ". " + a.getPanggilan()
                    + " [" + a.getClass().getSimpleName() + "]"
                    + " - " + a.getClass().getName());
            urut = urut + 1;
        }
    }
}