package hn.unah.examenii.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examenii.modelos.Duenios;

@Repository
public interface DueniosRepositorio extends JpaRepository<Duenios, String> {

}
