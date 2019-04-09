package model;

import javax.persistence.*;

public class SistemaMain {

	public static void main(String [] Args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercizio2");
		EntityManager em = emf.createEntityManager();
		
		emf.close();
		em.close();
	}
}
