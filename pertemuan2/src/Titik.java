/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik public class Titik 
 * Pembuat   : Revalina Salwa
 * Tanggal   : 25-02-26
*/

public class Titik{
/******ATRIBUT******/ 
double absis; 
double ordinat;
static int counterTitik = 0;

/******METHOD******/ 
//konstruktor untuk membuat titik (0,0)
Titik(){
absis = 0;
ordinat = 0;
counterTitik++;
}

Titik(double x, double y){
    absis = x;
    ordinat = y;
    counterTitik++;
}

//mengembalikan nilai absis 
double getAbsis(){
    return absis;
}

//mengembalikan nilai ordinat
double getordinat(){
   return ordinat;
}

//mengembalikan jumlah objek titik
static int getCounterTitik(){
   return counterTitik;
}

//mengeset absis titik dengan nilai baru × 
void setAbsis (double x){
   absis = x;
}

//mengeset ordinat titik dengan nilai baru y 
void setOrdinat (double y){
   ordinat = y;
}

//menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
void geser (double x, double y){
   absis = absis + x;
   ordinat = ordinat + y;
}

//mencetak koordinat titik 
void printTitik(){
   System.out.println("Titik (" + absis + "," + ordinat + ")");
} 

//mengembalikan kuadran titik
int getKuadran(){
    if(absis > 0 && ordinat > 0){
        return 1;
    } else if(absis < 0 && ordinat > 0){
        return 2;
    } else if(absis < 0 && ordinat < 0){
        return 3;
    } else if(absis > 0 && ordinat < 0){
        return 4;
    } else{
        return 0;
    }
}

//menghitung jarak titik ke pusat (0,0) 
double getJarakPusat(){
    return absis*absis + ordinat*ordinat;
}

//menghitung jarak ke titik
double getJarak(Titik T){
    return (absis - T.absis)*(absis - T.absis) +
           (ordinat - T.ordinat)*(ordinat - T.ordinat);
}

//merefleksikan titik terhadap sumbu X
void refleksiX(){
    ordinat = -ordinat;
}

//merefleksikan titik terhadap sumbu Y
void refleksiY(){
    absis = -absis;
}

//mengembalikan titik hasil refleksi sumbu X
Titik getRefleksiX(){
    return new Titik(absis, -ordinat);
}

//mengembalikan titik hasil refleksi sumbu Y
Titik getRefleksiY(){
    return new Titik(-absis, ordinat);
}

} //end class Titik