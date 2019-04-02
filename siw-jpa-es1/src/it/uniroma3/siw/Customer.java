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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false, unique=true)
	private String firstName;
	
	@Column(nullable=false, unique=true)
	private String lastName;
	
	@Column(nullable=true)
	private String email;
	
	@Column(nullable=false)
	private LocalDate dateOfBirth;
	
	//Unidirezionale - OneToOne è settato di default dal file persistence e quindi riportato nel db
	//Fetch EAGER (impaziente) vengonono caricati sul db subito anche gli oggetti associati
	//Cascade.persist aggiunge la tabella associata, Cascade.remove la rimuove completamente dal db e dal controllo dell'EM
	@OneToOne (fetch=FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	//E' settato di default nelle associazioni unidirezionali. Nome tabella puntata + _ + chiave primaria tabella puntata
	@JoinColumn(name="address_id")
	private Address address;
	
	/*E' un'associazione bidirezionale. 
	 * la parte prioritaria è quella che contiene la foreign key, in questo caso è la classe Order
	 * la parte inversa è questa classe*/
	@OneToMany(mappedBy="customer", fetch=FetchType.LAZY) //mapped-by=attributo della parte proprietaria che implementa l'associazione
	private List<Order> orders;
	
	public Customer () {
		
	}
	
	public Customer (String firstName, String lastName, String email, LocalDate dateOfBirth) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.dateOfBirth=dateOfBirth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}