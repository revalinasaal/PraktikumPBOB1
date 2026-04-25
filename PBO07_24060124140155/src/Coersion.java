/* Nama File : Coersion.java
 * Deskripsi : polimorfisme ad hoc coersion untuk konversi antar tipe data
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 25-4-26
*/

public class Coersion{
    public static void main(String[] args){

        //(a) Ilustrasi konversi tipe dasar
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;

        System.out.println("(a) Konversi tipe dasar");
        System.out.println("Sebagai integer :" + nilaiInt);
        System.out.println("Sebagai karakter:" + nilaiChar);
        System.out.println("Sebagai real    :" + nilaiDouble);

        //(b) Nilai real dikembalikan ke integer dalam variabel berbeda
        System.out.println("\n(b) Real kembali ke integer");
        double real = 65.9;
        int kembaliInt = (int) real;
        System.out.println("Nilai real   :"+real);
        System.out.println("Kembali int  :"+kembaliInt);

        //(c) String X dan Y, konkatenasi S, penjumlahan Z
        System.out.println("\n(c) String ke integer");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S (konkatenasi X+Y) =" + S);
        System.out.println("Z (penjumlahan X+Y) =" + Z);

        //(d) String P dan Q, konkatenasi R, penjumlahan D
        System.out.println("\n(d) String ke Double");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("P =" + P);
        System.out.println("Q =" + Q);
        System.out.println("R (konkatenasi P+Q) ="+R);
        System.out.println("D (penjumlahan P+Q) ="+D);

        //(e) Integer A dari konversi nilai S
        System.out.println("\n(e) Integer A dari S");
        Integer A = Integer.parseInt(S);
        System.out.println("A =" + A);

        //(f) String T dari konversi nilai A
        System.out.println("\n(f) String T dari A");
        String T = A.toString();
        System.out.println("T = " + T);
    }
}