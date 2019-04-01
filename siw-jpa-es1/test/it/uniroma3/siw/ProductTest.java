
package it.uniroma3.siw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;
	
	@BeforeClass
	public static void initEntityManager() throws Exception {
		emf = Persistence.createEntityManagerFactory("products-unit-test");
		em= emf.createEntityManager();	
	}
	
	@AfterClass
	public static void closeEntityManager() throws SQLException {
		if(em != null)
			em.close();
		if(emf != null)
			emf.close();
	}
	
	@Before
	public void initTransaction() {
		tx= em.getTransaction();
	}
	

	@Test
	public void shouldCreateAproduct() throws Exception {
		// Creates an instance of Product
		Product product = new Product();
		product.setName("SLANGAN");
		product.setCode("4322222222-AA");
		product.setDescription("Bau Bau Bau Bau");
		product.setPrice(138F);
		
		//persists the product to the database
		tx.begin();
		em.persist(product);
		tx.commit();
		assertNotNull("ID should not be null", product.getId());
		//Retrieves all the products from the database
		List<Product> products = em.createNamedQuery("findAllProducts", Product.class).getResultList();
		assertEquals(1, products.size());
		
	}

}