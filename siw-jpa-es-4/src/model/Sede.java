package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Sede {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String indirizzo;
	
	@OneToMany(mappedBy = "sede")
	private List<Corso> corsi;
	
	public Sede() {
		
	}

	public Sede(Long id, String nome, String indirizzo, List<Corso> corsi) {
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.corsi = corsi;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	
	
	
}
