package model;

import javax.persistence.*;

@Entity
public class Prodotto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private int quantità;
	
	private String descrizione;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Prodotto() {
		
	}

	public Prodotto(Long id, String nome, int quantità, String descrizione) {
		this.id = id;
		this.nome = nome;
		this.quantità = quantità;
		this.descrizione = descrizione;
	}
	
	
	
}
