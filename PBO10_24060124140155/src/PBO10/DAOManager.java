package PBO10;

/* Nama File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 13-05-2026
*/

public class DAOManager{
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}