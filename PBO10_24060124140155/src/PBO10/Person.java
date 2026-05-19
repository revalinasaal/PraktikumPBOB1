package PBO10;

import java.io.Serializable;

/* Nama File : Person.java
 * Deskripsi : Person database model
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 13-05-2026
*/

public class Person implements Serializable{

    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}