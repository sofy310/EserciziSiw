package model;

import javax.persistence.*;

public class StrutturaMain {
	
	public static void main (String [] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercizio3");
		EntityManager em = emf.createEntityManager();
		
		emf.close();
		em.close();
	
	}

}
