package pe.edu.com.unmsm.api_alumnos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            timezone = "America/Lima", pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    @CreationTimestamp
    private LocalDateTime fechaRegistro;

}
