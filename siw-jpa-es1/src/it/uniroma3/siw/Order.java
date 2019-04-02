package it.uniroma3.siw;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id //specifica che l'attributo è un identificatore (una chiave primaria del db).
	@GeneratedValue(strategy=GenerationType.AUTO) //indica che la chiave deve essere generata automaticamente
	private Long id;
	
	@Column(nullable=false) //indica che la colonna non deve avere attributi nulli
	private LocalDate creationTime;

	
	/*è un'associazione bidirezionale
	 * l'annotazione ManyToOne si trova nella classe proprietaria, quindi in questa classe, perchè contiene la foreign key
	 * l'annotazione OneToMany si trova nella classe inversa, in questo caso nella classe Customer*/
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	/*Di default crea una nuova tabella definita come Orders_OrderLine mentre con il JoinColumn (nome identità + _ + chiave identità)creerò un FK dentro la tabella puntata*/
	@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	
	@JoinColumn(name="orders_id")
	private List <OrderLine> orderlines;
	
	public Order () {
		
	}
	
	public Order (LocalDate creationTime) {
		this.creationTime=creationTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalDate creationTime) {
		this.creationTime = creationTime;
	}
}
