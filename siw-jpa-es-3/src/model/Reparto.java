package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Reparto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private int piano;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "reparto_fk")
	private List <Magazziniere> magazzinieri;
	
	@OneToMany(mappedBy = "reparto", fetch = FetchType.LAZY)
	private List<Prodotto> prodotti;
	

	
	public Reparto() {
	
		
	}
	
	public Reparto(Long id, String nome, int piano) {
		this.id = id;
		this.nome = nome;
		this.piano = piano;
	}
	
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

	public int getPiano() {
		return piano;
	}

	public void setPiano(int piano) {
		this.piano = piano;
	}

	public List<Magazziniere> getMagazzinieri() {
		return magazzinieri;
	}

	public void setMagazzinieri(List<Magazziniere> magazzinieri) {
		this.magazzinieri = magazzinieri;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}


	
	
	

}
