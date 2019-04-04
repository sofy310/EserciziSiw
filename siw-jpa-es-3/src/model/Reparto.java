package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@OneToMany(mappedBy="reparto")
	private List <Prodotto> prodotti;
	
	@ManyToMany
	private List <Magazziniere> magazzinieri;

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

	
	public Reparto() {
	
		
	}
	public Reparto(Long id, String nome, int piano) {
		this.id = id;
		this.nome = nome;
		this.piano = piano;
	}
	
	
	
	

}
