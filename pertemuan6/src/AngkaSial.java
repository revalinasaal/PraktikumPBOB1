/* Nama File  : AngkaSial.java
 * Deskripsi  : Program penggunaan exception buatan sendiri,
 *              pengenalan klausa 'throw' dan 'throws'
 * Pembuat    : Revalina Salwa
 * NIM        : 24060124140155
 * Tanggal    : 26-03-2026
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* JAWAB PERTANYAAN */
/* Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
   Apakah baris 21 pada AngkaSial.java di atas dieksekusi? Jelaskan pada lembar praktikum anda */
/* Jawabannya tidak, karena baris 12 itu berisi javaSystem.out.println(angka + " bukan angka sial");
   sehingga waktu cobaAngka(13) dipanggil, program masuk ke if(angka==13) lalu langsung throw eksepsi kemudian program langsung 
   keluar dari method tanpa sempat ke baris 12. Jadi baris 12 dilewati begitu saja.
  "Apakah baris 21 dieksekusi?" Jawabannya iya, karena, baris 21 itu adalah blok catch dimana, java} catch(AngkaSialException ase) {
   Karena eksepsi memang terjadi (waktu masukkan angka 13), maka blok catch ini pasti dieksekusi, justru di sinilah eksepsi itu 
  "ditangkap" dan diproses. Program lalu mencetak pesan dari ase.getMessage() dan "hati-hati memasukkan angka!!!" */