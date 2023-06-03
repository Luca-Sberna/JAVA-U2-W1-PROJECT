package entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import utils.TipoPostazione;

@Entity
@Table(name = "Postazioni")
@Data
public class Postazione {
	@Id
	private String codice;
	private String descrizione;
	private TipoPostazione tipo;
	private int maxOccupanti;

	@ManyToOne
	private Edificio edificio;

	@OneToMany(mappedBy = "postazione")
	private List<Prenotazione> prenotazioni;
}
