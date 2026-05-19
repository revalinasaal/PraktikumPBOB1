package PBO10;

/* Nama File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 13-05-2026
*/

import java.io.*;

//class Person
class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
}

//class SerializePerson
public class SerializePerson{
    public static void main(String[] args){
        Person person = new Person("Panji");

        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}