package pe.edu.com.unmsm.api_alumnos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Trabajador {

    @Id
    @GeneratedValue
    private Long id;

    private String codven;
    private String Nomven;
    private String Distven;
    private String MONTO;

}
