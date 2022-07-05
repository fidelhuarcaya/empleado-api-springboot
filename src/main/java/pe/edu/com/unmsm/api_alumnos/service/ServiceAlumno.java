package pe.edu.com.unmsm.api_alumnos.service;

import pe.edu.com.unmsm.api_alumnos.model.Alumno;

import java.util.List;
import java.util.Optional;

public interface ServiceAlumno {
    Alumno insertAlumno(Alumno alumno);
    void deleteAlumno(Long id);
    List<Alumno> getAllAlumnos();
    Alumno updateAlumno(Alumno alumno);
    Optional<Alumno> getAlumno(Long id);

}
