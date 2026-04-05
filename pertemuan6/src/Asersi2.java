/* Nama File  : Asersi2.java
 * Deskripsi  : Program untuk demo asersi, yang akan menolak input
 *              jari-jari lingkaran yang bernilai nol
 * Pembuat    : Revalina Salwa
 * NIM        : 24060124140155
 * Tanggal    : 26-03-2026
 */

// class Lingkaran
class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* JAWAB PERTANYAAN */
/* Secara konsep, ada yang kurang tepat pada program Asersi2. Jelaskan!*/
/*Yang kurang tepat adalah penggunaan asersi di sini sebenernya kurang sesuai. Karena asersi itu seharusnya dipakai buat ngecek kondisi yang 
  "seharusnya tidak mungkin terjadi" bukan untuk validasi input dari user. Pada program Asersi2, jariJari = 0 itu ditulis langsung seperti itu saja di dalam program, 
   kemudian di bawahnya di-assert jariJari > 0. Nah ini kontradiktif karena programmer sendiri yang nulis nilainya 0, terus di-assert harus lebih dari 0. 
   Harusnya kalau mau validasi input seperti ini, pakai eksepsi (IllegalArgumentException misalnya), bukan asersi. */
