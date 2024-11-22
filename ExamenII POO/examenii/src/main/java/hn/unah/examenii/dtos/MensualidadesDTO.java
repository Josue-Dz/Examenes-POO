package hn.unah.examenii.dtos;

import java.time.LocalDate;

import hn.unah.examenii.modelos.Condominios;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MensualidadesDTO {

    private int idMensualidades;

    private double monto;

    private char estado;

    private LocalDate fechaPago;

    private Condominios condominios;

}
