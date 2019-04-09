package model;

import javax.persistence.*;

public class AziendaMain {

	public static void main(String [] Args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercizio4");
		EntityManager em = emf.createEntityManager();
		
		emf.close();
		em.close();
	}
}
