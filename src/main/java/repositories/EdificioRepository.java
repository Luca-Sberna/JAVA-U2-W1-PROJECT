package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Edificio;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {

}
