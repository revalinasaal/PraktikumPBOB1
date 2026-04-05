package latihan;

/* Nama File : DosenTamu.java
 * Deskripsi : class untuk dosen tamu turunan dari Pegawai
 * Pembuat   : Revalina Salwa A.W.P
 * Tanggal   : 16-3-26
*/

class DosenTamu extends Pegawai{
    String nidk, fakultas;

    DosenTamu(String nip, String nama, String tglLahir, String tmt, double gaji, String nidk, String fakultas){
        super(nip, nama, tglLahir, tmt, gaji);
        this.nidk = nidk;
        this.fakultas = fakultas;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("NIDK :" + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas :" + fakultas);

        double tunjangan = 0.025* gaji;

        System.out.println("Gaji Pokok : Rp " + gaji);
        System.out.println("Tunjangan : Rp " + tunjangan);
    }
}