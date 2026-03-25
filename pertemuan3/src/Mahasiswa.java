/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Revalina Salwa
 * Tanggal   : 4-3-26
*/

public class Mahasiswa{

/*************** ATRIBUT *****************/
    private String nim;
    private String nama;
    private String prodi;

    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;

    private Dosen dosenWali;
    private Kendaraan kendaraan;

/*************** METHOD *****************/
    //konstruktor tanpa parameter
    public Mahasiswa(){}

    //konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    //setter
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mk){
        if(jumlahMatKul < 50){
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    //getter
    public int getJumlahMatKul(){
        return jumlahMatKul;
    }

    public int getJumlahSKS(){
        int total = 0;
        for(int i=0;i<jumlahMatKul;i++){
            total += listMatKul[i].getSks();
        }
        return total;
    }

    //tampilkan
    public void printDetailMhs(){

        System.out.println("Nim:" + nim);
        System.out.println("Nama:" + nama);
        System.out.println("Prodi:" + prodi);

        for(int i=0;i<jumlahMatKul;i++){
            System.out.println(listMatKul[i].getNama());
        }

        System.out.println("Dosen Wali:" + dosenWali.getNama());

        if(kendaraan != null){
            System.out.println("Kendaraan:" + kendaraan.getJenis()+" " + kendaraan.getNoPlat());
        }
    }
}