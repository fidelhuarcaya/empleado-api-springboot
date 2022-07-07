package pe.edu.com.unmsm.api_alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.com.unmsm.api_alumnos.model.Trabajador;

@Repository
public interface RepositoryAlumno extends JpaRepository<Trabajador, Long> {
}
