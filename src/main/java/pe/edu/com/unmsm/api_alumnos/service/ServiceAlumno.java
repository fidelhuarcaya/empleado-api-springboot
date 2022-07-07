package pe.edu.com.unmsm.api_alumnos.service;

import pe.edu.com.unmsm.api_alumnos.model.Trabajador;

import java.util.List;
import java.util.Optional;

public interface ServiceAlumno {
    Trabajador insertAlumno(Trabajador trabajador);
    void deleteAlumno(Long id);
    List<Trabajador> getAllAlumnos();
    Trabajador updateAlumno(Trabajador trabajador);
    Optional<Trabajador> getAlumno(Long id);

}
