package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	private LocalDate dataInizio;
	
	private LocalDate dataFine;
	
	private int oreComplessive;
	
	@ManyToMany
	private List<Allievo> allievi;
	
	@ManyToMany
	private List<Docente> docenti;
	
	@OneToOne(mappedBy = "corso")
	private Docente docenteResponsabile;
	
	@ManyToOne
	private Sede sede;
	
	public Corso() {
		
	}

	public Corso(Long id, String nome, String cognome, LocalDate dataInizio, LocalDate dataFine, int oreComplessive,
			List<Allievo> allievi, List<Docente> docenti, Docente docenteResponsabile, Sede sede) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.oreComplessive = oreComplessive;
		this.allievi = allievi;
		this.docenti = docenti;
		this.docenteResponsabile = docenteResponsabile;
		this.sede = sede;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	public int getOreComplessive() {
		return oreComplessive;
	}

	public void setOreComplessive(int oreComplessive) {
		this.oreComplessive = oreComplessive;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public List<Docente> getDocenti() {
		return docenti;
	}

	public void setDocenti(List<Docente> docenti) {
		this.docenti = docenti;
	}

	public Docente getDocenteResponsabile() {
		return docenteResponsabile;
	}

	public void setDocenteResponsabile(Docente docenteResponsabile) {
		this.docenteResponsabile = docenteResponsabile;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	
	
}
