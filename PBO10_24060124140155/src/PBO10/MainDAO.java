package PBO10;

/* Nama File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 13-05-2026
*/

public class MainDAO{
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try{
            m.getPersonDAO().savePerson(person);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}