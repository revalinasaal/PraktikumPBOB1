/* Nama File : Seminar.java
 * Deskripsi : kelas yang mengelola daftar peserta seminar dengan kapasitas maksimal 100 orang
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class Seminar{

    //(b) array statis dan atribut banyak peserta
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;
    private static final int KAPASITAS_MAX = 100;

    //konstruktor, inisialisasi banyakPeserta = 0
    public Seminar(){
        pesertas = new CivitasAkademika[KAPASITAS_MAX];
        banyakPeserta = 0;
    }

    //(c) fungsi untuk menghitung jumlah peserta
    public int countPeserta(){
        return banyakPeserta;
    }

    //(d) prosedur registrasi untuk menambahkan peserta secara kontigu
    public void registrasi(CivitasAkademika peserta){
        if (banyakPeserta < KAPASITAS_MAX) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
            System.out.println(peserta.getNama() + "berhasil diregistrasi");
        } else {
            System.out.println("Registrasi gagal, kapasitas seminar sudah penuh");
        }
    }

    //(g) prosedur tampilPeserta untuk menampilkan nomor dan nama semua peserta
    public void tampilPeserta(){
        System.out.println("\nDaftar peserta seminar");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + "[" + pesertas[i].getNomor()+"]" + pesertas[i].getNama());
        }
    }

    //(h) fungsi untuk menghitung peserta yang bertipe MahasiswaSeminar
    public int countMahasiswa(){
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++){
            if (pesertas[i] instanceof MahasiswaSeminar){
                jumlah++;
            }
        }
        return jumlah;
    }
}