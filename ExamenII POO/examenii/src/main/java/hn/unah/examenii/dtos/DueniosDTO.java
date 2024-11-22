package hn.unah.examenii.dtos;

import java.util.List;

import hn.unah.examenii.modelos.Condominios;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DueniosDTO {

    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    private List<Condominios> condominios;

}
