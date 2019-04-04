package it.uniroma3.siw;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.ManyToMany;

@Entity
@NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p")

public class Product {
	
	/*@Id specifica che l'attributo è un identificatore: una chiave primaria del database*/
	@Id
	/*@GeneratedValue specifica in che modo deve essere generato il valore della chiave primaria.
	 * strategy = GenerationType.AUTO indica che la chiave deve essere generata automaticamente.*/
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/*@Column specifica proprietà sulla colonna che corrisponde all'attributo che segue*/
	@Column(nullable = false)
	private String name;
	private float price;
	
	@Column(length = 2000)
	private String description;
	
	/*unique = true esprime il vincolo di unicità di un attributo (semplice)*/
	@Column(unique = true, nullable = false)
	private String code;
	

	public Product(String name, Float price, String description, String code) {
		this .name = name;
		this .price = price;
		this .description = description;
		this .code = code;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Float getPrice() {
		return this.price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean equals(Object obj) {
		Product product = (Product)obj;
		return this.getCode().equals(product.getCode());
	}
	
	public int hashCode() {
		return this.code.hashCode();
	}
	
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Product");
		sb.append("id= ").append(id);
		sb.append(", name= ").append(name);
		sb.append(", description= ").append(description);
		sb.append(", code= ").append(code);
		sb.append(".");
		
		return sb.toString();
	}

	public Product() {
	
	}
	
	@ManyToMany(mappedBy = "products")
	private List<Provider> providers;
	
	
}
