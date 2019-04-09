package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Divisione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String descrizione;
	
	@OneToMany(mappedBy = "divisione", fetch = FetchType.EAGER)
	private List<Impiegato> impiegati;
	
	public Divisione() {
		
	}

	public Divisione(Long id, String nome, String descrizione) {
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	

}
