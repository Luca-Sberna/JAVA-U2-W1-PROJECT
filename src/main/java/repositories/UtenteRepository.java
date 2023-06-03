package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Utente;

public interface UtenteRepository extends JpaRepository<Utente, String> {

}
