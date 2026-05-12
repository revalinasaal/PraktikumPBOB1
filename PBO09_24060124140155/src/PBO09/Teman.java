package PBO09;

/* Nama File : Teman.java
 * Deskripsi : Kelas koleksi List untuk menyimpan nama-nama teman
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 12-05-2026
*/

import java.util.ArrayList;
import java.util.List;

public class Teman{

    //atribut
    private int nbelm;
    private List<String> Lnama;

    //konstruktor 
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    //getNbelm 
    public int getNbelm(){
        return nbelm;
    }

    //getNama 
    public String getNama(int indeks){
        if (indeks < 0 || indeks >= nbelm){
            return null;
        }
        return Lnama.get(indeks);
    }

    //setNama 
    public void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < nbelm){
            Lnama.set(indeks, nama);
        }
    }

    //addNama 
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm = nbelm + 1;
    }

    //delNama 
    public void delNama(String nama){
        if (Lnama.contains(nama)){
            Lnama.remove(nama);
            nbelm = nbelm - 1;
        }
    }

    //isMember 
    public boolean isMember(String nama){
        for (String n : Lnama){
            if (n.equals(nama)){
                return true;
            }
        }
        return false;
    }

    //gantiNama 
    public void gantiNama(String nama, String namabaru){
        for (int i = 0; i < nbelm; i++){
            if (Lnama.get(i).equals(nama)){
                Lnama.set(i, namabaru);
            }
        }
    }

    //countNama 
    public int countNama(String nama){
        int hitung = 0;
        for (String n : Lnama){
            if (n.equals(nama)){
                hitung = hitung + 1;
            }
        }
        return hitung;
    }

    //showTeman 
    public void showTeman(){
        System.out.println("Daftar teman (" + nbelm + " orang):");
        for (int i = 0; i < nbelm; i++){
            System.out.println("  " + (i + 1) + ". " + Lnama.get(i));
        }
    }
}