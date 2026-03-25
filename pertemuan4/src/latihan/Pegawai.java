package latihan;

/* Nama File : Pegawai.java
 * Deskripsi : superclass untuk semua jenis pegawai
 * Pembuat   : Revalina Salwa A
 * Tanggal   : 16-3-26
*/

class Pegawai{
    String nip, nama, tglLahir, tmt;
    double gaji;

    Pegawai(String nip, String nama, String tglLahir, String tmt, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gaji = gaji;
    }

    void printInfo(){
        System.out.println("NIP :" + nip);
        System.out.println("Nama :" + nama);
        System.out.println("Tanggal Lahir :" + tglLahir);
        System.out.println("TMT :" + tmt);
    }
}
