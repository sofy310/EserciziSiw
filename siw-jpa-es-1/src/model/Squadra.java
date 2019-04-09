package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Squadra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String allenatore;
	
	private int anno;
	
	
	/*la strategia di fetch di tipo EAGER fa sì che gli elementi collegati vengano creati subito.
	 * in questo caso va utilizzata questa strategia di fetch perchè ogni volta che si crea una squadra sono richiesti i nomi dei suoi giocatori. */
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "squadra")
	private List<Giocatore> giocatori;
	
	
	public Squadra() {
		
	}

	public Squadra(Long id, String nome, String allenatore, int anno, List<Giocatore> giocatori) {
		this.id = id;
		this.nome = nome;
		this.allenatore = allenatore;
		this.anno = anno;
		this.giocatori = giocatori;
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

	public String getAllenatore() {
		return allenatore;
	}

	public void setAllenatore(String allenatore) {
		this.allenatore = allenatore;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public List<Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(List<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}
	
	

}
