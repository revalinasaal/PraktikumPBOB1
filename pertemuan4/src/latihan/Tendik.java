package latihan;

/* Nama File : Tendik.java
 * Deskripsi : class untuk tendik turunan dari Pegawai
 * Pembuat   : Revalina Salwa Aliya
 * Tanggal   : 16-3-26
*/

class Tendik extends Pegawai{
    String bidang;

    Tendik(String nip, String nama, String tglLahir, String tmt, double gaji, String bidang){
        super(nip, nama, tglLahir, tmt, gaji);
        this.bidang = bidang;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang :" + bidang);

        int masaKerja = 10;
        double tunjangan = 0.01*masaKerja*gaji;

        System.out.println("Masa Kerja :" + masaKerja + "tahun");
        System.out.println("Gaji Pokok : Rp" + gaji);
        System.out.println("Tunjangan : Rp" + tunjangan);
    }
}