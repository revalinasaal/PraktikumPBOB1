package latihan;

/* Nama File : DosenTetap.java
 * Deskripsi : class untuk dosen tetap turunan dari Pegawai
 * Pembuat   : Revalina Salwa
 * Tanggal   : 16-3-26
*/

class DosenTetap extends Pegawai{
    String nidn, fakultas;

    DosenTetap(String nip, String nama, String tglLahir, String tmt, double gaji, String nidn, String fakultas){
        super(nip, nama, tglLahir, tmt, gaji);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("NIDN :" + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas :" + fakultas);

        int masaKerja = 10;
        double tunjangan = 0.02*masaKerja*gaji;

        System.out.println("Masa Kerja :" + masaKerja + " tahun");
        System.out.println("Gaji Pokok : Rp" + gaji);
        System.out.println("Tunjangan : Rp" + tunjangan);
    }
}
