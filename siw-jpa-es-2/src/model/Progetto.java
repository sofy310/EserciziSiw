package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Progetto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private LocalDate dataInizio;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "progetto")
	private List<Impiegato> impiegati;
	
	public Progetto() {
		
	}

	public Progetto(Long id, String nome, LocalDate dataInizio) {
		this.id = id;
		this.nome = nome;
		this.dataInizio = dataInizio;
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

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	
	

}
