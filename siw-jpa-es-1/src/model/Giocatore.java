package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Giocatore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String cognome;
	
	@Column(nullable = false, length = 20)
	private String ruolo;
	
	@Column(nullable = false)
	private int altezza;
	
	@Column(nullable = false)
	private long peso;
	
	@Column(nullable = false)
	private String dataDiNascita;
	
	public Giocatore () {
		
	}
	
	public Giocatore(String nome, String cognome, String dataDiNascita, String ruolo, int altezza,
			Integer peso) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.ruolo = ruolo;
		this.altezza = altezza;
		this.peso = peso;
	}

}
