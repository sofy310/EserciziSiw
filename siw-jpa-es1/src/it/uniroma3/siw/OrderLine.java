package it.uniroma3.siw;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine {
	
	@Id //indice che l'attributo sarà una chiave primaria del database
	@GeneratedValue(strategy=GenerationType.AUTO) //indica in che modo la chiave primaria deve essere generata
	private Long id;
	
	@Column(nullable=false)
	private String item;
	
	@Column(nullable=true)
	private Double unitPrice;
	
	@Column(nullable=false)
	private Integer quantity;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Product product;
	
	public OrderLine() {
		
	}
	
	public OrderLine(String item, Double unitPrice, Integer quantity) {
		this.item=item;
		this.unitPrice=unitPrice;
		this.quantity=quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
