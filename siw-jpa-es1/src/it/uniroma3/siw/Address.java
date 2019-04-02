package it.uniroma3.siw;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String street;
	
	@Column(nullable=true)
	private String city;
	
	@Column(nullable=true)
	private String state;
	
	@Column(nullable=true)
	private String zipcode;
	
	@Column(nullable=true)
	private String country;

	public Address () {
		
	}

	public Address (String street, String city, String state, String zipcode, String country) {
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.country=country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
}
