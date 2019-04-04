package model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Docente docenteResponsabile;
	
	@ManyToMany
	private List <Allievo> allievi;
	
	@ManyToMany
	private List <Docente> docentiDiAula;
	
	@ManyToOne
	private Sede sede;

}
