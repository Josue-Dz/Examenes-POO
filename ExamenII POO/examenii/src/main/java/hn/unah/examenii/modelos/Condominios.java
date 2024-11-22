package hn.unah.examenii.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "condominios")
public class Condominios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numerocondominio")
    private String numeroCondominio;

    private int nivel;

    private double area;

    private String color;

    private int parqueos;

    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    @JsonIgnore
    private Duenios duenios;

}
