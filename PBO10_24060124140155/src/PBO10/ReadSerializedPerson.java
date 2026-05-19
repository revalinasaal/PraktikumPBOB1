package PBO10;

/* Nama File : ReadSerializedPerson.java
 * Deskripsi : Program untuk membaca objek Person yang sudah terserialisasi
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 12-05-2026
*/

import java.io.*;

public class ReadSerializedPerson{
    public static void main(String[] args){
        Person person = null;

        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe){
            ioe.printStackTrace();
        }
    }
}