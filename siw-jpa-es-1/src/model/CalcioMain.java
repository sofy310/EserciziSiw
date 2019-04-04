
package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CalcioMain {
	
	public static void main (String args []) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercizio1");
	EntityManager em = emf.createEntityManager();
	
	emf.close();
	em.close();
	}
}