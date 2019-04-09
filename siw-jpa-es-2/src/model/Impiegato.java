package model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Impiegato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long matricola;
	
	private String nome;
	
	private String cognome;
	
	private LocalDate dataDiNascita;
	
	@ManyToOne
	private Divisione divisione;
	
	public Impiegato() {
		
	}

	public Impiegato(Long matricola, String nome, String cognome, LocalDate dataDiNascita) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	public Long getMatricola() {
		return matricola;
	}

	public void setMatricola(Long matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	
	
	

}
