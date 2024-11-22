package hn.unah.examenii.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examenii.modelos.Mensualidades;

@Repository
public interface MensualidadesRepositorio extends JpaRepository<Mensualidades, Integer> {

}
