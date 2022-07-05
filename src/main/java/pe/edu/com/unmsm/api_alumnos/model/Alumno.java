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
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String firstName;
    private String lastName;
    private String email;

}
