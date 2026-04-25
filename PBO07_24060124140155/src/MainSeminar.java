/* Nama File : MainSeminar.java
 * Deskripsi : program utama untuk menguji kelas Seminar, Dosen, dan MahasiswaSeminar
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class MainSeminar{
    public static void main(String[] args){

        //(e) membuat 2 objek dosen
        dosen dosen1 = new dosen("191234567891011001", "Dr. Galang Bintang, M.Kom.");
        dosen dosen2 = new dosen("191213141516171002", "Dr. Silvani Salsabilla, M.T.");

        //(e) membuat 5 objek mahasiswa
        MahasiswaSeminar mhs1 = new MahasiswaSeminar("24060124140132", "Puti Shasta");
        MahasiswaSeminar mhs2 = new MahasiswaSeminar("24060124130001", "Olive Oktaviani");
        MahasiswaSeminar mhs3 = new MahasiswaSeminar("24060124130002", "Alyssa Shane");
        MahasiswaSeminar mhs4 = new MahasiswaSeminar("24060124140145", "Aprillia Abel");
        MahasiswaSeminar mhs5 = new MahasiswaSeminar("24060124140155", "Revalina Salwa Aliya");

        //membuat objek seminar
        Seminar seminar = new Seminar();

        //(f) registrasi semua peserta
        System.out.println("Registrasi Peserta");
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);

        //(c) tampil jumlah peserta
        System.out.println("\nJumlah peserta:" + seminar.countPeserta());

        //(g) tampil daftar peserta
        seminar.tampilPeserta();

        //(h) tampil jumlah peserta mahasiswa
        System.out.println("\nJumlah peserta mahasiswa:" + seminar.countMahasiswa());

        //(i) setWali menetapkan dosen wali untuk setiap mahasiswa
        System.out.println("\nMenetapkan Dosen Wali");
        mhs1.setWali(dosen1);
        mhs2.setWali(dosen1);
        mhs3.setWali(dosen2);
        mhs4.setWali(dosen2);
        mhs5.setWali(dosen1);
        System.out.println("Dosen wali berhasil ditetapkan");

        //(j) tampil data mahasiswa beserta dosen wali
        System.out.println("\nData Lengkap Mahasiswa");
        MahasiswaSeminar[] daftarMhs = {mhs1, mhs2, mhs3, mhs4, mhs5};
        for (MahasiswaSeminar m : daftarMhs){
            m.tampilDataMahasiswa();
            System.out.println();
        }
    }
}