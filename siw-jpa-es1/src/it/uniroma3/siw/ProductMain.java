package it.uniroma3.siw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*L'EntityManager è un gestore delle entità, una classe istanza a cui vengono affidate le operazioni di persistenza.
 * Il ruolo dell'EntityManager è quello di gestire le operazioni di persistenza delle entità: interagire con il database
 * per effettuare le operazioni CRUD sulle entità.*/

public class ProductMain {
	
	public static void main(String[] args) {
		
		/*L'EntityManager è creato per mezzo della factory EntityManagerFactory*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
		EntityManager em = emf.createEntityManager();
		
		Product product = new Product();
		product.setName("KRIDDIG");
		product.setPrice(3.5F);
		product.setDescription("A wonderful product");
		product.setCode("pt000154");
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(product);
		tx.commit();
		
		em.close();
		emf.close();
		
	}
}
