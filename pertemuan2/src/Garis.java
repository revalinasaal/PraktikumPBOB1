/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Revalina Salwa
 * Tanggal   : 01-03-26
*/

public class Garis{
/******ATRIBUT******/
Titik titikAwal;
Titik titikAkhir;
static int counterGaris = 0;

/******METHOD******/
//konstruktor
Garis(){
    titikAwal = new Titik(0,0);
    titikAkhir = new Titik(1,1);
    counterGaris++;
}

//konstruktor dengan parameter
Garis(Titik A, Titik B){
    titikAwal = A;
    titikAkhir = B;
    counterGaris++;
}

//mengembalikan titik awal
Titik getTitikAwal(){
    return titikAwal;
}

//mengembalikan titik akhir
Titik getTitikAkhir(){
    return titikAkhir;
}

//mengembalikan jumlah objek garis
static int getCounterGaris(){
    return counterGaris;
}

//mengeset titik awal
void setTitikAwal(Titik t){
    titikAwal = t;
}

//mengeset titik akhir
void setTitikAkhir(Titik t){
    titikAkhir = t;
}

//hitung panjang garis
double getPanjang(){
    return Math.sqrt(titikAwal.getJarak(titikAkhir));
}

//hitung gradien garis
double getGradien(){
    return (titikAkhir.getordinat() - titikAwal.getordinat()) /
           (titikAkhir.getAbsis() - titikAwal.getAbsis());
}

//hitung titik tengah
Titik getTitikTengah(){
    double x = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
    double y = (titikAwal.getordinat() + titikAkhir.getordinat())/2;
    return new Titik(x,y);
}

//cek apakah sejajar
boolean isSejajar(Garis G){
    return this.getGradien() == G.getGradien();
}

//cek apakah tegak lurus
boolean isTegakLurus(Garis G){
    return this.getGradien()*G.getGradien() == -1;
}

//menampilkan garis
void printGaris(){
    System.out.println("Garis dari");
    titikAwal.printTitik();
    System.out.println("ke");
    titikAkhir.printTitik();
}

//menampilkan persamaan garis
String persamaanGaris(){
    double m = getGradien();
    double c = titikAwal.getordinat() - m*titikAwal.getAbsis();
    return "y = " + m + "x + " + c;
}

} //end class Garis