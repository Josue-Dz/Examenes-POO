package hn.unah.examenii.servicios;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examenii.dtos.CondominiosDTO;
import hn.unah.examenii.dtos.DueniosDTO;
import hn.unah.examenii.modelos.Condominios;
import hn.unah.examenii.modelos.Duenios;
import hn.unah.examenii.repositorios.DueniosRepositorio;

@Service
public class DueniosServicio {

    private static ModelMapper modelMapper;

    public ModelMapper getModelMapper() {
        if (modelMapper == null) {
            modelMapper = new ModelMapper();
        }

        return modelMapper;
    }

    @Autowired
    private DueniosRepositorio duenioRepositorio;

    private String insertar(DueniosDTO dueniosDTO) {

        if (this.duenioRepositorio.existsById(dueniosDTO.getDni())) {
            return "Ya existe un duenio registrado con este id: ";
        }

        Duenios duenio = this.getModelMapper().map(dueniosDTO, Duenios.class);
        this.duenioRepositorio.save(duenio);
        return "Duenio agregado exitosamente";
    }

    private DueniosDTO buscarPorId(String dni) {

        if (!this.duenioRepositorio.existsById(dni)) {
            return null;
        }

        return null;
    }

    private List<DueniosDTO> obtenerTodos() {

        List<Duenios> listaDuenios = this.duenioRepositorio.findAll();
        List<DueniosDTO> listaDueniosDTO = new ArrayList<>();
        DueniosDTO dueniosDTO;

        for (Duenios duenio : listaDuenios) {
            dueniosDTO = this.getModelMapper().map(duenio, DueniosDTO.class);
        
            List<Condominios> listaCondominios = duenio.getCondominios();
            CondominiosDTO condominioDTO;
            List<CondominiosDTO> listaCondominiosDTO = new ArrayList<>();
            for (Condominios condominio : listaCondominios) {
               
                condominioDTO = this.getModelMapper().map(condominio, CondominiosDTO.class);
                listaCondominiosDTO.add(condominioDTO);
            }
           // dueniosDTO.setCondominios(listaCondominiosDTO);
        }

        if()
    }

}
